package com.saji.pojos.data;

import com.saji.pojos.common.BaseEntity;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Set;


public class SectorPojo extends BaseEntity {

    private BigDecimal sectorPE;
    private BigDecimal sectorPB;
    private BigDecimal sectorDY;
    private Set<EquityPojo> stocks;

    public SectorPojo() {
    }

    public SectorPojo(BigInteger sectorId, String sector, BigDecimal sectorPE, BigDecimal sectorPB, BigDecimal sectorDY) {
        this.setId(sectorId);
        this.setName(sector);
        this.sectorPE = sectorPE;
        this.sectorPB = sectorPB;
        this.sectorDY = sectorDY;
    }

    public BigDecimal getSectorPE() {
        return sectorPE;
    }

    public void setSectorPE(BigDecimal sectorPE) {
        this.sectorPE = sectorPE;
    }

    public BigDecimal getSectorPB() {
        return sectorPB;
    }

    public void setSectorPB(BigDecimal sectorPB) {
        this.sectorPB = sectorPB;
    }

    public BigDecimal getSectorDY() {
        return sectorDY;
    }

    public void setSectorDY(BigDecimal sectorDY) {
        this.sectorDY = sectorDY;
    }

    public Set<EquityPojo> getStocks() {
        return stocks;
    }

    public void setStocks(Set<EquityPojo> stocks) {
        this.stocks = stocks;
    }
}
