package com.juan.calculator.controller.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class OperatorValidatorImpl implements ConstraintValidator<CheckOperator, String> {

	@Override
	public boolean isValid(String operator, ConstraintValidatorContext context) {
		boolean condition = false;

		switch (operator) {
		case "-":
			condition = true;
			break;
		case "+":
			condition = true;
			break;
		}

		if (!condition) {
			String validationMessage = this.buildValidationMessage(operator);
			context.buildConstraintViolationWithTemplate(validationMessage)
			        .addPropertyNode("operation")
			        .addConstraintViolation();
		}

		return condition;
	}
	
	private String buildValidationMessage(String operator) {
		return String.format("In order for the operation to be performed, it must contain the operator '+' or '-' not %s",
				operator);
	}

	

}
