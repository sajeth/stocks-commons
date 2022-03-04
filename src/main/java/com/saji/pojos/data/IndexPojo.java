package com.saji.pojos.data;

import com.saji.pojos.common.BaseEntity;

import java.math.BigDecimal;


public class IndexPojo extends BaseEntity {

    private BigDecimal open;
    private BigDecimal high;
    private BigDecimal currentValue;
    private BigDecimal low;
    private BigDecimal prevClose;
    private BigDecimal chPts;
    private BigDecimal chPercentage;
    private BigDecimal wk52High;
    private BigDecimal wk52Low;
    private BigDecimal turnoverInCr;
    private BigDecimal percentageInTotalTurnOver;

    public IndexPojo() {
    }

    public BigDecimal getOpen() {
        return open;
    }

    public void setOpen(BigDecimal open) {
        this.open = open;
    }

    public BigDecimal getHigh() {
        return high;
    }

    public void setHigh(BigDecimal high) {
        this.high = high;
    }

    public BigDecimal getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(BigDecimal currentValue) {
        this.currentValue = currentValue;
    }

    public BigDecimal getLow() {
        return low;
    }

    public void setLow(BigDecimal low) {
        this.low = low;
    }

    public BigDecimal getPrevClose() {
        return prevClose;
    }

    public void setPrevClose(BigDecimal prevClose) {
        this.prevClose = prevClose;
    }

    public BigDecimal getChPts() {
        return chPts;
    }

    public void setChPts(BigDecimal chPts) {
        this.chPts = chPts;
    }

    public BigDecimal getChPercentage() {
        return chPercentage;
    }

    public void setChPercentage(BigDecimal chPercentage) {
        this.chPercentage = chPercentage;
    }

    public BigDecimal getWk52High() {
        return wk52High;
    }

    public void setWk52High(BigDecimal wk52High) {
        this.wk52High = wk52High;
    }

    public BigDecimal getWk52Low() {
        return wk52Low;
    }

    public void setWk52Low(BigDecimal wk52Low) {
        this.wk52Low = wk52Low;
    }

    public BigDecimal getTurnoverInCr() {
        return turnoverInCr;
    }

    public void setTurnoverInCr(BigDecimal turnoverInCr) {
        this.turnoverInCr = turnoverInCr;
    }

    public BigDecimal getPercentageInTotalTurnOver() {
        return percentageInTotalTurnOver;
    }

    public void setPercentageInTotalTurnOver(BigDecimal percentageInTotalTurnOver) {
        this.percentageInTotalTurnOver = percentageInTotalTurnOver;
    }
}
