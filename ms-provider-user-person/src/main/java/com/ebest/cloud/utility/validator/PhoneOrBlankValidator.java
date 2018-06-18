package com.ebest.cloud.utility.validator;

import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.lang3.StringUtils;

import com.ebest.cloud.utility.validator.annotation.PhoneOrBlank;

/**
 * the validator can use to check the value is blank or is phone 
 * @author ebest
 *
 */
public class PhoneOrBlankValidator implements ConstraintValidator<PhoneOrBlank, String> {
	
	private String regexp = null;
	
	/**
	 * init validator
	 */
	@Override
	public void initialize(PhoneOrBlank phoneOrBlank) {
		
		// init regexp
		regexp=phoneOrBlank.regexp();
	}
	
	/**
	 * check value
	 */
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		
		// check value 
		return StringUtils.isBlank(value)||Pattern.matches(regexp, value.trim());
	}

}
