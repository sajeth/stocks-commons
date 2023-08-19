package com.saji.stocks.pojo.selenium;

public record Step(ActionType actionType, String identifier, ParameterType parameterType, Object data) {
}
