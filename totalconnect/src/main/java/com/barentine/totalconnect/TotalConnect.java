package com.barentine.totalconnect;

import com.barentine.totalconnect.ws.*;

public class TotalConnect {
    private int applicationId = 14588;
    private String applicationVersion = "3.16.5";
    private SvcTC2API ss;
    private SvcTC2APISoap soapApi;

    public TotalConnect() {
        ss = new SvcTC2API();
        soapApi = ss.getSvcTC2APISoap();
    }

    public TotalConnect(int applicationId, String applicationVersion) {
        this();
        this.applicationId = applicationId;
        this.applicationVersion = applicationVersion;
    }

    public int getApplicationId() {
        return applicationId;
    }

    public TotalConnect setApplicationId(int applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    public String getApplicationVersion() {
        return applicationVersion;
    }

    public TotalConnect setApplicationVersion(String applicationVersion) {
        this.applicationVersion = applicationVersion;
        return this;
    }

    public SessionDetailResults authenticate(String userName, String password) {
        return getSoapApi().loginAndGetSessionDetails(userName, password, applicationId, applicationVersion, "");
    }

    public WebMethodResults logout(String sessionId) {
        return getSoapApi().logout(sessionId);
    }

    public LocationInfoBasic getLocation(SessionDetailResults auth, String name) {
        return auth.getLocations().getLocationInfoBasic().stream().filter(l -> l.getLocationName().equals(name)).findFirst().get();
    }

    public SvcTC2APISoap getSoapApi() {
        return soapApi;
    }
}
