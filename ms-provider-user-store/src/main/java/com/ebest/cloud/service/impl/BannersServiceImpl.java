package com.ebest.cloud.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebest.cloud.mapper.BannersMapper;
import com.ebest.cloud.service.BannersService;
import com.ebest.cloud.utility.ConstantClassField;
import com.ebest.cloud.utility.ErrorDesc;
import com.ebest.cloud.utility.Result;
/**
 * the BannersService implementation class
 * @author ebest
 *
 */
@Service
public class BannersServiceImpl implements BannersService {
	
	// the name of the parameter to be validated
	private String checkName = ConstantClassField.BANNERCODE;
	
	// defind mapper object
	@Autowired
	BannersMapper mapper;
	
	/**
	 * check the banners code and record error description
	 */
	@Override
	public boolean checkCodeRecordDescription(String code, Result returnResultJson) {
		
		// select the count of this code
		int count = mapper.selectCountByPrimaryKey(code);
		
		if(count == 0) {
			
			// record error description
			returnResultJson.addErrorDesc(String.format(ErrorDesc.PARAMCANNOTFOUNDORDELETED, checkName, code));
			// return failed
			return false;	
		}
		
		// return success
		return true;
	}

}
