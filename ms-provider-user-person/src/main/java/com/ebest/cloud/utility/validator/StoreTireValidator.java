package com.ebest.cloud.utility.validator;

import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.lang3.StringUtils;

import com.ebest.cloud.utility.validator.annotation.StoreTire;

/**
 * the validator can use to check store stire
 * @author ebest
 *
 */
public class StoreTireValidator implements ConstraintValidator<StoreTire, String> {
	
	private String regexp = null;
	
	/**
	 * init validator
	 */
	@Override
	public void initialize(StoreTire storeTire) {
		
		// init regexp
		regexp=storeTire.regexp();
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
