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
	public double sumTwoNumbers(double valueOne, double valueTwo) {
		return valueOne + valueTwo;
	}

	/*
	 * Method in charge of doing the subtraction operation
	 * @param valueOne double
	 * @param valueTwo double
	 * 
	 * @return double
	 */
	@Override
	public double subtractTwoNumbers(double valueOne, double valueTwo) {
		return valueOne - valueTwo;
	}
	
	

}
