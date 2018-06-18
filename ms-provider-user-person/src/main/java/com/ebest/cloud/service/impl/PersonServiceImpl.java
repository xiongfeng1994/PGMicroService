package com.ebest.cloud.service.impl;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebest.cloud.entity.Person;
import com.ebest.cloud.mapper.PersonMapper;
import com.ebest.cloud.service.PersonService;
import com.ebest.cloud.util.DateUtil;
import com.ebest.cloud.utility.Result;

/**
 * person service implements class
 * @author ebest
 *
 */
@Service
public class PersonServiceImpl implements PersonService{
	
	private static final Logger log = LoggerFactory.getLogger(PersonServiceImpl.class);
	
	@Autowired
	PersonMapper personMapper;
	
	@Override
	public Person searchSinglePerson(String code) {
		return personMapper.selectByPrimaryKey(code);
	}

	@Override
	public boolean insertSinglePerson(Person person, String recUserCode, Result result) {
		
		return true;
	}

	@Override
	public int updateSinglePerson(Person person) {
		return personMapper.updateByPrimaryKeySelective(person);
	}

	@Override
	public int deleteSinglePerson(String code,String leaveDate) {
		return personMapper.updateIsDeleted(code,DateUtil.stringToDate(leaveDate, "yyyy-MM-dd"));
	}

	@Override
	public boolean isExistCode(String code, Result result) {
		boolean exist = personMapper.selectCountByPrimaryKey(code) > 0;
		if(exist) {
			result.addErrorDesc("人员已存在");
			return true;
		}
		return false;
	}

	@Override
	public boolean isExistLineManager(String lineManager, Result result) {
		if(StringUtils.isNoneEmpty(lineManager) || StringUtils.isNoneBlank(lineManager)) {
			Person person = personMapper.selectByPrimaryKey(lineManager);
			if(person == null) {
				result.addErrorDesc("上级主管不存在");
				return true;
			}
		}
		return false;
	}

}
