package com.juan.calculator.service.impl;

import org.springframework.stereotype.Service;

import com.juan.calculator.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService{

	@Override
	public double sumTwoNumbers(double valueOne, double valueTwo) {
		return valueOne + valueTwo;
	}

	@Override
	public double subtractTwoNumbers(double valueOne, double valueTwo) {
		return valueOne - valueTwo;
	}
	
	

}
