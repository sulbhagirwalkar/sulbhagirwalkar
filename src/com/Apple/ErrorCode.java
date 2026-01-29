package com.Apple;

public enum ErrorCode {
    INVALID_INPUT("ERR001", "Invalid input provided", 400),
    RESOURCE_NOT_FOUND("ERR002", "Requested Resource not found", 400),
    UNKNOWN_ERROR("ERR003", "An Unknown Error occurred", 500);

    private final String code;
    private final String message;
    private final int status;

    ErrorCode(String code, String message, int status) {
        this.code = code;
        this.message = message;
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public int getStatus() {
        return status;
    }

}
