package com.ebest.cloud.mapper;


import java.util.Date;

import org.apache.ibatis.annotations.Param;

import com.ebest.cloud.entity.Person;

/**
 * person mapper interface class
 * @author ebest
 *
 */
public interface PersonMapper extends BaseMapper<Person>{

	/**
	 * update is_deleted to 1(0:undeleted,1:deleted)
	 * @param code
	 * @return int
	 */
	int updateIsDeleted(@Param("code") String code,@Param("leaveDate") Date leaveDate);
	
	Person selectDetailByLineManger(String lineManager);
	
}