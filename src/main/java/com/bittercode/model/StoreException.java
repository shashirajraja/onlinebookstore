package com.bittercode.model;

import java.io.IOException;

import com.bittercode.constant.ResponseCode;

public class StoreException extends IOException {

    private String errorCode;
    private String errorMessage;
    private int statusCode;

    public StoreException(String errorMessage) {
        super(errorMessage);
        this.errorCode = "BAD_REQUEST";
        this.setStatusCode(400);
        this.errorMessage = errorMessage;
    }

    public StoreException(ResponseCode errorCodes) {
        super(errorCodes.getMessage());
        this.statusCode = errorCodes.getCode();
        this.errorMessage = errorCodes.getMessage();
        this.setErrorCode(errorCodes.name());
    }

    public StoreException(String errroCode, String errorMessage) {
        super(errorMessage);
        this.errorCode = errroCode;
        this.errorMessage = errorMessage;
        this.statusCode = 422;
    }

    public StoreException(int statusCode, String errorCode, String errorMessage) {
        super(errorMessage);
        this.statusCode = statusCode;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

}
