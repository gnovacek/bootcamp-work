package com.techelevator;

public class TwoDay extends SPU {

	@Override
	public double calculateRate(int distance, double weight) {
		double rate = ((weight/16) * 0.050) * distance; 
		return rate;
	}
}
