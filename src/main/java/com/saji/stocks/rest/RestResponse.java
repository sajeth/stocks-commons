package com.saji.stocks.rest;

public class RestResponse<T> extends Response {
    private T response;

    public RestResponse(T response, Integer code) {
        super(code);
        this.response = response;

    }

    public RestResponse(Integer code, Exception exception) {
        super(code, exception);
    }
}
