package com.barentine.api.exceptions;

public class NotImplementedYet extends RuntimeException {
    public NotImplementedYet() {
        super();
    }

    public NotImplementedYet(String message) {
        super(message);
    }

    public NotImplementedYet(String message, Throwable cause) {
        super(message, cause);
    }

    public NotImplementedYet(Throwable cause) {
        super(cause);
    }
}
