package com.ebest.cloud.mapper;

/**
 * location table operation interface
 * @author ebest
 *
 */
public interface LocationMapper {
	
	/**
	 * select count by primary key
	 * @param code
	 * @return
	 */
	int selectCountByPrimaryKey(String code);
	

}