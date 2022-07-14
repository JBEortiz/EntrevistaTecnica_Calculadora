package com.juan.calculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
//@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorControllerTest {
	
	 @Autowired
	 private TestRestTemplate testRestTemplate;

	
	//TODO: cambiar por test de integracion
//	@Test
//	public void sumControllerTest() {
//		
//		 String url = "http://localhost:8080/calculator/sum/{valueOne}/{valueTwo}";
//	        
//	        HttpHeaders result= testRestTemplate.headForHeaders(url,2,2);
//	        double expected=4;
//	        Assertions.assertEquals(result, expected);
//	}
//	
//	@Test
//	public void subtractControllerTest() {
//		CalculatorController calculatorController= new CalculatorController(service);
//		double result= calculatorController.calculateSubtract(2, 4);
//		Assertions.assertEquals(-2, result);
//	}
}
