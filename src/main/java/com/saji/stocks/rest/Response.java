package com.saji.stocks.rest;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.util.Date;
@Setter
@Getter
public abstract class Response {
    private final Integer code;
    private final String status;
    private final Date timestamp;
    private Error error;

    public Response(Integer code, Exception exception) {
        this.code = code;
        this.status = HttpStatus.valueOf(code).name();
        this.error = new Error(code, exception.getMessage());
        this.timestamp = new Date();
    }

    public Response(Integer code) {
        this.code = code;
        this.status = HttpStatus.valueOf(code).name();
        this.timestamp = new Date();
    }

}
