package com.saji.stocks.pojo.configurations;

import com.saji.stocks.pojo.common.BasePojo;


public class CountryPojo extends BasePojo {

    private String countryCode;
    private String currency;

    public CountryPojo() {
        super();
    }

    public CountryPojo(final String countryName, final String countryCode, final String currency) {
        this.setName(countryName);
        this.countryCode = countryCode;
        this.currency = currency;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(final String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(final String currency) {
        this.currency = currency;
    }

}
