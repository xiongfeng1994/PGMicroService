package com.ebest.cloud.mapper;


/**
 * Banners table operation interface
 * @author ebest
 *
 */
public interface BannersMapper {
	/**
	 * select count by primary key
	 * @param code
	 * @return
	 */
	int selectCountByPrimaryKey(String code);

}