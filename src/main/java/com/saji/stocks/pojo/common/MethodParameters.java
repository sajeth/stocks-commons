package com.saji.stocks.pojo.common;

public class MethodParameters {
    private String methodType;
    private String actionType;
    private String data;
    private String objectLocators;

    public String getMethodType() {
        return methodType;
    }

    public void setMethodType(String methodType) {
        this.methodType = methodType;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getObjectLocators() {
        return objectLocators;
    }

    public void setObjectLocators(String objectLocators) {
        this.objectLocators = objectLocators;
    }
}
