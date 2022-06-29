package com.saji.stocks.pojo.kite;

import com.saji.stocks.pojo.common.BasePojo;

import java.math.BigDecimal;
import java.math.BigInteger;


public class UserPortfolioPojo extends BasePojo {

    private String investmentType;
    private BigInteger investmentId;
    private BigDecimal amountInvested;
    private BigDecimal profit;
    private BigDecimal dividendsEarned;
    private UserPojo userid;
    private String link;


    public UserPortfolioPojo() {
        super();
    }

    public UserPortfolioPojo(String investmentType, BigInteger investmentId, BigDecimal amountInvested, BigDecimal profit, BigDecimal dividendsEarned, UserPojo userid) {
        this.investmentType = investmentType;
        this.investmentId = investmentId;
        this.amountInvested = amountInvested;
        this.profit = profit;
        this.dividendsEarned = dividendsEarned;
        this.userid = userid;
    }

    public String getInvestmentType() {
        return investmentType;
    }

    public void setInvestmentType(String investmentType) {
        this.investmentType = investmentType;
    }

    public BigInteger getInvestmentId() {
        return investmentId;
    }

    public void setInvestmentId(BigInteger investmentId) {
        this.investmentId = investmentId;
    }

    public BigDecimal getAmountInvested() {
        return amountInvested;
    }

    public void setAmountInvested(BigDecimal amountInvested) {
        this.amountInvested = amountInvested;
    }

    public BigDecimal getProfit() {
        return profit;
    }

    public void setProfit(BigDecimal profit) {
        this.profit = profit;
    }

    public BigDecimal getDividendsEarned() {
        return dividendsEarned;
    }

    public void setDividendsEarned(BigDecimal dividendsEarned) {
        this.dividendsEarned = dividendsEarned;
    }

    public UserPojo getUserid() {
        return userid;
    }

    public void setUserid(UserPojo userid) {
        this.userid = userid;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
