package com.ebest.cloud.service;

import com.ebest.cloud.utility.Result;

/**
 * location service
 * @author ebest
 *
 */
public interface LocationService {
	
	/**
	 * check the location code and record error description
	 */
	boolean checkCodeRecordDescription(String code, Result returnResultJson);
	
}
