package com.barentine.api;

import com.barentine.totalconnect.TotalConnect;
import com.barentine.totalconnect.ws.SessionDetailResults;
import com.google.common.base.Strings;
import com.google.common.cache.*;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import org.eclipse.jetty.http.HttpStatus;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import static spark.Spark.halt;

public class TotalConnectAuth {
    final TotalConnect tc;
    LoadingCache<String, SessionDetailResults> cache = CacheBuilder.newBuilder()
            .maximumSize(100)
            .expireAfterWrite(1, TimeUnit.HOURS)
            .removalListener((RemovalListener<String, SessionDetailResults>) notification -> {
                if(notification.wasEvicted()) {
                    //Need to logout any session that was evicted due to expiration or size evictions
                    logout(notification.getValue().getSessionID());
                }
            })
            .build(new CacheLoader<String, SessionDetailResults>() {
                @Override
                public SessionDetailResults load(String key) throws Exception {
                    BasicCredentials credentials = new BasicCredentials(key);
                    return authenticate(credentials.getUserName(), credentials.getPassword());
                }
                
                @Override
                public ListenableFuture<SessionDetailResults> reload(String key, SessionDetailResults oldValue) throws Exception {
                    logout(oldValue.getSessionID());
                    return Futures.immediateFuture(load(key));
                }
            });

    public TotalConnectAuth() {
        this.tc = new TotalConnect();
    }

    public TotalConnectAuth(TotalConnect tc) {
        this.tc = tc;
    }

    public SessionDetailResults authenticate(BasicCredentials credentials, int retryCount) throws ExecutionException {
        return retryCount == 0 ? authenticate(credentials) : refreshSession(credentials);
    }

    public SessionDetailResults authenticate(BasicCredentials credentials) throws ExecutionException {
        return cache.get(credentials.getBasicAuthorizationHeader());
    }

    protected SessionDetailResults authenticate(String userName, String password) {
        SessionDetailResults auth = tc.authenticate(userName, password);

        if (auth.getResultCode() != 0 || auth == null || Strings.isNullOrEmpty(auth.getSessionID())) {
            System.err.print(auth.getResultData());
            halt(HttpStatus.UNAUTHORIZED_401);
        }

        return auth;
    }

    public SessionDetailResults refreshSession(BasicCredentials credentials) throws ExecutionException {
        cache.refresh(credentials.getBasicAuthorizationHeader());
        return cache.get(credentials.getBasicAuthorizationHeader());
    }

    public void logout(BasicCredentials credentials) {
        SessionDetailResults auth = cache.getIfPresent(credentials.getBasicAuthorizationHeader());

        if(auth != null) {
            logout(auth.getSessionID());
            //This will potentially cause a secondary logout in the cache but it won't hurt anything
            cache.invalidate(credentials.getBasicAuthorizationHeader());
        }
    }

    protected void logout(String sessionId) {
        //System.out.println("Logout " + sessionId);
        tc.logout(sessionId);
    }
}
