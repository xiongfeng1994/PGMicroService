package com.ebest.cloud.mapper;



import com.ebest.cloud.entity.PersonRoleBanner;
import com.ebest.cloud.entity.PersonRoleBannerKey;

/**
 * person_role_banner mapper interface class
 * @author ebest
 *
 */
public interface PersonRoleBannerMapper extends BaseMapper<PersonRoleBanner>{
	/**
	 * delete person_role_banner by primary key
	 * @param key
	 * @return int
	 */
    int deleteByPrimaryKey(PersonRoleBannerKey key);

    /**
	 * select person_role_banner by primary key
	 * @param key
	 * @return person_role_banner
	 */
    PersonRoleBanner selectByPrimaryKey(PersonRoleBannerKey key);
    
    /**
     * select count by primary key
     * @param bannerCode
     * @param code
     * @return int
     */
    int selectCountByPrimaryKey(String bannerCode, String code);
}