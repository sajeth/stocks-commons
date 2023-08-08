package com.saji.stocks.rest.builder;

import com.saji.stocks.rest.RestResponse;
import org.springframework.http.HttpStatus;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class RestResponseBuilder<T1> {
    private RestResponse<T1> response;

    public RestResponse<T1> validate(CompletableFuture<RestResponse<T1>> t) {
        RestResponse<T1> output;
        try {
            output = t.get();
        } catch (InterruptedException | ExecutionException e) {
            output = new RestResponse<>(500, e);
        }
        return output;
    }

    public RestResponse<T1> success(HttpStatus status, T1 response) {
        return new RestResponse<>(response, status.value());
    }

    public RestResponse<T1> error(HttpStatus status,Exception errorResponse) {
        return new RestResponse<>(status.value(), errorResponse);

    }
}
