package com.saji.stocks.rest;


import java.util.List;


public class ListResponse<T> extends Response {
    private List<T> response;

    public ListResponse(List<T> response, Integer code) {
        super(code);
        this.response = response;
    }

    public ListResponse(Integer code, Exception exception) {
        super(code, exception);
    }

}
