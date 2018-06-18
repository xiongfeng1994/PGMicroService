package com.ebest.cloud.mapper;

/**
 * region table operation interface
 * @author ebest
 *
 */
public interface RegionMapper {
	
	/**
	 * select count by primary key
	 * @param code
	 * @return
	 */
	int selectCountByPrimaryKey(String code);

}