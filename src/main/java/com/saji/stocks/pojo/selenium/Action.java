package com.saji.stocks.pojo.selenium;

import java.util.List;

public record Action(String name, String url, List<Step> steps) {
}
