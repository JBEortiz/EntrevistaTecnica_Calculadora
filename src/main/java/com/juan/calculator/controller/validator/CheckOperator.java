package com.juan.calculator.controller.validator;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = OperatorValidatorImpl.class)
@Documented
public @interface CheckOperator {

	String message() default "the operator valid -,+";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

}
