package com.ebest.cloud.mapper;

/**
 * storeType table operation interface
 * @author ebest
 *
 */
public interface StoreTypeMapper {
	/**
	 * select count by primary key
	 * @param code
	 * @return
	 */
	int selectCountByPrimaryKey(String code);
}