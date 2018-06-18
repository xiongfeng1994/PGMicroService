package com.ebest.cloud.entity;

import java.util.Date;
import java.util.List;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import com.alibaba.fastjson.annotation.JSONField;
import com.ebest.cloud.utility.ErrorDesc;
import com.ebest.cloud.utility.validator.annotation.PhoneOrBlank;

public class Person {
	
	@NotBlank(message = ErrorDesc.PARAMISEMPTY)
    private String code;

    private String thirdPartyCode;

    @NotBlank(message = ErrorDesc.PARAMISEMPTY)
    private String nameCn;

    @NotBlank(message = ErrorDesc.PARAMISEMPTY)
    private String nameEn;

    @NotBlank(message = ErrorDesc.PARAMISEMPTY)
    private String personType;

    private String gender;

    @PhoneOrBlank
    private String mobile;

    @Email
    private String email;

    private Date entryDate;

    @JSONField(format="yyyy-MM-dd")
    private Date leaveDate;

    private String lineManager;

    private String dataSource;

    @NotBlank(message = ErrorDesc.PARAMISEMPTY)
    private Boolean isDeleted;

    private String recUserCode;

    @NotBlank(message = ErrorDesc.PARAMISEMPTY)
    private Date recTimeStamp;
    
    private Person personPrent;
    
    private List<PersonRole> personRoles;
    
    private List<PersonRoleBanner> personRoleBanners;
    
    public Person getPersonPrent() {
		return personPrent;
	}

	public void setPersonPrent(Person personPrent) {
		this.personPrent = personPrent;
	}

	public List<PersonRole> getPersonRoles() {
		return personRoles;
	}

	public void setPersonRoles(List<PersonRole> personRoles) {
		this.personRoles = personRoles;
	}

	public List<PersonRoleBanner> getPersonRoleBanners() {
		return personRoleBanners;
	}

	public void setPersonRoleBanners(List<PersonRoleBanner> personRoleBanners) {
		this.personRoleBanners = personRoleBanners;
	}

	public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getThirdPartyCode() {
        return thirdPartyCode;
    }

    public void setThirdPartyCode(String thirdPartyCode) {
        this.thirdPartyCode = thirdPartyCode == null ? null : thirdPartyCode.trim();
    }

    public String getNameCn() {
        return nameCn;
    }

    public void setNameCn(String nameCn) {
        this.nameCn = nameCn == null ? null : nameCn.trim();
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn == null ? null : nameEn.trim();
    }

    public String getPersonType() {
        return personType;
    }

    public void setPersonType(String personType) {
        this.personType = personType == null ? null : personType.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public Date getLeaveDate() {
        return leaveDate;
    }

    public void setLeaveDate(Date leaveDate) {
        this.leaveDate = leaveDate;
    }

    public String getLineManager() {
        return lineManager;
    }

    public void setLineManager(String lineManager) {
        this.lineManager = lineManager == null ? null : lineManager.trim();
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource == null ? null : dataSource.trim();
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