package com.ebest.cloud.service;

import com.ebest.cloud.utility.Result;

/**
 * banners service
 * @author ebest
 *
 */
public interface BannersService {
	
	/**
	 * check the banners code and record error description
	 */
	boolean checkCodeRecordDescription(String code, Result returnResultJson);

}
