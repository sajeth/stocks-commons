package com.saji.stocks.pojo.data;

import com.saji.stocks.pojo.common.BasePojo;

import java.math.BigInteger;


public class EquityPojo extends BasePojo {

    private String link;
    private SectorPojo sector;


    public EquityPojo() {
        super();
    }

    public EquityPojo(BigInteger stockId, String symbol, String link, SectorPojo sector) {
        this.setId(stockId);
        this.setName(symbol);
        this.link = link;
        this.sector = sector;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public SectorPojo getSector() {
        return sector;
    }

    public void setSector(SectorPojo sector) {
        this.sector = sector;
    }
}
