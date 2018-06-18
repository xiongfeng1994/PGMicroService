package com.ebest.cloud.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebest.cloud.entity.Store;
import com.ebest.cloud.entity.sqlconditions.DetailStoreSQLConditions;
import com.ebest.cloud.mapper.StoreMapper;
import com.ebest.cloud.service.BannersService;
import com.ebest.cloud.service.ChannelService;
import com.ebest.cloud.service.LocationService;
import com.ebest.cloud.service.MarketService;
import com.ebest.cloud.service.RegionService;
import com.ebest.cloud.service.StoreService;
import com.ebest.cloud.service.StoreTypeService;
import com.ebest.cloud.utility.ConstantClassField;
import com.ebest.cloud.utility.ConvertColumn;
import com.ebest.cloud.utility.ErrorDesc;
import com.ebest.cloud.utility.Result;
import com.github.pagehelper.PageHelper;



/**
 * implement storeService
 * @author ebest
 *
 */
@Service
public class StoreServiceImpl implements StoreService {
	
	// the name of the parameter to be validated
	private String checkName = ConstantClassField.STORECODE;
	
	// define mapper object
	@Autowired
	private StoreMapper storeMapper;
	
	// define service object
	@Autowired
	private RegionService regionService;
	@Autowired
	private MarketService marketService;
	@Autowired
	private BannersService bannersService;
	@Autowired
	private LocationService locationService;
	@Autowired
	private ChannelService channelService;
	@Autowired
	private StoreTypeService storeTypeService;
	
	/**
	 * Query the store by condition
	 */
	@Override
	public List<Store> searchStore(String storeCode, String storeName, String storeType, String bannerCode, String channelCode, String regionCode,
			String marketCode, String storeOwnerCode, int offset, int limit, String orderbyField) {
		// get the detailStoreSQLConditions instance for splicing conditions
		DetailStoreSQLConditions detailStoreSQLConditions = new DetailStoreSQLConditions();
		DetailStoreSQLConditions.Criteria criteria = detailStoreSQLConditions.createCriteria();
		
		// splicing conditions
		criteria.andIsDeletedEqualTo(false);
		if(StringUtils.isNotBlank(storeCode)) {
			criteria.andCodeEqualTo(StringUtils.trim(storeCode));
		}
		if (StringUtils.isNotBlank(storeName)) {
			criteria.andNameLike(ConstantClassField.PERCENTSIGN + StringUtils.trim(storeName) + ConstantClassField.PERCENTSIGN);
		}
		if (StringUtils.isNotBlank(storeType)) {
			criteria.andStoreTypeCodeEqualTo(StringUtils.trim(storeType));
		}
		if (StringUtils.isNotBlank(bannerCode)) {
			criteria.andBannerCodeEqualTo(StringUtils.trim(bannerCode));
		}
		if (StringUtils.isNotBlank(channelCode)) {
			criteria.andChannelCodeEqualTo(StringUtils.trim(channelCode));
		}
		if (StringUtils.isNotBlank(regionCode)) {
			criteria.andRegionCodeEqualTo(StringUtils.trim(regionCode));
		}
		if (StringUtils.isNotBlank(marketCode)) {
			criteria.andMarketCodeEqualTo(StringUtils.trim(marketCode));
		}
		if (StringUtils.isNotBlank(storeOwnerCode)) {
			criteria.andStoreOwnerCodeEqualTo(StringUtils.trim(storeOwnerCode));
		}
		if(StringUtils.isNotBlank(orderbyField)) {
			detailStoreSQLConditions.setOrderByClause(String.format(ConstantClassField.ORDERBYCLAUSE, ConvertColumn.fromParamter(orderbyField), ConstantClassField.DESC));
		}
		
		// paging
		PageHelper.startPage(offset, limit);
		
		// search  stores data
		return storeMapper.selectDetailStoresBySqlConditions(detailStoreSQLConditions);
	}
	
	
	/**
	 * search store by store code
	 */
	public Store searchStoreByCode(String code) {
		
		// search store
		List<Store> store = searchStore(code, null, null, null, null, null, null, null, ConstantClassField.OFFSETDEFAULT_INT, ConstantClassField.LIMITDEFAULT_INT, ConstantClassField.STORECODE);
		
		// determine store data
		if(store.isEmpty()) {
			return null;
		}
		
		// return store data
		return store.get(0);
	}
	
	
	/**
	 * create store and record error description
	 */
	public boolean createStore(Store store, String recUserCode, Result result) {
		
		// define store code
		String code = store.getCode();
		
		// check other master code vaild
		if(checkStoreDependence(store, result)) {
			
			// set extend fields
			store.setRecTimeStamp(new Date());
			store.setIsDeleted(false);
			store.setRecUserCode(recUserCode);
			
			if(checkCreateStoreCode(code)) { 
				
				storeMapper.insert(store);
			} else{
				
				storeMapper.updateByPrimaryKey(store);
			
			}
			// return success
			return true;
		} else {
			// return failed
			return false;
		}
	}
	
