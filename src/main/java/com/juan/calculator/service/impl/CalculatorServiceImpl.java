package com.juan.calculator.service.impl;

import org.springframework.stereotype.Service;
import com.juan.calculator.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService{

	
	/*
	 * Method in charge of doing the subtraction operation
	 * 
	 * @param valueOne double
	 * @param valueTwo double
	 * 
	 * @return double
	 */
	@Override
	public Double operation(Double valueOne, String operator, Double valueTwo) {
		Double result= null;
		
		switch(operator) {
		case "-":
			result= valueOne-valueTwo;
			break;
		case "+":
			result= valueOne+valueTwo;
			break;
		case "/":
			result= valueOne/valueTwo;
			break;
		case "x":
			result= valueOne*valueTwo; 
			break;
		}
		
		return result;
	}

	
	
	
	

}
