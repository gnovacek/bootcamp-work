package com.techelevator;

public class FourDay extends SPU {
	
	@Override
	public double calculateRate(int distance, double weight) {
		double rate = ((weight/16) * 0.0050) * distance; 
		return rate;
	}
	
}
