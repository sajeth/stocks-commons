package com.saji.stocks.rest;

import lombok.*;

@Data
public class Request<T> {
    private T payload;

}
