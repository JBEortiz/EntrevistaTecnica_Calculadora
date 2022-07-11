package com.juan.calculator.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CaltulatorServiceTest {
	
	@Autowired
	private CalculatorService calculatorService;
	
	@Test
	void sumTest() {
		double result= calculatorService.sumTwoNumbers(2, 4);
		Assertions.assertEquals(6, result);
	}
	@Test
	void sumNegativeTest() {
		double result= calculatorService.sumTwoNumbers(-2, -4);
		Assertions.assertEquals(-6, result);
	}
	
	@Test
	void sumPositiveNegativeTest() {
		double result= calculatorService.sumTwoNumbers(2, -4);
		Assertions.assertEquals(-2, result);
	}
	
	@Test
	void sumZeroTest() {
		double result= calculatorService.sumTwoNumbers(0, 0);
		Assertions.assertEquals(0, result);
	}
	
	@Test
	void subtractTest() {
		double result= calculatorService.subtractTwoNumbers(2, 4);
		Assertions.assertEquals(-2, result);
	}
	
	@Test
	void subtractNegativeTest() {
		double result= calculatorService.subtractTwoNumbers(-2, -4);
		Assertions.assertEquals(2, result);
	}
	
	@Test
	void subtractPositiveNegativeTest() {
		double result= calculatorService.subtractTwoNumbers(2, -4);
		Assertions.assertEquals(6, result);
	}
	
	@Test
	void subtractZeroTest() {
		double result= calculatorService.subtractTwoNumbers(0, 0);
		Assertions.assertEquals(0, result);
	}
	
	
	

}
