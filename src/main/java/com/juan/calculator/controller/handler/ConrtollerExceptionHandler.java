package com.juan.calculator.controller.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice(basePackages = "com.juan.calculator.controller")
public class ConrtollerExceptionHandler {
	
	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ExceptionHandler(value = IllegalArgumentException.class)
	public ErrorMessage illegalArgumentException(IllegalArgumentException exception, WebRequest request) {
		return ErrorMessage.builder().message(exception.getMessage()).statusCode(HttpStatus.NOT_FOUND.value()).build();
		
	}
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(value = NumberFormatException .class)
	public ErrorMessage resourceNotFoundException(NumberFormatException exception, WebRequest request) {
		return ErrorMessage.builder().message(exception.getMessage()).statusCode(HttpStatus.BAD_REQUEST.value()).build();
		
	}
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ErrorMessage resourceNotFoundException(MethodArgumentNotValidException exception, WebRequest request) {
		return ErrorMessage.builder().message(exception.getMessage()).statusCode(HttpStatus.INTERNAL_SERVER_ERROR.value()).build();
		
	}
}