	/**
	 * update store and record error description
	 */
	public boolean updateStore(Store store, String recUserCode, Result result) {
		
		// define store code
		String code = store.getCode();
		
		// check other master code vaild
		if(checkUpdateStoreCode(code, result)
				& checkStoreDependence(store, result)) {
			
			// set store information
			store.setRecTimeStamp(new Date());
			store.setIsDeleted(false);
			store.setRecUserCode(recUserCode);
			
			// update store
			storeMapper.updateByPrimaryKeySelective(store);
			
			// return success
			return true;
		}
		// return failed
		return false;
	}
	
	/**
	 * delete store and record error description
	 */
	@Override
	public boolean deleteStore(String code, String recUserCode, Result result) {
		
		// check the validity of the code
		Store store = storeMapper.selectByPrimaryKey(code);
		
		if(store == null) {
			
			// add error desc
			result.addErrorDesc(String.format(ErrorDesc.PARAMCANNOTFOUNDORDELETED, checkName, code));
			
			// return failed
			return false;
		}else {
			
			// set store information
			store.setIsDeleted(true);
			store.setStatus(ConstantClassField.STATUSCLOSED);
			store.setRecUserCode(recUserCode);
			store.setRecTimeStamp(new Date());
			
			// update store
			storeMapper.updateByPrimaryKeySelective(store);
			
			// return success
			return true;
		}
	}
	/**
	 * check the code for createStore
	 * @param code
	 * @param result
	 * @return
	 */
	private boolean checkCreateStoreCode(String code) {
		// check store code exist or not
		return checkStoreCode(code, null);
		
	}
	/**
	 * check the code for update Store
	 * @param code
	 * @param result
	 * @return
	 */
	private boolean checkUpdateStoreCode(String code,Result result) {
		
		// check store code exist or not
		if(!checkStoreCode(code, false)) {
					
			// add error desc
			result.addErrorDesc(String.format(ErrorDesc.PARAMCANNOTFOUNDORDELETED, checkName, code));
					
			// return success
			return false;
		}
		
		//return success
		return true;
	}
	/**
	 * check the validity of store code
	 */
	private boolean checkStoreCode(String code, Boolean isDeleted) {
		return storeMapper.selectCountByPrimaryKey(code, isDeleted) > 0;
	}
	
	/**
	 * Check the validity of the code value that the store depends on
	 */
	private boolean checkStoreDependence(Store store, Result result) {	
		return regionService.checkCodeRecordDescription(store.getRegionCode(), result)
			&  marketService.checkCodeRecordDescription(store.getMarketCode(), result)
			&  bannersService.checkCodeRecordDescription(store.getBannerCode(), result)
			&  locationService.checkCodeRecordDescription(store.getLocationCode(), result)
			&  channelService.checkCodeRecordDescription(store.getChannelCode(), result)
			&  storeTypeService.checkCodeRecordDescription(store.getStoreTypeCode(), result);
	}
	
}
