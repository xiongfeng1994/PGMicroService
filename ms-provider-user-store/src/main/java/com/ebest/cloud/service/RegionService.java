package com.ebest.cloud.service;

import com.ebest.cloud.utility.Result;

/**
 * region service
 * @author ebest
 *
 */
public interface RegionService {
	
	/**
	 * check the region code and record error description
	 */
	boolean checkCodeRecordDescription(String code, Result returnResultJson);
	
}
