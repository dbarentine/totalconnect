package com.barentine.api;

import com.barentine.api.enums.ArmType;
import com.barentine.api.exceptions.InvalidParameter;
import com.barentine.api.exceptions.NotImplementedYet;
import com.barentine.api.exceptions.TotalConnectException;
import com.barentine.totalconnect.TotalConnect;
import com.barentine.totalconnect.ws.ArmSecuritySystemResults;
import com.barentine.totalconnect.ws.LocationInfoBasic;
import com.barentine.totalconnect.ws.SessionDetailResults;
import com.google.common.base.Strings;
import org.eclipse.jetty.http.HttpHeader;
import org.eclipse.jetty.http.HttpStatus;
import spark.HaltException;
import spark.Request;
import spark.Route;

import java.nio.charset.Charset;
import java.util.Base64;
import java.util.NoSuchElementException;

import static spark.Spark.*;

public class SparkServer {
    final TotalConnect tc;

    public SparkServer() {
        this.tc = new TotalConnect();
    }

    public void setupServer() {
        put("/security/:location/armStay", armSystem(ArmType.ARM_STAY));
        put("/security/:location/armNightStay", armSystem(ArmType.ARM_NIGHT_STAY));
        put("/security/:location/armAway", armSystem(ArmType.ARM_AWAY));

        setupExceptionMappings();
    }

    protected void setupExceptionMappings() {
        exception(NotImplementedYet.class, (exception, request, response) -> {
            response.status(HttpStatus.NOT_IMPLEMENTED_501);
            response.body(exception.getMessage());
        });

        exception(InvalidParameter.class, (exception, request, response) -> {
            response.status(HttpStatus.BAD_REQUEST_400);
            response.body(exception.getMessage());
        });
    }

    protected Route armSystem(final ArmType armType) {
        return ((request, response) -> {
            BasicCredentials credentials = new BasicCredentials(request);
            SessionDetailResults auth = null;
            try {
                auth = tc.authenticate(credentials.getUserName(), credentials.getPassword());

                if (auth.getResultCode() != 0) {
                    System.err.print(auth.getResultData());
                    halt(HttpStatus.UNAUTHORIZED_401);
                }

                LocationInfoBasic location = tc.getLocation(auth, request.params(":location"));

                ArmSecuritySystemResults rc = tc.getSoapApi().armSecuritySystem(auth.getSessionID(), location.getLocationID(), location.getSecurityDeviceID(), armType.getValue(), -1);
                if (rc.getResultCode() != 0 && rc.getResultCode() != 4500) {
                    throw new TotalConnectException(rc.getResultCode(), rc.getResultData(), "We encountered an error arming the system. Please check the logs for more information.");
                }
            } catch(HaltException ex) {
                throw ex;
            } catch(NoSuchElementException ex) {
                halt(HttpStatus.NOT_FOUND_404);
            } catch(TotalConnectException ex) {
                System.err.printf("TotalConnect result code: %d data: %s message: %s", ex.getResultCode(), ex.getResultData(), ex.getMessage());
                halt(HttpStatus.INTERNAL_SERVER_ERROR_500, ex.getMessage());
            } catch(Exception ex) {
                System.err.print(ex.getMessage());
                halt(HttpStatus.INTERNAL_SERVER_ERROR_500, "We encountered an error processing this request. Please check the logs for more information.");
            } finally {
                if(auth != null && !Strings.isNullOrEmpty(auth.getSessionID())) {
                    tc.logout(auth.getSessionID());
                }
            }

            response.status(HttpStatus.NO_CONTENT_204);
            return "";
        });
    }

    protected class BasicCredentials {
        private final String BASIC_AUTHORIZATION = "Basic";
        private String userName;
        private String password;

        public BasicCredentials(Request request) {
            String authorizationHeader = request.headers(HttpHeader.AUTHORIZATION.asString());

            if(authorizationHeader == null) {
                halt(HttpStatus.UNAUTHORIZED_401);
            }
            
            if(authorizationHeader != null && !authorizationHeader.startsWith(BASIC_AUTHORIZATION)) {
                throw new NotImplementedYet("Only basic auth is currently supported");
            }

            String credentials = authorizationHeader.substring(BASIC_AUTHORIZATION.length()).trim();
            credentials = new String(Base64.getDecoder().decode(credentials), Charset.forName("UTF-8"));
            final String[] values = credentials.split(":",2);

            if(values.length != 2) {
                throw new InvalidParameter("Basic auth must contain a username and password for this API.");
            }

            this.userName = values[0];
            this.password = values[1];
        }

        public BasicCredentials(String userName, String password) {
            this.userName = userName;
            this.password = password;
        }

        public String getUserName() {
            return userName;
        }

        public String getPassword() {
            return password;
        }
    }
}
