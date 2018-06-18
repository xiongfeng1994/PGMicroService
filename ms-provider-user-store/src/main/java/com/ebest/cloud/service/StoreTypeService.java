package com.ebest.cloud.service;

import com.ebest.cloud.utility.Result;
/**
 * store type service
 * @author ebest
 *
 */
public interface StoreTypeService {
	/**
	 * check the store type code and record error description
	 */
	boolean checkCodeRecordDescription(String code, Result returnResultJson);
	
}
