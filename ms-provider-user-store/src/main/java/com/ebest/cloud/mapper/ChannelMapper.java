package com.ebest.cloud.mapper;

/**
 * Channel table operation interface
 * @author ebest
 *
 */
public interface ChannelMapper {
	
	/**
	 * select count by primary key
	 * @param code
	 * @return
	 */
	int selectCountByPrimaryKey(String code);

}