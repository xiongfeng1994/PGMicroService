package com.ebest.cloud.entity;

import java.util.Date;

import org.hibernate.validator.constraints.NotBlank;

import com.ebest.cloud.utility.ErrorDesc;

public class PersonRole {
	
	@NotBlank(message = ErrorDesc.PARAMISEMPTY)
    private String roleId;

	@NotBlank(message = ErrorDesc.PARAMISEMPTY)
    private String personCode;

	@NotBlank(message = ErrorDesc.PARAMISEMPTY)
    private String orgCode;

    private String roleType;

    private String recUserCode;

    @NotBlank(message = ErrorDesc.PARAMISEMPTY)
    private Date recTimeStamp;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    public String getPersonCode() {
        return personCode;
    }

    public void setPersonCode(String personCode) {
        this.personCode = personCode == null ? null : personCode.trim();
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode == null ? null : orgCode.trim();
    }

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType == null ? null : roleType.trim();
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