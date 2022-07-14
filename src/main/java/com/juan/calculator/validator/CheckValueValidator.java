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
@Constraint(validatedBy = ValueValidatorImpl.class)
@Documented
public @interface CheckValueValidator {

	String message() default "Error entering value";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
