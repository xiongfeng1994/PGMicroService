package com.ebest.cloud.utility.validator.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.ebest.cloud.utility.ConstantClassField;
import com.ebest.cloud.utility.ErrorDesc;
import com.ebest.cloud.utility.validator.StoreStatusValidator;
/**
 * store status only could be 'Plan to Open,Active,Suspend,Closed'"
 * @author ebest
 *
 */
@Constraint(validatedBy = StoreStatusValidator.class)
@Target({ElementType.PARAMETER, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface StoreStatus {
	
	/**
	 * The optional values of this parameter
	 * @return String
	 */
	String	[] OptionalValues() default {ConstantClassField.STATUSOPEN,ConstantClassField.STATUSACTIVE,ConstantClassField.STATUSSUSPEND,ConstantClassField.STATUSCLOSED};
	
	/**
	 * error message
	 * @return String
	 */
	String message() default ErrorDesc.STATUSNOTALLOW;

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
