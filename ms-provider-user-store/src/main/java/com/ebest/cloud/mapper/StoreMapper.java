package com.ebest.cloud.mapper;

import com.ebest.cloud.entity.Store;
import com.ebest.cloud.entity.sqlconditions.DetailStoreSQLConditions;

import java.util.List;

import org.apache.ibatis.annotations.Param;
/**
 * store table operation interface
 * @author ebest
 *
 */
public interface StoreMapper {
	
	/**
	 * select count by primary key
	 * @param code
	 * @return
	 */
	int selectCountByPrimaryKey(@Param("code") String code, @Param("isDeleted") Boolean isDeleted);
	/**
	 * Insert according to the entity class
	 * @param record
	 * @return
	 */
    int insert(Store record);
    
    /**
     * Dynamic batch query store information
     * @param sqlHelper
     * @return
     */
    List<Store> selectDetailStoresBySqlConditions(DetailStoreSQLConditions sqlConditions);
       
    
    /**
     * Based on the primary key query
     * @param code
     * @return
     */
    Store selectByPrimaryKey(String code);
    
    /**
     * Modify the entity class attribute according to 
     * whether it is null or primary key
     * @param record
     * @param sqlHelper
     * @return
     */
    int updateByPrimaryKeySelective(Store record);
    
    /**
     * update store by primary key
     * @param record
     * @param sqlHelper
     * @return
     */
    int updateByPrimaryKey(Store store);
    
}