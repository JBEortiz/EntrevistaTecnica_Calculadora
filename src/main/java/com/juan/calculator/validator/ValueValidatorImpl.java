package com.juan.calculator.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValueValidatorImpl implements ConstraintValidator<CheckValueValidator, Double> {

	@SuppressWarnings("unused")
	@Override
	public boolean isValid(Double value, ConstraintValidatorContext context) {
		boolean condition = true;
		String message = "";
		if (value != null) {
			message = "Has exceeded the minimum  value allowed";
			condition = value >= Double.MIN_VALUE;
		}
		if (value != null) {
			message = "Has exceeded the maximum value allowed";
			condition = value <= Double.MAX_VALUE;
		}
		if (value == null) {
			message = "Field is null";
			condition = false;
		}

		if (!condition) {
			String validationMessage = this.buildValidationMessage(message, value);
			context.buildConstraintViolationWithTemplate(validationMessage).addPropertyNode("operation")
					.addConstraintViolation();
		}

		return condition;
	}

	private String buildValidationMessage(String message, Double value) {
		return String.format(message + value);
	}

}
