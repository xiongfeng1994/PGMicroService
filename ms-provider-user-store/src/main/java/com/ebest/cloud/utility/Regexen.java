package com.ebest.cloud.utility;

/**
 * Validation help class
 * 
 * @author ebest
 *
 */
public class Regexen {

	/**
	 * regular validation cell phone number
	 */
	public final static String CELLPHONE = "^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(18[0,5-9]))\\d{8}$";
	/**
	 * regular validation machine number
	 */
	public final static String TELEPHONE = "^((0\\d{2}-)?\\d{8}(-\\d{1,4})?)|(0\\d{3}-\\d{7,8}(-\\d{1,4})?)$";
	/**
	 * regular validation a mobile phone or a home phone number
	 */
	public final static String PHONE = "^(((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(18[0,5-9]))\\d{8})|((0\\d{2}-)?\\d{8}(-\\d{1,4})?)|(0\\d{3}-\\d{7,8}(-\\d{1,4})?)$";
	/**
	 * regular validation storeTire
	 * 
	 */
	public final static String STORETIRE = "^(10)|[0-9]$";
}
