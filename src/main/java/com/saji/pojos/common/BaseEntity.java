package com.saji.pojos.common;


import java.math.BigInteger;
import java.util.Date;
import java.util.Optional;

/**
 * @author saji
 */

public abstract class BaseEntity {

    private BigInteger id;
    private String name;
    private BigInteger createdBy;
    private Date createdDate;
    private BigInteger modifiedBy;
    private Date modifiedDate;
    private String logicalDeleteIn;


    public String getLogicalDelIn() {
        return logicalDeleteIn;
    }

    public void setLogicalDelIn(final String value) {
        this.logicalDeleteIn = value;
    }

    public BigInteger getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(final BigInteger value) {
        this.createdBy = value;
    }

    public Date getCreatedDate() {
        return Optional.ofNullable(this.createdDate).orElse(new Date());
    }

    public void setCreatedDate(final Date value) {
        this.createdDate = Optional.ofNullable(value).orElse(new Date());
    }

    public BigInteger getModifiedBy() {
        return this.modifiedBy;
    }

    public void setModifiedBy(final BigInteger value) {
        this.modifiedBy = value;
    }

    public Date getModifiedDate() {
        return Optional.ofNullable(this.modifiedDate).orElse(new Date());
    }

    public void setModifiedDate(final Date value) {
        this.modifiedDate = Optional.ofNullable(value).orElse(new Date());
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
