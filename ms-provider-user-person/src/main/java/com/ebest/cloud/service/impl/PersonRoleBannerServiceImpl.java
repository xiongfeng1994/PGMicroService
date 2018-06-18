package com.ebest.cloud.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebest.cloud.controller.PersonController;
import com.ebest.cloud.mapper.PersonRoleBannerMapper;
import com.ebest.cloud.service.PersonRoleBannerService;
import com.ebest.cloud.utility.Result;

/**
 * person_role_banner service implements class
 * @author ebest
 *
 */
@Service
public class PersonRoleBannerServiceImpl implements PersonRoleBannerService{
	
	private static final Logger log = LoggerFactory.getLogger(PersonController.class);

	@Autowired
	PersonRoleBannerMapper personRoleBannerMapper;
	
	@Override
	public boolean isExistCode(String bannerCode, String code, Result result) {
		boolean isExist = personRoleBannerMapper.selectCountByPrimaryKey(bannerCode, code) > 0;
		if(isExist) {
			result.addErrorDesc("连锁集团已存在");
			return true;
		}
		return false;
	}

}
