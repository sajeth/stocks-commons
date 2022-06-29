package com.saji.stocks.pojo.common;

public class Action extends BasePojo {

    private String actionType;
    private String isTestDataRequired;
    private String isElementLocatorRequired;

    public Action(String actionType, String isTestDataRequired, String isElementLocatorRequired) {
        this.actionType = actionType;
        this.isTestDataRequired = isTestDataRequired;
        this.isElementLocatorRequired = isElementLocatorRequired;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getIsTestDataRequired() {
        return isTestDataRequired;
    }

    public void setIsTestDataRequired(String isTestDataRequired) {
        this.isTestDataRequired = isTestDataRequired;
    }

    public String getIsElementLocatorRequired() {
        return isElementLocatorRequired;
    }

    public void setIsElementLocatorRequired(String isElementLocatorRequired) {
        this.isElementLocatorRequired = isElementLocatorRequired;
    }
}
