package com.saji.stocks.rest.builder;

import com.saji.stocks.rest.RestResponse;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class RestResponseBuilder<T1> {
    private RestResponse<T1> response;

    public RestResponse<T1> validate(CompletableFuture<RestResponse<T1>> t) {
        RestResponse<T1> output;
        try {
            output = t.get();
        } catch (InterruptedException | ExecutionException e) {
            output = new RestResponse<T1>(500, e);
        }
        return output;
    }

    public RestResponse<T1> success(int status, T1 response) {
        return new RestResponse<T1>(response, status);
    }

    public RestResponse<T1> error(Throwable errorResponse) {
        return new RestResponse<T1>(500, new Exception(errorResponse.getMessage()));

    }
}
