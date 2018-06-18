package com.ebest.cloud.mapper;


/**
 * base mapper interface
 * @author ebest
 *
 * @param <T>
 */
public interface BaseMapper<T> {
	
	/**
	 * delete T(object) by primary key
	 * @param code
	 * @return int
	 */
	int deleteByPrimaryKey(String code);

	/**
	 * insert T(object)
	 * @param code
	 * @return int
	 */
    int insert(T record);

    /**
	 * insert T(object) selective
	 * @param code
	 * @return int
	 */
    int insertSelective(T record);

    /**
	 * select T(object) by primary key
	 * @param code
	 * @return T(object)
	 */
    T selectByPrimaryKey(String code);

    /**
	 * update T(object) by primary key selective
	 * @param code
	 * @return int
	 */
    int updateByPrimaryKeySelective(T record);

    /**
     * update T(object) by primary key
     * @param record
     * @return int
     */
    int updateByPrimaryKey(T record);
    
    /**
     * select count by primary key
     * @param code
     * @return int
     */
    int selectCountByPrimaryKey(String code);
}
