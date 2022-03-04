package com.saji.pojos.data;

import com.saji.pojos.common.BaseEntity;

import java.math.BigDecimal;
import java.math.BigInteger;


public class BondPojo extends BaseEntity {
    private String dateOfIssuance;
    private BigDecimal amount;
    private BigInteger noOfInvestors;
    private String categoryOfInvestors;
    private String tenure;
    private BigDecimal price;
    private String creditRating;
    private String ppmIm;

    public BondPojo(String dateOfIssuance, BigDecimal amount, BigInteger noOfInvestors, String categoryOfInvestors, String tenure, BigDecimal price, String creditRating, String ppmIm) {
        this.dateOfIssuance = dateOfIssuance;
        this.amount = amount;
        this.noOfInvestors = noOfInvestors;
        this.categoryOfInvestors = categoryOfInvestors;
        this.tenure = tenure;
        this.price = price;
        this.creditRating = creditRating;
        this.ppmIm = ppmIm;
    }

    public BondPojo() {
    }

    public String getDateOfIssuance() {
        return dateOfIssuance;
    }

    public void setDateOfIssuance(String dateOfIssuance) {
        this.dateOfIssuance = dateOfIssuance;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigInteger getNoOfInvestors() {
        return noOfInvestors;
    }

    public void setNoOfInvestors(BigInteger noOfInvestors) {
        this.noOfInvestors = noOfInvestors;
    }

    public String getCategoryOfInvestors() {
        return categoryOfInvestors;
    }

    public void setCategoryOfInvestors(String categoryOfInvestors) {
        this.categoryOfInvestors = categoryOfInvestors;
    }

    public String getTenure() {
        return tenure;
    }

    public void setTenure(String tenure) {
        this.tenure = tenure;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCreditRating() {
        return creditRating;
    }

    public void setCreditRating(String creditRating) {
        this.creditRating = creditRating;
    }

    public String getPpmIm() {
        return ppmIm;
    }

    public void setPpmIm(String ppmIm) {
        this.ppmIm = ppmIm;
    }
}
