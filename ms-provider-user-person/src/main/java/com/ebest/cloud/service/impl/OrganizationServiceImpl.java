package com.ebest.cloud.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebest.cloud.controller.PersonController;
import com.ebest.cloud.mapper.OrganizationMapper;
import com.ebest.cloud.service.OrganizationService;
import com.ebest.cloud.utility.Result;

/**
 * organization service implements class
 * @author ebest
 *
 */
@Service
public class OrganizationServiceImpl implements OrganizationService{
	
	private static final Logger log = LoggerFactory.getLogger(PersonController.class);

	@Autowired
	OrganizationMapper organizationMapper;
	
	@Override
	public boolean isExistCode(String code, Result result) {
		boolean isExist = organizationMapper.selectCountByPrimaryKey(code) > 0;
		if(isExist) {
			result.addErrorDesc("组织架构已存在");
			return true;
		}
		return false;
	}

}
