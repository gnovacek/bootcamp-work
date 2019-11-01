package com.techelevator.calculator;

public class Calculator {
	private int result; 
	
	public Calculator() {
		this.result = result; 
	}
	
	public int getResult() {
		return result; 
	}
	
	public int add(int addend) {
		return result += addend; 
	}
	
	public int multiply(int multiplier) {
		return result *= multiplier; 
	}
	
	public int power(int exponent) {
		if(result == 0) {
			return result; 
		} else if (exponent == 1) {
			return result; 
		}
		
		this.result = (int)Math.pow(result, exponent); 
		
		return this.result; 
	}
	
	public void reset() {
		result = 0; 
	}
	
	public int subtract(int subtrahend) {
		return result -= subtrahend; 
	}
	
}
