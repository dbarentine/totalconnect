package com.barentine.api;


import com.barentine.api.exceptions.InvalidParameter;
import com.barentine.api.exceptions.NotImplementedYet;
import org.eclipse.jetty.http.HttpHeader;
import org.eclipse.jetty.http.HttpStatus;
import spark.Request;

import java.nio.charset.Charset;
import java.util.Base64;

import static spark.Spark.halt;

public class BasicCredentials {
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

        String basicAuthHeaderValue = authorizationHeader.substring(BASIC_AUTHORIZATION.length()).trim();
        fromHeaderValue(basicAuthHeaderValue);
    }

    public BasicCredentials(String basicAuthHeaderValue) {
        fromHeaderValue(basicAuthHeaderValue);
    }

    public BasicCredentials(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    protected void fromHeaderValue(String basicAuthHeaderValue) {
        String credentials = new String(Base64.getDecoder().decode(basicAuthHeaderValue), Charset.forName("UTF-8"));
        final String[] values = credentials.split(":",2);

        if(values.length != 2) {
            throw new InvalidParameter("Basic auth must contain a username and password for this API.");
        }

        this.userName = values[0];
        this.password = values[1];
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getBasicAuthorizationHeader() {
        byte[] headerValue = String.format("%s:%s", userName, password).getBytes(Charset.forName("UTF-8"));
        return Base64.getEncoder().encodeToString(headerValue);
    }
}
