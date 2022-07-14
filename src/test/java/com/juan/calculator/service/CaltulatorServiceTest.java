package com.juan.calculator.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CaltulatorServiceTest {

	@Autowired
	private CalculatorService calculatorService;

	@Test
	public void sumTest() {
		Double resultado = calculatorService.operation(2.0, "+", 2.0);
		assertEquals(4, resultado);
	}
	@Test
	public void subtractTest() {
		Double resultado = calculatorService.operation(2.0, "-", 2.0);
		assertEquals(0, resultado);
	}
	
	
	@Test
	public void notNullTest() {
		Double resultado = calculatorService.operation(2.0, "-", 2.0);
		assertNotNull(resultado);
	}
	
	@Test
	public void maxValueTest() {
		Double resultado = calculatorService.operation(Double.MAX_VALUE, "-", 2.0);
		assertThat(resultado);
	}
	
	@Test
	public void minValueTest() {
		Double resultado = calculatorService.operation(Double.MIN_VALUE, "-", 2.0);
		assertThat(resultado);
	}
}
