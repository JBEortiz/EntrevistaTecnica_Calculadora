package com.juan.calculator.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.juan.calculator.service.CalculatorService;

import io.corp.calculator.TracerImpl;
import lombok.RequiredArgsConstructor;
@Validated
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class CalculatorController {
	
	private final CalculatorService calculatorService;
	
	private final TracerImpl tracerImpl= new TracerImpl();
	
	/*
	 * Method in charge of making the receive data by parameter for the sum
	 * @param valueOne double
	 * @param valueTwo double
	 * 
	 * @return double
	 */
	@GetMapping("/calculate/{valueOne}/{operator}/{valueTwo}")
	public ResponseEntity<Double> calculate(@RequestParam(required = true) Double valueOne,@RequestParam(required = true) String operator, 
			@RequestParam(required = true) Double valueTwo) {
		
		tracerImpl.trace(calculatorService.operation(valueOne, operator, valueTwo));
		Double result=calculatorService.operation(valueOne, operator, valueTwo);
		return ResponseEntity.ok(result);
	}
	
	
	

}
