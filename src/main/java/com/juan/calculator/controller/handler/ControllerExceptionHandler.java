package com.juan.calculator.controller.handler;

import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice(basePackages = "com.juan.calculator.controller")
public class ControllerExceptionHandler {
	
	
	/*
	 * Method for exceptions 
	 * 
	 * @param exception ConstraintViolationException
	 * @param request WebRequest
	 * 
	 * @return ErrorMessage
	 */
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(ConstraintViolationException.class)
	public ErrorMessage resourceNotFoundException(ConstraintViolationException exception, WebRequest request) {
		return ErrorMessage.builder().message(exception.getMessage()).statusCode(HttpStatus.BAD_REQUEST.value()).build();
		
	}
}
