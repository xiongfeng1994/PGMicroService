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
import com.ebest.cloud.utility.validator.StoreTireValidator;

/**
 * the value must be a number and less than 10
 * @author ebest
 *
 */
@Constraint(validatedBy = StoreTireValidator.class)
@Target({ElementType.PARAMETER, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface StoreTire {
	
	/**
	 * Regular expression for validation
	 * @return String
	 */
	String regexp() default Regexen.STORETIRE;
	
	/**
	 * error message
	 * @return String
	 */
	String message() default ErrorDesc.TIERVULEMAX;

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
