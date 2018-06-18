package com.ebest.cloud.entity;

import java.util.Date;

import org.hibernate.validator.constraints.NotBlank;

import com.alibaba.fastjson.annotation.JSONField;
import com.ebest.cloud.utility.ConstantClassField;
import com.ebest.cloud.utility.ErrorDesc;
import com.ebest.cloud.utility.validator.annotation.PhoneOrBlank;
import com.ebest.cloud.utility.validator.annotation.StoreStatus;
import com.ebest.cloud.utility.validator.annotation.StoreTire;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * store table mapping class
 * @author ebest
 *
 */
@ApiModel
public class Store {
	
	@NotBlank(message = ErrorDesc.PARAMISEMPTY)
    private String code;

    private String cdhCode;

    private String name;
    
    // the paramter is phone or blank
    @PhoneOrBlank
    private String phone;

    private String address;
    
    // the parameter is not blank
    @NotBlank(message = ErrorDesc.PARAMISEMPTY)
    private String storeTypeCode;
    
    // hidden property (swagger)
    @ApiModelProperty(hidden = true)
    private StoreType storeType;
    
    // the parameter is not blank
    @NotBlank(message = ErrorDesc.PARAMISEMPTY)
    private String channelCode;
    
    // hidden property (swagger)
    @ApiModelProperty(hidden = true)
    private Channel channel;
    
    // the parameter is not blank
    @NotBlank(message = ErrorDesc.PARAMISEMPTY)
    private String bannerCode; 
    
    // hidden property (swagger)
    @ApiModelProperty(hidden = true)
    private Banners banner; 
    
    // the parameter is not blank
    @NotBlank(message = ErrorDesc.PARAMISEMPTY)
    private String regionCode;
    
    // hidden property (swagger)
    @ApiModelProperty(hidden = true)
    private Region region;
    
    // the parameter is not blank
    @NotBlank(message = ErrorDesc.PARAMISEMPTY)
    private String marketCode;
    
    // hidden property (swagger)
    @ApiModelProperty(hidden = true)
    private Market market;
    
    // the parameter is not blank
    @NotBlank(message = ErrorDesc.PARAMISEMPTY)	
    private String locationCode;
    
    // hidden property (swagger)
    @ApiModelProperty(hidden = true)
    private Location location;

    private Double latitude;

    private Double longitude;

    private String storeOwnerCode;
    
    // format date
    @JSONField(format = ConstantClassField.FORMATDATE)
    private Date openDate;
    
    // format date
    @JSONField(format = ConstantClassField.FORMATDATE)
    private Date closeDate;
    
    // Validation status
    @StoreStatus
    private String status;
    
    // hidden property (swagger)
    @ApiModelProperty(hidden = true)
    private Boolean isDeleted;
    
    // hidden property (swagger)
    @ApiModelProperty(hidden = true)
    private String recUserCode;
    
    // hidden property (swagger)
    @ApiModelProperty(hidden = true)
    private Date recTimeStamp;
    
    // validation storeTire
    @StoreTire
    private String storeTire;

    private String visitTarget;

    private Integer inStoreTime;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getCdhCode() {
        return cdhCode;
    }

    public void setCdhCode(String cdhCode) {
        this.cdhCode = cdhCode == null ? null : cdhCode.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getStoreTypeCode() {
        return storeTypeCode;
    }

    public void setStoreTypeCode(String storeTypeCode) {
        this.storeTypeCode = storeTypeCode == null ? null : storeTypeCode.trim();
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode == null ? null : channelCode.trim();
    }

    public String getBannerCode() {
        return bannerCode;
    }

    public void setBannerCode(String bannerCode) {
        this.bannerCode = bannerCode == null ? null : bannerCode.trim();
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode == null ? null : regionCode.trim();
    }

    public String getMarketCode() {
        return marketCode;
    }

    public void setMarketCode(String marketCode) {
        this.marketCode = marketCode == null ? null : marketCode.trim();
    }

    public String getLocationCode() {
        return locationCode;
    }

    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode == null ? null : locationCode.trim();
    }

    public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public String getStoreOwnerCode() {
        return storeOwnerCode;
    }

    public void setStoreOwnerCode(String storeOwnerCode) {
        this.storeOwnerCode = storeOwnerCode == null ? null : storeOwnerCode.trim();
    }

    public Date getOpenDate() {
        return openDate;
    }

    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }

    public Date getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(Date closeDate) {
        this.closeDate = closeDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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

	public StoreType getStoreType() {
		return storeType;
	}

	public void setStoreType(StoreType storeType) {
		this.storeType = storeType;
	}

	public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}

	public Banners getBanner() {
		return banner;
	}

	public void setBanner(Banners banner) {
		this.banner = banner;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public Market getMarket() {
		return market;
	}

	public void setMarket(Market market) {
		this.market = market;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public String getStoreTire() {
		return storeTire;
	}

	public void setStoreTire(String storeTire) {
		this.storeTire = storeTire == null ? null :storeTire.trim();
	}

	public String getVisitTarget() {
		return visitTarget;
	}

	public void setVisitTarget(String visitTarget) {
		this.visitTarget = visitTarget == null ? null :visitTarget.trim();
	}

	public Integer getInStoreTime() {
		return inStoreTime;
	}

	public void setInStoreTime(Integer inStoreTime) {
		this.inStoreTime = inStoreTime;
	}
    
}