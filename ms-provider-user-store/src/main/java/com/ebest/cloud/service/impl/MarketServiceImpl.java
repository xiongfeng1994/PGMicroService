package com.ebest.cloud.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebest.cloud.mapper.MarketMapper;
import com.ebest.cloud.service.MarketService;
import com.ebest.cloud.utility.ConstantClassField;
import com.ebest.cloud.utility.ErrorDesc;
import com.ebest.cloud.utility.Result;

/**
 * the MarketService implementation class
 * @author ebest
 *
 */
@Service
public class MarketServiceImpl implements MarketService {
	
	// the name of the parameter to be validated
	private String checkName = ConstantClassField.MARKETCODE;
	
	// defind mapper object
	@Autowired
	MarketMapper mapper;
	
	/**
	 * check the market code and record error description
	 */
	@Override
	public boolean checkCodeRecordDescription(String code, Result result) {
		
		// select the count of this code
		int count = mapper.selectCountByPrimaryKey(code);
		
		if(count == 0) {
			
			// record error description
			result.addErrorDesc(String.format(ErrorDesc.PARAMCANNOTFOUNDORDELETED, checkName, code));
			// return failed
			return false;
		}
		// return success
		return true;
	}
}
