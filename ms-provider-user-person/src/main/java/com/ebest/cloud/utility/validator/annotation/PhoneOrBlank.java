package com.ebest.cloud.utility.validator.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.ebest.cloud.utility.Regexen;
import com.ebest.cloud.utility.ErrorDesc;
import com.ebest.cloud.utility.validator.PhoneOrBlankValidator;

/**
 * the annotation use to check the field or the paramter is or not is a phone or blank 
 * @author ebest
 *
 */
@Constraint(validatedBy = PhoneOrBlankValidator.class)
@Target({ElementType.PARAMETER, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface PhoneOrBlank {
	
	/**
	 * Regular expression for validation
	 * @return String
	 */
	String regexp() default Regexen.PHONE;
	
	/**
	 * error message
	 * @return String
	 */
	String message() default ErrorDesc.ISNOTAPHONE;

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
