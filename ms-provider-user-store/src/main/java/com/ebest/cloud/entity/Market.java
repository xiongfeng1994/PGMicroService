package com.ebest.cloud.entity;

import java.util.Date;
/**
 * market table mapping class
 * @author ebest
 *
 */
public class Market {
	
    private String code;

    private String description;

    private Boolean isDeleted;

    private String recUserCode;

    private Date recTimeStamp;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getRecUserCode() {
        return recUserCode;
    }

    public void setRecUserCode(String recUserCode) {
        this.recUserCode = recUserCode == null ? null : recUserCode.trim();
    }

    public Date getRecTimeStamp() {
        return recTimeStamp;
    }

    public void setRecTimeStamp(Date recTimeStamp) {
        this.recTimeStamp = recTimeStamp;
    }
}