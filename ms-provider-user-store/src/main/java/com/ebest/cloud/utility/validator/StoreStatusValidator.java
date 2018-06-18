package com.ebest.cloud.utility.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import com.ebest.cloud.utility.validator.annotation.StoreStatus;
/**
 * the validator can use to check store status
 * @author ebest
 *
 */
public class StoreStatusValidator implements ConstraintValidator<StoreStatus, String>{
	
	private String [] openValues;
	
	/**
	 * init validator
	 */
	@Override
	public void initialize(StoreStatus storeStatus) {
		
		// get the open values
		openValues= storeStatus.OptionalValues();
	}
	
	/**
	 * check value
	 */
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		
		// check value is not blank
		if(StringUtils.isBlank(value)) {
			
			// return success
			return true;
		}else {
			
			// lowercase value and check
			value = value.trim().toLowerCase();
			return ArrayUtils.contains(openValues, value);
		}
	}
}
