package com.saji.stocks.rest.builder;

import com.saji.stocks.rest.ListResponse;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ListResponseBuilder<T1> {
    private ListResponse<T1> response;

    public ListResponse<T1> validate(CompletableFuture<ListResponse<T1>> t) {
        ListResponse<T1> output;
        try {
            output = t.get();
        } catch (InterruptedException | ExecutionException e) {
            output = new ListResponse<T1>(500, e);
        }
        return output;
    }

    public ListResponse<T1> success(int status, List<T1> response) {
        return new ListResponse<T1>(response, status);
    }

    public ListResponse<T1> error(Throwable errorResponse) {
        return new ListResponse<T1>(500, new Exception(errorResponse.getMessage()));
    }

}
