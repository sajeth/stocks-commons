package com.saji.pojos.kite;

import com.saji.pojos.common.BaseEntity;

import java.util.Set;

public class UserPojo extends BaseEntity {
    private String password;
    private String pin;
    private String tpin;
    private String email;
    private String phoneNumber;
    private String link;
    private Set<UserPortfolioPojo> userPortfolios;

    public UserPojo() {
    }

    public UserPojo(String password, String pin, String tpin, String email, String phoneNumber) {
        this.password = password;
        this.pin = pin;
        this.tpin = tpin;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getTpin() {
        return tpin;
    }

    public void setTpin(String tpin) {
        this.tpin = tpin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Set<UserPortfolioPojo> getUserPortfolios() {
        return userPortfolios;
    }

    public void setUserPortfolios(Set<UserPortfolioPojo> userPortfolios) {
        this.userPortfolios = userPortfolios;
    }
}
