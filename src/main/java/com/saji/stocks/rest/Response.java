package com.saji.stocks.rest;

import org.springframework.http.HttpStatus;

import java.util.Date;

public abstract class Response {
    private final Integer code;
    private String status;
    private final Date timestamp;
    private Exception exception;

    public Response(Integer code, Exception exception) {
        this.code = code;
        this.status = HttpStatus.valueOf(status).name();
        this.exception = exception;
        this.timestamp = new Date();
    }

    public Response(Integer code) {
        this.code = code;
        this.status = HttpStatus.valueOf(status).name();
        this.timestamp = new Date();
    }
}
