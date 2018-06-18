package com.ebest.cloud.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebest.cloud.mapper.StoreTypeMapper;
import com.ebest.cloud.service.StoreTypeService;
import com.ebest.cloud.utility.ConstantClassField;
import com.ebest.cloud.utility.ErrorDesc;
import com.ebest.cloud.utility.Result;

/**
 * the StoreTypeService implementation class
 * @author ebest
 *
 */
@Service
public class StoreTypeServiceImpl implements StoreTypeService {
	
	// the name of the parameter to be validated
	private String checkName = ConstantClassField.STORETYPECODE;
	
	// defind mapper object
	
	@Autowired
	StoreTypeMapper mapper;
	
	/**
	 * check the store type code and record error description
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
