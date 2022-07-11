package com.juan.calculator.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.juan.calculator.service.CalculatorService;

import io.corp.calculator.TracerImpl;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/calculator")
@RequiredArgsConstructor
public class CalculatorController {
	
	private final CalculatorService service;
	
	private final TracerImpl tracerImpl= new TracerImpl();
	
	/*
	 * Method in charge of making the receive data by parameter for the sum
	 * @param valueOne double
	 * @param valueTwo double
	 * 
	 * @return double
	 */
	@PutMapping("/sum/{valueOne}/{valueTwo}")
	@ResponseStatus(HttpStatus.OK)
	public double calculateSum(@PathVariable double valueOne,
			@PathVariable double valueTwo) {
		tracerImpl.trace(service.sumTwoNumbers(valueOne,valueTwo));
		return service.sumTwoNumbers(valueOne,valueTwo);
	}
	
	/*
	 * Method in charge of making the receive data by parameter for the subtraction
	 * @param valueOne double
	 * @param valueTwo double
	 * 
	 * @return double
	 */
	@PutMapping("/subtract/{valueOne}/{valueTwo}")
	@ResponseStatus(HttpStatus.OK)
	public double calculateSubtract(@PathVariable double valueOne,
			@PathVariable double valueTwo) {
		tracerImpl.trace(service.subtractTwoNumbers(valueOne,valueTwo));
		return service.subtractTwoNumbers(valueOne,valueTwo);
	}
	
	

}
