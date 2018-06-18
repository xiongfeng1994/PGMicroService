package com.ebest.cloud.service;

import com.ebest.cloud.utility.Result;

/**
 * channel service
 * @author ebest
 *
 */
public interface ChannelService {
	
	/**
	 * check the channel code and record error description
	 */
	boolean checkCodeRecordDescription(String code, Result returnResultJson);
}
