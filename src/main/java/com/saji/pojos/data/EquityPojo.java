package com.saji.pojos.data;

import com.saji.pojos.common.BaseEntity;
import java.math.BigInteger;


public class EquityPojo extends BaseEntity {

    private String link;
    private SectorPojo sector;


    public EquityPojo() {
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
