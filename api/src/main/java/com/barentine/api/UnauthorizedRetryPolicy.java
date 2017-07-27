package com.barentine.api;

import org.eclipse.jetty.http.HttpStatus;
import org.springframework.retry.RetryContext;
import org.springframework.retry.policy.SimpleRetryPolicy;
import spark.HaltException;

import java.util.Collections;

public class UnauthorizedRetryPolicy extends SimpleRetryPolicy {
    public final static int DEFAULT_MAX_ATTEMPTS = 2;

    public UnauthorizedRetryPolicy() {
        this(DEFAULT_MAX_ATTEMPTS);
    }

    public UnauthorizedRetryPolicy(int maxAttempts) {
        super(maxAttempts, Collections.singletonMap(HaltException.class, true));
    }

    @Override
    public boolean canRetry(RetryContext context) {
        if(context.getRetryCount() == 0) {
            return true;
        }

        Throwable t = context.getLastThrowable();
        if(super.canRetry(context) && t != null && t instanceof HaltException) {
            HaltException ex = (HaltException)t;

            System.err.println("Session ID has expired. Renewing ID and retrying...");
            return ex.statusCode() == HttpStatus.UNAUTHORIZED_401;
        }

        return false;
    }
}
