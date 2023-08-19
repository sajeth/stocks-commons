package com.saji.stocks.rest;

import org.springframework.http.HttpStatus;

import java.util.Date;


public abstract class Response {
    private Integer code;
    private String status;
    private String timestamp;
    private Error error;

    public Response(Integer code, Exception exception) {
        setData(code);
        this.error = new Error(code, exception.getMessage());
    }

    public Response(Integer code) {
        setData(code);
    }
    private void setData(Integer code){
        this.code = code;
        this.status = HttpStatus.valueOf(code).name();
        this.timestamp=new Date().toString();
    }

    public Integer getCode() {
        return code;
    }

    public String getStatus() {
        return status;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public Error getError() {
        return error;
    }
}
