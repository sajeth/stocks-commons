package com.saji.stocks.rest.builder;

import com.saji.stocks.rest.ListResponse;
import org.springframework.http.HttpStatus;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ListResponseBuilder<T> {
    private ListResponse<T> response;

    public ListResponse<T> validate(CompletableFuture<ListResponse<T>> t) {
        ListResponse<T> output;
        try {
            output = t.get();
        } catch (InterruptedException | ExecutionException e) {
            output = new ListResponse<>(500, e);
        }
        return output;
    }

    public ListResponse<T> success(HttpStatus status, List<T> response) {
        return new ListResponse<>(response, status.value());
    }

    public ListResponse<T> error(Throwable errorResponse) {
        return new ListResponse<>(500, new Exception(errorResponse.getMessage()));
    }

}
