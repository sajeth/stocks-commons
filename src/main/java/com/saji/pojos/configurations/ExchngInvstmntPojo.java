package com.saji.pojos.configurations;

import com.saji.pojos.common.BaseEntity;
import com.saji.pojos.common.LovPojo;

public class ExchngInvstmntPojo extends BaseEntity {

    private LovPojo investment;
    private String invstmntUrl;
    private Integer invstmntRow;
    private Integer invstmntColStrt;
    private Integer invstmntColEnd;
    private String invstmntPath;

    public ExchngInvstmntPojo() {
    }

    public ExchngInvstmntPojo(LovPojo investment, String invstmntUrl, Integer invstmntRow, Integer invstmntColStrt, Integer invstmntColEnd, String invstmntPath) {
        this.investment = investment;
        this.invstmntUrl = invstmntUrl;
        this.invstmntRow = invstmntRow;
        this.invstmntColStrt = invstmntColStrt;
        this.invstmntColEnd = invstmntColEnd;
        this.invstmntPath = invstmntPath;
    }

    public String getInvstmntUrl() {
        return invstmntUrl;
    }

    public void setInvstmntUrl(final String invstmntUrl) {
        this.invstmntUrl = invstmntUrl;
    }

    public Integer getInvstmntRow() {
        return invstmntRow;
    }

    public void setInvstmntRow(final Integer invstmntRow) {
        this.invstmntRow = invstmntRow;
    }

    public Integer getInvstmntColStrt() {
        return invstmntColStrt;
    }

    public void setInvstmntColStrt(final Integer invstmntColStrt) {
        this.invstmntColStrt = invstmntColStrt;
    }

    public Integer getInvstmntColEnd() {
        return invstmntColEnd;
    }

    public void setInvstmntColEnd(final Integer invstmntColEnd) {
        this.invstmntColEnd = invstmntColEnd;
    }

    public String getInvstmntPath() {
        return invstmntPath;
    }

    public void setInvstmntPath(final String invstmntPath) {
        this.invstmntPath = invstmntPath;
    }

    public LovPojo getInvestment() {
        return investment;
    }

    public void setInvestment(final LovPojo investment) {
        this.investment = investment;
    }

}
