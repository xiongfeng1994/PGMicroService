package com.ebest.cloud.service;


import com.ebest.cloud.entity.Person;
import com.ebest.cloud.utility.Result;

/**
 * person service interface class
 * @author ebest
 *
 */
public interface PersonService {

	Person searchSinglePerson(String code);
	
	boolean insertSinglePerson(Person person, String recUserCode, Result result);
	
	int updateSinglePerson(Person person);
	
	int deleteSinglePerson(String code, String leaveDate);
	
	boolean isExistCode(String code, Result result);
	
	boolean isExistLineManager(String lineManager, Result result);
}
