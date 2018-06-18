package com.ebest.cloud.entity;

import java.util.Date;
/**
 * storePerson table mapping class
 * @author ebest
 *
 */
public class StorePerson extends StorePersonKey {
	
    private Boolean isDeleted;

    private String recUserCode;

    private Date recTimeStamp;

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