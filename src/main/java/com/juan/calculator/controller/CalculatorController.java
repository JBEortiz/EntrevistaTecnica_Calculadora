package com.juan.calculator.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.juan.calculator.service.CalculatorService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/calculator")
@RequiredArgsConstructor
public class CalculatorController {
	
	private final CalculatorService service;
	
	
	@PutMapping("/sum/{valueOne}/{valueTwo}")
	@ResponseStatus(HttpStatus.OK)
	public double calculateSum(@PathVariable double valueOne,
			@PathVariable double valueTwo) {
		return service.sumTwoNumbers(valueOne,valueTwo);
	}
	
	@PutMapping("/subtract/{valueOne}/{valueTwo}")
	@ResponseStatus(HttpStatus.OK)
	public double calculateSubtract(@PathVariable double valueOne,
			@PathVariable double valueTwo) {
		return service.subtractTwoNumbers(valueOne,valueTwo);
	}
	
	

}
