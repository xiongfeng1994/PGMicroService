package com.ebest.cloud.util;

import java.util.List;

import org.springframework.ui.ModelMap;

/**
 * return json data util class
 * @author ebest
 *
 */
public class ReturnUtil {

	/**
	 * return success result
	 * @param referer
	 * @param obj
	 * @return
	 */
	public static ModelMap Success(String referer, Object obj) {
        ModelMap mp = new ModelMap();
        mp.put("success", "true");
        mp.put("errorCode", "");
        mp.put("errorMsg", "");
        mp.put(referer, obj);
        return mp;
    }

	/**
	 * return error result
	 * @param errorType
	 * @param errorMsg
	 * @return ModelMap
	 */
    public static ModelMap Error(String errorCode, List errorMsg) {
    	ModelMap mp = new ModelMap();
        mp.put("success", "false");
        mp.put("errorCode", errorCode);
        mp.put("errorMsg", errorMsg);
        return mp;
    }
}
