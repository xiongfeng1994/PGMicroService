package com.ebest.cloud.service;

import com.ebest.cloud.utility.Result;

/**
 * organization service interface
 * @author ebest
 *
 */
public interface OrganizationService {

	boolean isExistCode(String code, Result result);
}
