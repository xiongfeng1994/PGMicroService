package com.ebest.cloud.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebest.cloud.mapper.LocationMapper;
import com.ebest.cloud.service.LocationService;
import com.ebest.cloud.utility.ConstantClassField;
import com.ebest.cloud.utility.ErrorDesc;
import com.ebest.cloud.utility.Result;
/**
 * the LocationService implementation class
 * @author ebest
 *
 */
@Service
public class LocationServiceImpl implements LocationService {
	
	// the name of the parameter to be validated
	private String checkName = ConstantClassField.LOCATIONCODE;
	
	// defind mapper object
	@Autowired
	LocationMapper mapper;
	
	/**
	 * check the location code and record error description
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
