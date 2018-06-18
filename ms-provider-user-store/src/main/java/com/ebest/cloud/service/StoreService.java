package com.ebest.cloud.service;

import java.util.List;

import com.ebest.cloud.entity.Store;
import com.ebest.cloud.utility.Result;
/**
 * store service
 * @author ebest
 *
 */
public interface StoreService {
	
	/**
	 * search store
	 * @param storeName
	 * @param storeType
	 * @param bannerCode
	 * @param channelCode
	 * @param regionCode
	 * @param marketCode
	 * @param storeOwnerCode
	 * @return
	 */
	List<Store> searchStore(String storeCode, String storeName, String storeType, String bannerCode, String channelCode, String regionCode, String marketCode, String storeOwnerCode, int offset, int limit, String orderbyField);
	
	/**
	 * search store by storecode
	 * @param code
	 * @return
	 */
	Store searchStoreByCode(String code);
	
	/**
	 * create store
	 * @param store
	 * @param returnResultJson
	 * @return
	 */
	boolean createStore(Store store, String recUserCode, Result returnResultJson);
	
	/**
	 * update store
	 * @param store
	 * @param returnResultJson
	 * @return
	 */
	boolean updateStore(Store store, String recUserCode, Result returnResultJson);
	
	/**
	 * delete store
	 * @param code
	 * @param recUserCode
	 * @param returnResultJson
	 * @return
	 */
	boolean deleteStore(String code, String recUserCode, Result returnResultJson);
	
	
}
