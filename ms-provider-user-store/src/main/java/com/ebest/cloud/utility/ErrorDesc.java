package com.ebest.cloud.utility;
/**
 * Enumerating classes that store error details
 * @author ebest
 *
 */
public class ErrorDesc{
	
	/**
	 * the store tier is not allowed
	 */
	public final static String TIERVULEMAX = "%s %s does not allowed : the value must be a number and less than 10";
	/**
	 * the parameters are null or empty
	 */
	public final static String PARAMISEMPTY = "%s %s is null or empty";
	/**
	 * the object information that is operated is not found in the database
	 */
	public final static String PARAMCANNOTFOUNDORDELETED = "%s %s does not exist";
	/**
	 * the number of telephone or mobile phone number is not correct
	 */
	public final static String ISNOTAPHONE =	"%s %s is not a phone number";
	/**
	 * the object  already exist
	 */
	public final static String ISEXIST = "%s %s  already exist";	
	/**
	 * status  does not allowed
	 */
	public final static String STATUSNOTALLOW = "%s %s only could be 'Plan to Open,Active,Suspend,Closed'";
}
