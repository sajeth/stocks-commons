package com.saji.pojos.data;

import com.saji.pojos.common.BaseEntity;

import java.math.BigDecimal;
import java.math.BigInteger;


public class ETFPojo extends BaseEntity {
    private BigInteger assetType;
    private String ltpClose;
    private String change;
    private String dayHighLow;
    private String week52HighLow;
    private String prevCloseOpen;
    private BigDecimal wtAvgPrice;
    private BigInteger totalVol;
    private BigDecimal turnover;
    private String cktLimits;

    public ETFPojo() {
    }


    public BigInteger getAssetType() {
        return assetType;
    }

    public void setAssetType(BigInteger assetType) {
        this.assetType = assetType;
    }

    public String getLtpClose() {
        return ltpClose;
    }

    public void setLtpClose(String ltpClose) {
        this.ltpClose = ltpClose;
    }

    public String getChange() {
        return change;
    }

    public void setChange(String change) {
        this.change = change;
    }

    public String getDayHighLow() {
        return dayHighLow;
    }

    public void setDayHighLow(String dayHighLow) {
        this.dayHighLow = dayHighLow;
    }

    public String getWeek52HighLow() {
        return week52HighLow;
    }

    public void setWeek52HighLow(String week52HighLow) {
        this.week52HighLow = week52HighLow;
    }

    public String getPrevCloseOpen() {
        return prevCloseOpen;
    }

    public void setPrevCloseOpen(String prevCloseOpen) {
        this.prevCloseOpen = prevCloseOpen;
    }

    public BigDecimal getWtAvgPrice() {
        return wtAvgPrice;
    }

    public void setWtAvgPrice(BigDecimal wtAvgPrice) {
        this.wtAvgPrice = wtAvgPrice;
    }

    public BigInteger getTotalVol() {
        return totalVol;
    }

    public void setTotalVol(BigInteger totalVol) {
        this.totalVol = totalVol;
    }

    public BigDecimal getTurnover() {
        return turnover;
    }

    public void setTurnover(BigDecimal turnover) {
        this.turnover = turnover;
    }

    public String getCktLimits() {
        return cktLimits;
    }

    public void setCktLimits(String cktLimits) {
        this.cktLimits = cktLimits;
    }
}
