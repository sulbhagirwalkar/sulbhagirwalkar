package com.Apple;

public class CustomExceptions extends RuntimeException{
    private final ErrorCode errorCode;

    public CustomExceptions(ErrorCode errorCode){
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }
    public String getErrorCode(){
        return errorCode.getCode();
    }

    public  int getStatus(){
        return errorCode.getStatus();
    }

    @Override
    public String toString() {
        return "CustomExceptions{" +
                "errorCode=" + errorCode.getCode() +'\'' +
                ", message=" + errorCode.getMessage() + '\''+
                ", status=" + errorCode.getStatus() +
                '}';
    }
}
