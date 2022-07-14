package com.juan.calculator.validator;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ElementType.TYPE,ElementType.FIELD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = OperatorValidatorImpl.class)
@Documented
public @interface CheckOperatorValidator {

	String message() default "the operator valid -,+";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

}
