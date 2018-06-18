package com.ebest.cloud.entity;

import org.hibernate.validator.constraints.NotBlank;

import com.ebest.cloud.utility.ErrorDesc;

public class PersonRoleBannerKey {
	
	@NotBlank(message = ErrorDesc.PARAMISEMPTY)
    private String bannerCode;

	@NotBlank(message = ErrorDesc.PARAMISEMPTY)
    private String roleId;

    public String getBannerCode() {
        return bannerCode;
    }

    public void setBannerCode(String bannerCode) {
        this.bannerCode = bannerCode == null ? null : bannerCode.trim();
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }
}