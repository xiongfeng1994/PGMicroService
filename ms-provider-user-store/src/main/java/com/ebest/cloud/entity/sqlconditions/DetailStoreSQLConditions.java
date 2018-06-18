package com.ebest.cloud.entity.sqlconditions;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * Help class for splicing join table query
 * @author ebest
 *
 */

public class DetailStoreSQLConditions {
	
    protected String orderByClause;

    protected boolean distinct;

    public List<Criteria> oredCriteria;
    
    public DetailStoreSQLConditions() {
        oredCriteria = new ArrayList<Criteria>();
    }
   
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCodeIsNull() {
            addCriterion("store.code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("store.code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("store.code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("store.code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("store.code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("store.code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("store.code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("store.code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("store.code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("store.code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("store.code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("store.code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("store.code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("store.code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCdhCodeIsNull() {
            addCriterion("store.cdh_code is null");
            return (Criteria) this;
        }

        public Criteria andCdhCodeIsNotNull() {
            addCriterion("store.cdh_code is not null");
            return (Criteria) this;
        }

        public Criteria andCdhCodeEqualTo(String value) {
            addCriterion("store.cdh_code =", value, "cdhCode");
            return (Criteria) this;
        }

        public Criteria andCdhCodeNotEqualTo(String value) {
            addCriterion("store.cdh_code <>", value, "cdhCode");
            return (Criteria) this;
        }

        public Criteria andCdhCodeGreaterThan(String value) {
            addCriterion("store.cdh_code >", value, "cdhCode");
            return (Criteria) this;
        }

        public Criteria andCdhCodeGreaterThanOrEqualTo(String value) {
            addCriterion("store.cdh_code >=", value, "cdhCode");
            return (Criteria) this;
        }

        public Criteria andCdhCodeLessThan(String value) {
            addCriterion("store.cdh_code <", value, "cdhCode");
            return (Criteria) this;
        }

        public Criteria andCdhCodeLessThanOrEqualTo(String value) {
            addCriterion("store.cdh_code <=", value, "cdhCode");
            return (Criteria) this;
        }

        public Criteria andCdhCodeLike(String value) {
            addCriterion("store.cdh_code like", value, "cdhCode");
            return (Criteria) this;
        }

        public Criteria andCdhCodeNotLike(String value) {
            addCriterion("store.cdh_code not like", value, "cdhCode");
            return (Criteria) this;
        }

        public Criteria andCdhCodeIn(List<String> values) {
            addCriterion("store.cdh_code in", values, "cdhCode");
            return (Criteria) this;
        }

        public Criteria andCdhCodeNotIn(List<String> values) {
            addCriterion("store.cdh_code not in", values, "cdhCode");
            return (Criteria) this;
        }

        public Criteria andCdhCodeBetween(String value1, String value2) {
            addCriterion("store.cdh_code between", value1, value2, "cdhCode");
            return (Criteria) this;
        }

        public Criteria andCdhCodeNotBetween(String value1, String value2) {
            addCriterion("store.cdh_code not between", value1, value2, "cdhCode");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("store.name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("store.name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("store.name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("store.name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("store.name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("store.name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("store.name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("store.name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("store.name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("store.name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("store.name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("store.name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("store.name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("store.name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("store.phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("store.phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("store.phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("store.phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("store.phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("store.phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("store.phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("store.phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("store.phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("store.phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("store.phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("store.phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("store.phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("store.phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("store.address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("store.address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("store.address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("store.address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("store.address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("store.address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("store.address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("store.address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("store.address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("store.address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("store.address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("store.address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("store.address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("store.address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andStoreTypeCodeIsNull() {
            addCriterion("store.store_type_code is null");
            return (Criteria) this;
        }

        public Criteria andStoreTypeCodeIsNotNull() {
            addCriterion("store.store_type_code is not null");
            return (Criteria) this;
        }

        public Criteria andStoreTypeCodeEqualTo(String value) {
            addCriterion("store.store_type_code =", value, "storeTypeCode");
            return (Criteria) this;
        }

        public Criteria andStoreTypeCodeNotEqualTo(String value) {
            addCriterion("store.store_type_code <>", value, "storeTypeCode");
            return (Criteria) this;
        }

        public Criteria andStoreTypeCodeGreaterThan(String value) {
            addCriterion("store.store_type_code >", value, "storeTypeCode");
            return (Criteria) this;
        }

        public Criteria andStoreTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("store.store_type_code >=", value, "storeTypeCode");
            return (Criteria) this;
        }

        public Criteria andStoreTypeCodeLessThan(String value) {
            addCriterion("store.store_type_code <", value, "storeTypeCode");
            return (Criteria) this;
        }

        public Criteria andStoreTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("store.store_type_code <=", value, "storeTypeCode");
            return (Criteria) this;
        }

        public Criteria andStoreTypeCodeLike(String value) {
            addCriterion("store.store_type_code like", value, "storeTypeCode");
            return (Criteria) this;
        }

        public Criteria andStoreTypeCodeNotLike(String value) {
            addCriterion("store.store_type_code not like", value, "storeTypeCode");
            return (Criteria) this;
        }

        public Criteria andStoreTypeCodeIn(List<String> values) {
            addCriterion("store.store_type_code in", values, "storeTypeCode");
            return (Criteria) this;
        }

        public Criteria andStoreTypeCodeNotIn(List<String> values) {
            addCriterion("store.store_type_code not in", values, "storeTypeCode");
            return (Criteria) this;
        }

        public Criteria andStoreTypeCodeBetween(String value1, String value2) {
            addCriterion("store.store_type_code between", value1, value2, "storeTypeCode");
            return (Criteria) this;
        }

        public Criteria andStoreTypeCodeNotBetween(String value1, String value2) {
            addCriterion("store.store_type_code not between", value1, value2, "storeTypeCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeIsNull() {
            addCriterion("store.channel_code is null");
            return (Criteria) this;
        }

        public Criteria andChannelCodeIsNotNull() {
            addCriterion("store.channel_code is not null");
            return (Criteria) this;
        }

        public Criteria andChannelCodeEqualTo(String value) {
            addCriterion("store.channel_code =", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeNotEqualTo(String value) {
            addCriterion("store.channel_code <>", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeGreaterThan(String value) {
            addCriterion("store.channel_code >", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeGreaterThanOrEqualTo(String value) {
            addCriterion("store.channel_code >=", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeLessThan(String value) {
            addCriterion("store.channel_code <", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeLessThanOrEqualTo(String value) {
            addCriterion("store.channel_code <=", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeLike(String value) {
            addCriterion("store.channel_code like", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeNotLike(String value) {
            addCriterion("store.channel_code not like", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeIn(List<String> values) {
            addCriterion("store.channel_code in", values, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeNotIn(List<String> values) {
            addCriterion("store.channel_code not in", values, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeBetween(String value1, String value2) {
            addCriterion("store.channel_code between", value1, value2, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeNotBetween(String value1, String value2) {
            addCriterion("store.channel_code not between", value1, value2, "channelCode");
            return (Criteria) this;
        }

        public Criteria andBannerCodeIsNull() {
            addCriterion("store.banner_code is null");
            return (Criteria) this;
        }

        public Criteria andBannerCodeIsNotNull() {
            addCriterion("store.banner_code is not null");
            return (Criteria) this;
        }

        public Criteria andBannerCodeEqualTo(String value) {
            addCriterion("store.banner_code =", value, "bannerCode");
            return (Criteria) this;
        }

        public Criteria andBannerCodeNotEqualTo(String value) {
            addCriterion("store.banner_code <>", value, "bannerCode");
            return (Criteria) this;
        }

        public Criteria andBannerCodeGreaterThan(String value) {
            addCriterion("store.banner_code >", value, "bannerCode");
            return (Criteria) this;
        }

        public Criteria andBannerCodeGreaterThanOrEqualTo(String value) {
            addCriterion("store.banner_code >=", value, "bannerCode");
            return (Criteria) this;
        }

        public Criteria andBannerCodeLessThan(String value) {
            addCriterion("store.banner_code <", value, "bannerCode");
            return (Criteria) this;
        }

        public Criteria andBannerCodeLessThanOrEqualTo(String value) {
            addCriterion("store.banner_code <=", value, "bannerCode");
            return (Criteria) this;
        }

        public Criteria andBannerCodeLike(String value) {
            addCriterion("store.banner_code like", value, "bannerCode");
            return (Criteria) this;
        }

        public Criteria andBannerCodeNotLike(String value) {
            addCriterion("store.banner_code not like", value, "bannerCode");
            return (Criteria) this;
        }

        public Criteria andBannerCodeIn(List<String> values) {
            addCriterion("store.banner_code in", values, "bannerCode");
            return (Criteria) this;
        }

        public Criteria andBannerCodeNotIn(List<String> values) {
            addCriterion("store.banner_code not in", values, "bannerCode");
            return (Criteria) this;
        }

        public Criteria andBannerCodeBetween(String value1, String value2) {
            addCriterion("store.banner_code between", value1, value2, "bannerCode");
            return (Criteria) this;
        }

        public Criteria andBannerCodeNotBetween(String value1, String value2) {
            addCriterion("store.banner_code not between", value1, value2, "bannerCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeIsNull() {
            addCriterion("store.region_code is null");
            return (Criteria) this;
        }

        public Criteria andRegionCodeIsNotNull() {
            addCriterion("store.region_code is not null");
            return (Criteria) this;
        }

        public Criteria andRegionCodeEqualTo(String value) {
            addCriterion("store.region_code =", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeNotEqualTo(String value) {
            addCriterion("store.region_code <>", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeGreaterThan(String value) {
            addCriterion("store.region_code >", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("store.region_code >=", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeLessThan(String value) {
            addCriterion("store.region_code <", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeLessThanOrEqualTo(String value) {
            addCriterion("store.region_code <=", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeLike(String value) {
            addCriterion("store.region_code like", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeNotLike(String value) {
            addCriterion("store.region_code not like", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeIn(List<String> values) {
            addCriterion("store.region_code in", values, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeNotIn(List<String> values) {
            addCriterion("store.region_code not in", values, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeBetween(String value1, String value2) {
            addCriterion("store.region_code between", value1, value2, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeNotBetween(String value1, String value2) {
            addCriterion("store.region_code not between", value1, value2, "regionCode");
            return (Criteria) this;
        }

        public Criteria andMarketCodeIsNull() {
            addCriterion("store.market_code is null");
            return (Criteria) this;
        }

        public Criteria andMarketCodeIsNotNull() {
            addCriterion("store.market_code is not null");
            return (Criteria) this;
        }

        public Criteria andMarketCodeEqualTo(String value) {
            addCriterion("store.market_code =", value, "marketCode");
            return (Criteria) this;
        }

        public Criteria andMarketCodeNotEqualTo(String value) {
            addCriterion("store.market_code <>", value, "marketCode");
            return (Criteria) this;
        }

        public Criteria andMarketCodeGreaterThan(String value) {
            addCriterion("store.market_code >", value, "marketCode");
            return (Criteria) this;
        }

        public Criteria andMarketCodeGreaterThanOrEqualTo(String value) {
            addCriterion("store.market_code >=", value, "marketCode");
            return (Criteria) this;
        }

        public Criteria andMarketCodeLessThan(String value) {
            addCriterion("store.market_code <", value, "marketCode");
            return (Criteria) this;
        }

        public Criteria andMarketCodeLessThanOrEqualTo(String value) {
            addCriterion("store.market_code <=", value, "marketCode");
            return (Criteria) this;
        }

        public Criteria andMarketCodeLike(String value) {
            addCriterion("store.market_code like", value, "marketCode");
            return (Criteria) this;
        }

        public Criteria andMarketCodeNotLike(String value) {
            addCriterion("store.market_code not like", value, "marketCode");
            return (Criteria) this;
        }

        public Criteria andMarketCodeIn(List<String> values) {
            addCriterion("store.market_code in", values, "marketCode");
            return (Criteria) this;
        }

        public Criteria andMarketCodeNotIn(List<String> values) {
            addCriterion("store.market_code not in", values, "marketCode");
            return (Criteria) this;
        }

        public Criteria andMarketCodeBetween(String value1, String value2) {
            addCriterion("store.market_code between", value1, value2, "marketCode");
            return (Criteria) this;
        }

        public Criteria andMarketCodeNotBetween(String value1, String value2) {
            addCriterion("store.market_code not between", value1, value2, "marketCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeIsNull() {
            addCriterion("store.location_code is null");
            return (Criteria) this;
        }

        public Criteria andLocationCodeIsNotNull() {
            addCriterion("store.location_code is not null");
            return (Criteria) this;
        }

        public Criteria andLocationCodeEqualTo(String value) {
            addCriterion("store.location_code =", value, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeNotEqualTo(String value) {
            addCriterion("store.location_code <>", value, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeGreaterThan(String value) {
            addCriterion("store.location_code >", value, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("store.location_code >=", value, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeLessThan(String value) {
            addCriterion("store.location_code <", value, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeLessThanOrEqualTo(String value) {
            addCriterion("store.location_code <=", value, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeLike(String value) {
            addCriterion("store.location_code like", value, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeNotLike(String value) {
            addCriterion("store.location_code not like", value, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeIn(List<String> values) {
            addCriterion("store.location_code in", values, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeNotIn(List<String> values) {
            addCriterion("store.location_code not in", values, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeBetween(String value1, String value2) {
            addCriterion("store.location_code between", value1, value2, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeNotBetween(String value1, String value2) {
            addCriterion("store.location_code not between", value1, value2, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("store.latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("store.latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(Integer value) {
            addCriterion("store.latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(Integer value) {
            addCriterion("store.latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(Integer value) {
            addCriterion("store.latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(Integer value) {
            addCriterion("store.latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(Integer value) {
            addCriterion("store.latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(Integer value) {
            addCriterion("store.latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<Integer> values) {
            addCriterion("store.latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<Integer> values) {
            addCriterion("store.latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(Integer value1, Integer value2) {
            addCriterion("store.latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(Integer value1, Integer value2) {
            addCriterion("store.latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("store.longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("store.longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(Integer value) {
            addCriterion("store.longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(Integer value) {
            addCriterion("store.longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(Integer value) {
            addCriterion("store.longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(Integer value) {
            addCriterion("store.longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(Integer value) {
            addCriterion("store.longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(Integer value) {
            addCriterion("store.longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<Integer> values) {
            addCriterion("store.longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<Integer> values) {
            addCriterion("store.longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(Integer value1, Integer value2) {
            addCriterion("store.longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(Integer value1, Integer value2) {
            addCriterion("store.longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andStoreOwnerCodeIsNull() {
            addCriterion("store.store_owner_code is null");
            return (Criteria) this;
        }

        public Criteria andStoreOwnerCodeIsNotNull() {
            addCriterion("store.store_owner_code is not null");
            return (Criteria) this;
        }

        public Criteria andStoreOwnerCodeEqualTo(String value) {
            addCriterion("store.store_owner_code =", value, "storeOwnerCode");
            return (Criteria) this;
        }

        public Criteria andStoreOwnerCodeNotEqualTo(String value) {
            addCriterion("store.store_owner_code <>", value, "storeOwnerCode");
            return (Criteria) this;
        }

        public Criteria andStoreOwnerCodeGreaterThan(String value) {
            addCriterion("store.store_owner_code >", value, "storeOwnerCode");
            return (Criteria) this;
        }

        public Criteria andStoreOwnerCodeGreaterThanOrEqualTo(String value) {
            addCriterion("store.store_owner_code >=", value, "storeOwnerCode");
            return (Criteria) this;
        }

        public Criteria andStoreOwnerCodeLessThan(String value) {
            addCriterion("store.store_owner_code <", value, "storeOwnerCode");
            return (Criteria) this;
        }

        public Criteria andStoreOwnerCodeLessThanOrEqualTo(String value) {
            addCriterion("store.store_owner_code <=", value, "storeOwnerCode");
            return (Criteria) this;
        }

        public Criteria andStoreOwnerCodeLike(String value) {
            addCriterion("store.store_owner_code like", value, "storeOwnerCode");
            return (Criteria) this;
        }

        public Criteria andStoreOwnerCodeNotLike(String value) {
            addCriterion("store.store_owner_code not like", value, "storeOwnerCode");
            return (Criteria) this;
        }

        public Criteria andStoreOwnerCodeIn(List<String> values) {
            addCriterion("store.store_owner_code in", values, "storeOwnerCode");
            return (Criteria) this;
        }

        public Criteria andStoreOwnerCodeNotIn(List<String> values) {
            addCriterion("store.store_owner_code not in", values, "storeOwnerCode");
            return (Criteria) this;
        }

        public Criteria andStoreOwnerCodeBetween(String value1, String value2) {
            addCriterion("store.store_owner_code between", value1, value2, "storeOwnerCode");
            return (Criteria) this;
        }

        public Criteria andStoreOwnerCodeNotBetween(String value1, String value2) {
            addCriterion("store.store_owner_code not between", value1, value2, "storeOwnerCode");
            return (Criteria) this;
        }

        public Criteria andOpenDateIsNull() {
            addCriterion("store.open_date is null");
            return (Criteria) this;
        }

        public Criteria andOpenDateIsNotNull() {
            addCriterion("store.open_date is not null");
            return (Criteria) this;
        }

        public Criteria andOpenDateEqualTo(Date value) {
            addCriterion("store.open_date =", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateNotEqualTo(Date value) {
            addCriterion("store.open_date <>", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateGreaterThan(Date value) {
            addCriterion("store.open_date >", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateGreaterThanOrEqualTo(Date value) {
            addCriterion("store.open_date >=", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateLessThan(Date value) {
            addCriterion("store.open_date <", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateLessThanOrEqualTo(Date value) {
            addCriterion("store.open_date <=", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateIn(List<Date> values) {
            addCriterion("store.open_date in", values, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateNotIn(List<Date> values) {
            addCriterion("store.open_date not in", values, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateBetween(Date value1, Date value2) {
            addCriterion("store.open_date between", value1, value2, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateNotBetween(Date value1, Date value2) {
            addCriterion("store.open_date not between", value1, value2, "openDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateIsNull() {
            addCriterion("store.close_date is null");
            return (Criteria) this;
        }

        public Criteria andCloseDateIsNotNull() {
            addCriterion("store.close_date is not null");
            return (Criteria) this;
        }

        public Criteria andCloseDateEqualTo(Date value) {
            addCriterion("store.close_date =", value, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateNotEqualTo(Date value) {
            addCriterion("store.close_date <>", value, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateGreaterThan(Date value) {
            addCriterion("store.close_date >", value, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateGreaterThanOrEqualTo(Date value) {
            addCriterion("store.close_date >=", value, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateLessThan(Date value) {
            addCriterion("store.close_date <", value, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateLessThanOrEqualTo(Date value) {
            addCriterion("store.close_date <=", value, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateIn(List<Date> values) {
            addCriterion("store.close_date in", values, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateNotIn(List<Date> values) {
            addCriterion("store.close_date not in", values, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateBetween(Date value1, Date value2) {
            addCriterion("store.close_date between", value1, value2, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateNotBetween(Date value1, Date value2) {
            addCriterion("store.close_date not between", value1, value2, "closeDate");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("store.status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("store.status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("store.status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("store.status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("store.status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("store.status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("store.status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("store.status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("store.status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("store.status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("store.status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("store.status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("store.status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("store.status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("store.is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("store.is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(Boolean value) {
            addCriterion("store.is_deleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(Boolean value) {
            addCriterion("store.is_deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(Boolean value) {
            addCriterion("store.is_deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("store.is_deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(Boolean value) {
            addCriterion("store.is_deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("store.is_deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<Boolean> values) {
            addCriterion("store.is_deleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<Boolean> values) {
            addCriterion("store.is_deleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("store.is_deleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("store.is_deleted not between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andRecUserCodeIsNull() {
            addCriterion("store.rec_user_code is null");
            return (Criteria) this;
        }

        public Criteria andRecUserCodeIsNotNull() {
            addCriterion("store.rec_user_code is not null");
            return (Criteria) this;
        }

        public Criteria andRecUserCodeEqualTo(String value) {
            addCriterion("store.rec_user_code =", value, "recUserCode");
            return (Criteria) this;
        }

        public Criteria andRecUserCodeNotEqualTo(String value) {
            addCriterion("store.rec_user_code <>", value, "recUserCode");
            return (Criteria) this;
        }

        public Criteria andRecUserCodeGreaterThan(String value) {
            addCriterion("store.rec_user_code >", value, "recUserCode");
            return (Criteria) this;
        }

        public Criteria andRecUserCodeGreaterThanOrEqualTo(String value) {
            addCriterion("store.rec_user_code >=", value, "recUserCode");
            return (Criteria) this;
        }

        public Criteria andRecUserCodeLessThan(String value) {
            addCriterion("store.rec_user_code <", value, "recUserCode");
            return (Criteria) this;
        }

        public Criteria andRecUserCodeLessThanOrEqualTo(String value) {
            addCriterion("store.rec_user_code <=", value, "recUserCode");
            return (Criteria) this;
        }

        public Criteria andRecUserCodeLike(String value) {
            addCriterion("store.rec_user_code like", value, "recUserCode");
            return (Criteria) this;
        }

        public Criteria andRecUserCodeNotLike(String value) {
            addCriterion("store.rec_user_code not like", value, "recUserCode");
            return (Criteria) this;
        }

        public Criteria andRecUserCodeIn(List<String> values) {
            addCriterion("store.rec_user_code in", values, "recUserCode");
            return (Criteria) this;
        }

        public Criteria andRecUserCodeNotIn(List<String> values) {
            addCriterion("store.rec_user_code not in", values, "recUserCode");
            return (Criteria) this;
        }

        public Criteria andRecUserCodeBetween(String value1, String value2) {
            addCriterion("store.rec_user_code between", value1, value2, "recUserCode");
            return (Criteria) this;
        }

        public Criteria andRecUserCodeNotBetween(String value1, String value2) {
            addCriterion("store.rec_user_code not between", value1, value2, "recUserCode");
            return (Criteria) this;
        }

        public Criteria andRecTimeStampIsNull() {
            addCriterion("store.rec_time_stamp is null");
            return (Criteria) this;
        }

        public Criteria andRecTimeStampIsNotNull() {
            addCriterion("store.rec_time_stamp is not null");
            return (Criteria) this;
        }

        public Criteria andRecTimeStampEqualTo(Date value) {
            addCriterion("store.rec_time_stamp =", value, "recTimeStamp");
            return (Criteria) this;
        }

        public Criteria andRecTimeStampNotEqualTo(Date value) {
            addCriterion("store.rec_time_stamp <>", value, "recTimeStamp");
            return (Criteria) this;
        }

        public Criteria andRecTimeStampGreaterThan(Date value) {
            addCriterion("store.rec_time_stamp >", value, "recTimeStamp");
            return (Criteria) this;
        }

        public Criteria andRecTimeStampGreaterThanOrEqualTo(Date value) {
            addCriterion("store.rec_time_stamp >=", value, "recTimeStamp");
            return (Criteria) this;
        }

        public Criteria andRecTimeStampLessThan(Date value) {
            addCriterion("store.rec_time_stamp <", value, "recTimeStamp");
            return (Criteria) this;
        }

        public Criteria andRecTimeStampLessThanOrEqualTo(Date value) {
            addCriterion("store.rec_time_stamp <=", value, "recTimeStamp");
            return (Criteria) this;
        }

        public Criteria andRecTimeStampIn(List<Date> values) {
            addCriterion("store.rec_time_stamp in", values, "recTimeStamp");
            return (Criteria) this;
        }

        public Criteria andRecTimeStampNotIn(List<Date> values) {
            addCriterion("store.rec_time_stamp not in", values, "recTimeStamp");
            return (Criteria) this;
        }

        public Criteria andRecTimeStampBetween(Date value1, Date value2) {
            addCriterion("store.rec_time_stamp between", value1, value2, "recTimeStamp");
            return (Criteria) this;
        }

        public Criteria andRecTimeStampNotBetween(Date value1, Date value2) {
            addCriterion("store.rec_time_stamp not between", value1, value2, "recTimeStamp");
            return (Criteria) this;
        }
        
        public Criteria andStoreTireIsNull() {
            addCriterion("store.store_tire is null");
            return (Criteria) this;
        }

        public Criteria andStoreTireIsNotNull() {
            addCriterion("store.store_tire is not null");
            return (Criteria) this;
        }

        public Criteria andStoreTireEqualTo(String value) {
            addCriterion("store.store_tire =", value, "storeTire");
            return (Criteria) this;
        }

        public Criteria andStoreTireNotEqualTo(String value) {
            addCriterion("store.store_tire <>", value, "storeTire");
            return (Criteria) this;
        }

        public Criteria andStoreTireGreaterThan(String value) {
            addCriterion("store.store_tire >", value, "storeTire");
            return (Criteria) this;
        }

        public Criteria andStoreTireGreaterThanOrEqualTo(String value) {
            addCriterion("store.store_tire >=", value, "storeTire");
            return (Criteria) this;
        }

        public Criteria andStoreTireLessThan(String value) {
            addCriterion("store.store_tire <", value, "storeTire");
            return (Criteria) this;
        }

        public Criteria andStoreTireLessThanOrEqualTo(String value) {
            addCriterion("store.store_tire <=", value, "storeTire");
            return (Criteria) this;
        }

        public Criteria andStoreTireLike(String value) {
            addCriterion("store.store_tire like", value, "storeTire");
            return (Criteria) this;
        }

        public Criteria andStoreTireNotLike(String value) {
            addCriterion("store.store_tire not like", value, "storeTire");
            return (Criteria) this;
        }

        public Criteria andStoreTireIn(List<String> values) {
            addCriterion("store.store_tire in", values, "storeTire");
            return (Criteria) this;
        }

        public Criteria andStoreTireNotIn(List<String> values) {
            addCriterion("store.store_tire not in", values, "storeTire");
            return (Criteria) this;
        }

        public Criteria andStoreTireBetween(String value1, String value2) {
            addCriterion("store.store_tire between", value1, value2, "storeTire");
            return (Criteria) this;
        }

        public Criteria andStoreTireNotBetween(String value1, String value2) {
            addCriterion("store.store_tire not between", value1, value2, "storeTire");
            return (Criteria) this;
        }

        public Criteria andVisitTargetIsNull() {
            addCriterion("store.visit_target is null");
            return (Criteria) this;
        }

        public Criteria andVisitTargetIsNotNull() {
            addCriterion("store.visit_target is not null");
            return (Criteria) this;
        }

        public Criteria andVisitTargetEqualTo(String value) {
            addCriterion("store.visit_target =", value, "visitTarget");
            return (Criteria) this;
        }

        public Criteria andVisitTargetNotEqualTo(String value) {
            addCriterion("store.visit_target <>", value, "visitTarget");
            return (Criteria) this;
        }

        public Criteria andVisitTargetGreaterThan(String value) {
            addCriterion("store.visit_target >", value, "visitTarget");
            return (Criteria) this;
        }

        public Criteria andVisitTargetGreaterThanOrEqualTo(String value) {
            addCriterion("store.visit_target >=", value, "visitTarget");
            return (Criteria) this;
        }

        public Criteria andVisitTargetLessThan(String value) {
            addCriterion("store.visit_target <", value, "visitTarget");
            return (Criteria) this;
        }

        public Criteria andVisitTargetLessThanOrEqualTo(String value) {
            addCriterion("store.visit_target <=", value, "visitTarget");
            return (Criteria) this;
        }

        public Criteria andVisitTargetLike(String value) {
            addCriterion("store.visit_target like", value, "visitTarget");
            return (Criteria) this;
        }

        public Criteria andVisitTargetNotLike(String value) {
            addCriterion("store.visit_target not like", value, "visitTarget");
            return (Criteria) this;
        }

        public Criteria andVisitTargetIn(List<String> values) {
            addCriterion("store.visit_target in", values, "visitTarget");
            return (Criteria) this;
        }

        public Criteria andVisitTargetNotIn(List<String> values) {
            addCriterion("store.visit_target not in", values, "visitTarget");
            return (Criteria) this;
        }

        public Criteria andVisitTargetBetween(String value1, String value2) {
            addCriterion("store.visit_target between", value1, value2, "visitTarget");
            return (Criteria) this;
        }

        public Criteria andVisitTargetNotBetween(String value1, String value2) {
            addCriterion("store.visit_target not between", value1, value2, "visitTarget");
            return (Criteria) this;
        }

        public Criteria andInStoreTimeIsNull() {
            addCriterion("store.in_store_time is null");
            return (Criteria) this;
        }

        public Criteria andInStoreTimeIsNotNull() {
            addCriterion("store.in_store_time is not null");
            return (Criteria) this;
        }

        public Criteria andInStoreTimeEqualTo(Integer value) {
            addCriterion("store.in_store_time =", value, "inStoreTime");
            return (Criteria) this;
        }

        public Criteria andInStoreTimeNotEqualTo(Integer value) {
            addCriterion("store.in_store_time <>", value, "inStoreTime");
            return (Criteria) this;
        }

        public Criteria andInStoreTimeGreaterThan(Integer value) {
            addCriterion("store.in_store_time >", value, "inStoreTime");
            return (Criteria) this;
        }

        public Criteria andInStoreTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("store.in_store_time >=", value, "inStoreTime");
            return (Criteria) this;
        }

        public Criteria andInStoreTimeLessThan(Integer value) {
            addCriterion("store.in_store_time <", value, "inStoreTime");
            return (Criteria) this;
        }

        public Criteria andInStoreTimeLessThanOrEqualTo(Integer value) {
            addCriterion("store.in_store_time <=", value, "inStoreTime");
            return (Criteria) this;
        }

        public Criteria andInStoreTimeIn(List<Integer> values) {
            addCriterion("store.in_store_time in", values, "inStoreTime");
            return (Criteria) this;
        }

        public Criteria andInStoreTimeNotIn(List<Integer> values) {
            addCriterion("store.in_store_time not in", values, "inStoreTime");
            return (Criteria) this;
        }

        public Criteria andInStoreTimeBetween(Integer value1, Integer value2) {
            addCriterion("store.in_store_time between", value1, value2, "inStoreTime");
            return (Criteria) this;
        }

        public Criteria andInStoreTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("store.in_store_time not between", value1, value2, "inStoreTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}