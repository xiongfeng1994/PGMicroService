package com.ebest.cloud.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebest.cloud.mapper.RegionMapper;
import com.ebest.cloud.service.RegionService;
import com.ebest.cloud.utility.ConstantClassField;
import com.ebest.cloud.utility.ErrorDesc;
import com.ebest.cloud.utility.Result;

/**
 * the RegionService implementation class
 * @author ebest
 *
 */
@Service
public class RegionServiceImpl implements RegionService {
	
	// the name of the parameter to be validated
	private String checkName = ConstantClassField.REGIONCODE;
	
	// defind mapper object
	@Autowired
	RegionMapper mapper;
	
	/**
	 * check the region code and record error description
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
