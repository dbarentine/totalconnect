package com.barentine.api.exceptions;

public class InvalidParameter extends RuntimeException {
    public InvalidParameter() {
        super();
    }

    public InvalidParameter(String message) {
        super(message);
    }

    public InvalidParameter(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidParameter(Throwable cause) {
        super(cause);
    }
}