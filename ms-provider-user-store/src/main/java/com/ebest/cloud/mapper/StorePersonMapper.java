package com.ebest.cloud.mapper;

/**
 * storePerson table operation interface
 * @author ebest
 *
 */
public interface StorePersonMapper {
	
	/**
	 * select count by primary key
	 * @param code
	 * @return
	 */
	int selectCountByPrimaryKey(String code);
	

}