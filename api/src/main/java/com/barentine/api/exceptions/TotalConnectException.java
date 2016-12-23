package com.barentine.api.exceptions;

public class TotalConnectException extends Exception {
    private int resultCode;
    private String resultData;


    public TotalConnectException() {
        super();
        this.resultCode = -1;
        this.resultData = null;
    }

    public TotalConnectException(int resultCode, String resultData) {
        super(resultData);
        this.resultCode = resultCode;
        this.resultData = resultData;
    }

    public TotalConnectException(String message) {
        super(message);
        this.resultCode = -1;
        this.resultData = null;
    }

    public TotalConnectException(int resultCode, String resultData, String message) {
        super(message);
        this.resultCode = resultCode;
        this.resultData = resultData;
    }

    public TotalConnectException(String message, Throwable cause) {
        super(message, cause);
        this.resultCode = -1;
        this.resultData = null;
    }

    public TotalConnectException(int resultCode, String resultData, String message, Throwable cause) {
        super(message, cause);
        this.resultCode = resultCode;
        this.resultData = resultData;
    }

    public TotalConnectException(Throwable cause) {
        super(cause);
        this.resultCode = -1;
        this.resultData = null;
    }

    public TotalConnectException(int resultCode, String resultData, Throwable cause) {
        super(cause);
        this.resultCode = resultCode;
        this.resultData = resultData;
    }

    public int getResultCode() {
        return resultCode;
    }

    public String getResultData() {
        return resultData;
    }
}
