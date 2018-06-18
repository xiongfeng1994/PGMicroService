package com.ebest.cloud.entity;

import java.util.Date;

public class Organization {
	
    private String orgCode;

    private String parentOrgCode;

    private String orgType;

    private Boolean isDeleted;

    private String recUserCode;

    private Date recTimeStamp;

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode == null ? null : orgCode.trim();
    }

    public String getParentOrgCode() {
        return parentOrgCode;
    }

    public void setParentOrgCode(String parentOrgCode) {
        this.parentOrgCode = parentOrgCode == null ? null : parentOrgCode.trim();
    }

    public String getOrgType() {
        return orgType;
    }

    public void setOrgType(String orgType) {
        this.orgType = orgType == null ? null : orgType.trim();
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