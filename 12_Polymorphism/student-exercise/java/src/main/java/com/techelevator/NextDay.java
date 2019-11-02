package com.techelevator;

public class NextDay extends SPU {

	@Override
	public double calculateRate(int distance, double weight) {
		double rate = ((weight/16) * 0.075) * distance; 
		return rate;
	}
}
