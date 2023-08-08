package com.saji.stocks.rest;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Error {
    private Integer message;
    private String trace;

    public Error(Integer message, String trace) {
        this.message = message;
        this.trace = trace;
    }
}
