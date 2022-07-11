package com.juan.calculator.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.juan.calculator.service.CalculatorService;

@SpringBootTest
public class CalculatorControllerTest {

	@Autowired
	private CalculatorService service;
	
	@Test
	public void sumControllerTest() {
		CalculatorController calculatorController= new CalculatorController(service);
		double result= calculatorController.calculateSum(2, 4);
		Assertions.assertEquals(6, result);
	}
	
	@Test
	public void subtractControllerTest() {
		CalculatorController calculatorController= new CalculatorController(service);
		double result= calculatorController.calculateSubtract(2, 4);
		Assertions.assertEquals(-2, result);
	}
}
