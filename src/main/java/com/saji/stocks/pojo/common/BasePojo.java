package com.saji.stocks.pojo.common;


import java.math.BigInteger;

/**
 * @author saji
 */

public abstract class BasePojo {

    private BigInteger id;
    private String name;
    private String logicalDeleteIn;

    public BasePojo() {
    }

    public String getLogicalDelIn() {
        return logicalDeleteIn;
    }

    public void setLogicalDelIn(final String value) {
        this.logicalDeleteIn = value;
    }


    public BigInteger getId() {
        return id;
    }

    public void setId(final BigInteger id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }
}
