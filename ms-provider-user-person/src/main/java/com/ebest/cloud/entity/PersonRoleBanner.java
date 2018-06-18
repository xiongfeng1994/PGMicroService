package com.ebest.cloud.entity;

import java.util.Date;

import org.hibernate.validator.constraints.NotBlank;

import com.ebest.cloud.utility.ErrorDesc;

public class PersonRoleBanner extends PersonRoleBannerKey {
	
    private String recUserCode;

    @NotBlank(message = ErrorDesc.PARAMISEMPTY)
    private Date recTimeStamp;

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