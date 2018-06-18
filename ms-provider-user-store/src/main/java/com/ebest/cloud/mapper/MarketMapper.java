package com.ebest.cloud.mapper;

/**
 * market table operation interface
 * @author ebest
 *
 */
public interface MarketMapper {
	
	/**
	 * select count by primary key
	 * @param code
	 * @return
	 */
	int selectCountByPrimaryKey(String code);

}