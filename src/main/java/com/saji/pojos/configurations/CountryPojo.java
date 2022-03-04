package com.saji.pojos.configurations;

import com.saji.pojos.common.BaseEntity;


public class CountryPojo extends BaseEntity {

    private String countryCode;
    private String currency;

    public CountryPojo() {
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
