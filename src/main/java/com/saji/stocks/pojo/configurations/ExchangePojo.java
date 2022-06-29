package com.saji.stocks.pojo.configurations;

import com.saji.stocks.pojo.common.BasePojo;


public class ExchangePojo extends BasePojo {

    private String yRef;
    private String homePage;
    private String bloombergExchangeCode;
    private String bloomBergCompositeCode;
    private String description;
    private String googlePrefix;
    private String eodCode;

    public ExchangePojo() {
        super();
    }

    public ExchangePojo(String yRef, String homePage, String bloombergExchangeCode, String bloomBergCompositeCode, String description, String googlePrefix, String eodCode) {
        this.yRef = yRef;
        this.homePage = homePage;
        this.bloombergExchangeCode = bloombergExchangeCode;
        this.bloomBergCompositeCode = bloomBergCompositeCode;
        this.description = description;
        this.googlePrefix = googlePrefix;
        this.eodCode = eodCode;
    }

    public String getyRef() {
        return yRef;
    }

    public void setyRef(final String yRef) {
        this.yRef = yRef;
    }

    public String getHomePage() {
        return homePage;
    }

    public void setHomePage(final String homePage) {
        this.homePage = homePage;
    }

    public String getBloombergExchangeCode() {
        return bloombergExchangeCode;
    }

    public void setBloombergExchangeCode(final String bloombergExchangeCode) {
        this.bloombergExchangeCode = bloombergExchangeCode;
    }

    public String getBloomBergCompositeCode() {
        return bloomBergCompositeCode;
    }

    public void setBloomBergCompositeCode(final String bloomBergCompositeCode) {
        this.bloomBergCompositeCode = bloomBergCompositeCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public String getGooglePrefix() {
        return googlePrefix;
    }

    public void setGooglePrefix(final String googlePrefix) {
        this.googlePrefix = googlePrefix;
    }

    public String getEodCode() {
        return eodCode;
    }

    public void setEodCode(final String eodCode) {
        this.eodCode = eodCode;
    }

}

