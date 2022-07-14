package com.juan.calculator.controller;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juan.calculator.service.CalculatorService;
import com.juan.calculator.validator.CheckOperatorValidator;
import com.juan.calculator.validator.CheckValueValidator;

import io.corp.calculator.TracerImpl;
import lombok.RequiredArgsConstructor;

@Validated
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class CalculatorController {

	private final CalculatorService calculatorService;

	@Autowired
	private TracerImpl tracerImpl;

	/*
	 * Method in charge of making the receive data by parameter for the sum
	 * 
	 * @param valueOne Double
	 * @param operator String
	 * @param valueTwo Double
	 * 
	 * @return double
	 */
	@GetMapping("/calculate/{valueOne}/{operator}/{valueTwo}")
	public ResponseEntity<Double> calculate(@PathVariable(required = true) @CheckValueValidator Double valueOne,
			@PathVariable(required = true) @CheckOperatorValidator String operator,
			@PathVariable(required = true) @CheckValueValidator Double valueTwo) {
		
		tracerImpl.trace(calculatorService.operation(valueOne, operator, valueTwo));
		Double result = calculatorService.operation(valueOne, operator, valueTwo);
		
		return ResponseEntity.ok(result);
	}

}
