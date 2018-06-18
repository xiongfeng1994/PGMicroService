package com.ebest.cloud.service;

import com.ebest.cloud.utility.Result;

/**
 * market service
 * @author ebest
 *
 */
public interface MarketService {
	
	/**
	 * check the market code and record error description
	 */
	boolean checkCodeRecordDescription(String code, Result returnResultJson);
	
}
