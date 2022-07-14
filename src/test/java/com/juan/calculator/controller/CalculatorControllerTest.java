package com.juan.calculator.controller;

import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.juan.calculator.service.CalculatorService;

//@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class CalculatorControllerTest {

	@Autowired
	private TestRestTemplate testRestTemplate;

	@MockBean
	private CalculatorService calculatorService;

	@Test
	void sumTest() {

		BDDMockito.given(calculatorService.operation(10.0, "+", 5.0)).willReturn(15d);

		ResponseEntity<Double> response = testRestTemplate.getForEntity("/api/calculate/10/+/5", Double.class);

		Assertions.assertEquals(HttpStatus.OK, response.getStatusCode());
		Assertions.assertEquals(15d, response.getBody());
	}

	@Test
	void subtractTest() {

		BDDMockito.given(calculatorService.operation(10.0, "-", 5.0)).willReturn(5d);

		ResponseEntity<Double> response = testRestTemplate.getForEntity("/api/calculate/10/-/5", Double.class);

		Assertions.assertEquals(HttpStatus.OK, response.getStatusCode());
		Assertions.assertEquals(5d, response.getBody());
	}


	
}
