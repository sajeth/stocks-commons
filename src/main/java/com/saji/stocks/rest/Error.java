package com.saji.stocks.rest;


public class Error {
    private Integer message;
    private String trace;

    public Error(Integer message, String trace) {
        this.message = message;
        this.trace = trace;
    }

    public Integer getMessage() {
        return message;
    }

    public String getTrace() {
        return trace;
    }
}
