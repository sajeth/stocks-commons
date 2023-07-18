package com.saji.stocks.pojo.selenium;

public enum ActionType {

    click("click"), input("input"), submit("submit"), wait("wait");
    private final String name;

    ActionType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
