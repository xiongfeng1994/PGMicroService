package com.ebest.cloud.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebest.cloud.controller.PersonController;
import com.ebest.cloud.mapper.PersonRoleMapper;
import com.ebest.cloud.service.PersonRoleService;
import com.ebest.cloud.utility.Result;

/**
 * person_role service implements class
 * @author ebest
 *
 */
@Service
public class PersonRoleServiceImpl implements PersonRoleService{
	
	private static final Logger log = LoggerFactory.getLogger(PersonController.class);

	@Autowired
	PersonRoleMapper personRolemapper;
	
	@Override
	public boolean isExistCode(String code, Result result) {
		boolean isExist = personRolemapper.selectCountByPrimaryKey(code) > 0;
		if(isExist) {
			result.addErrorDesc("角色已存在");
			return true;
		}
		return false;
	}

}
