package com.barentine.api;

import com.barentine.api.enums.ArmType;
import com.barentine.api.enums.ArmingState;
import com.barentine.api.exceptions.InvalidParameter;
import com.barentine.api.exceptions.NotImplementedYet;
import com.barentine.api.exceptions.TotalConnectException;
import com.barentine.api.responses.PanelStatus;
import com.barentine.totalconnect.TotalConnect;
import com.barentine.totalconnect.ws.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.eclipse.jetty.http.HttpStatus;
import org.springframework.retry.support.RetryTemplate;
import spark.HaltException;
import spark.Route;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

import static spark.Spark.*;

public class SparkServer {
    final TotalConnect tc;
    final TotalConnectAuth tcAuth;

    public SparkServer() {
        this.tc = new TotalConnect();
        this.tcAuth = new TotalConnectAuth(tc);
    }

    public void setupServer() {
        put("/security/:location/armStay", armSystem(ArmType.ARM_STAY));
        put("/security/:location/armNightStay", armSystem(ArmType.ARM_NIGHT_STAY));
        put("/security/:location/armAway", armSystem(ArmType.ARM_AWAY));
        get("/security/:location/status", getStatus());

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

            try {
                RetryTemplate retry = new RetryTemplate();
                retry.setRetryPolicy(new UnauthorizedRetryPolicy());
                retry.execute(context -> {
                    SessionDetailResults auth = tcAuth.authenticate(credentials, context.getRetryCount());

                    //arm system
                    LocationInfoBasic location = tc.getLocation(auth, request.params(":location"));
                    ArmSecuritySystemResults rs = tc.getSoapApi().armSecuritySystem(auth.getSessionID(), location.getLocationID(), location.getSecurityDeviceID(), armType.getValue(), -1);
                    checkStatus(rs, Arrays.asList(0, 4500), "We encountered an error arming the system. Please check the logs for more information.");

                    return rs;
                });

                response.status(HttpStatus.NO_CONTENT_204);
                return "";
            } catch (Exception ex) {
                handleException(ex);
                return null;
            }
        });
    }

    protected Route getStatus() {
        return ((request, response) -> {
            BasicCredentials credentials = new BasicCredentials(request);

            try {
                RetryTemplate retry = new RetryTemplate();
                retry.setRetryPolicy(new UnauthorizedRetryPolicy());
                PanelMetadataAndStatusResultsEx status = retry.execute(context -> {
                    SessionDetailResults auth = tcAuth.authenticate(credentials, context.getRetryCount());
                    LocationInfoBasic location = tc.getLocation(auth, request.params(":location"));

                    PanelMetadataAndStatusResultsEx rs = tc.getSoapApi().getPanelMetaDataAndFullStatusEx(auth.getSessionID(), location.getLocationID(), 0, 0, 1);
                    checkStatus(rs, Arrays.asList(0), "We encountered an error getting the system status. Please check the logs for more information.");

                    return rs;
                });

                PanelStatus result = new PanelStatus();

                result.setAcLoss(status.getPanelMetadataAndStatus().isIsInACLoss())
                        .setLowBattery(status.getPanelMetadataAndStatus().isIsInLowBattery())
                        .setArmingState(ArmingState.fromValue(status.getPanelMetadataAndStatus().getPartitions().getPartitionInfo().get(0).getArmingState()));

                response.status(HttpStatus.OK_200);
                response.type("application/json");

                return getObjectMapper().writeValueAsString(result);

            } catch (Exception ex) {
                handleException(ex);
                return null;
            }
        });
    }

    protected ObjectMapper getObjectMapper() {
        ObjectMapper mapper =  new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

        return mapper;
    }
    protected void handleException(Exception t) throws Exception {
        if(t instanceof HaltException) {
            throw t;
        }
        else if(t instanceof NoSuchElementException) {
            halt(HttpStatus.NOT_FOUND_404);
        }

        if(t instanceof TotalConnectException) {
            TotalConnectException ex = (TotalConnectException)t;
            System.err.printf("TotalConnect result code: %d data: %s", ex.getResultCode(), ex.getResultData());
        }

        System.err.print(t.getMessage());
        halt(HttpStatus.INTERNAL_SERVER_ERROR_500, "We encountered an error processing this request. Please check the logs for more information.");
    }

    protected void checkStatus(WebMethodResults rs, List<Integer> validStatusCodes, String errorText) throws Exception {
        if (rs.getResultCode() == -102) {
            halt(HttpStatus.UNAUTHORIZED_401);
        }

        if (!validStatusCodes.contains(rs.getResultCode())) {
            throw new TotalConnectException(rs.getResultCode(), rs.getResultData(), errorText);
        }
    }
}
