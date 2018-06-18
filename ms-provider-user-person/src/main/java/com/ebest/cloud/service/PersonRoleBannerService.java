package com.ebest.cloud.service;

import com.ebest.cloud.utility.Result;

/**
 * person_role_banner service interface
 * @author ebest
 *
 */
public interface PersonRoleBannerService {

	boolean isExistCode(String bannerCode, String code, Result result);
}
