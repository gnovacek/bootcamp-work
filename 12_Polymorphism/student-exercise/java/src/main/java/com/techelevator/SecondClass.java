package com.techelevator;

public class SecondClass extends PostalService {
	public double rate;

	@Override
	public double calculateRate(int distance, double weight) {
		this.rate = 0;
		if (weight <= 7) {
			this.rate += 0.0035;
		} else if (weight >= 8 && weight < 15) {
			this.rate += 0.0040;
		} else if (weight == 15) {
			this.rate += 0.0047;
		} else if (weight >= 16 && weight <= 127) {
			// 16 ounces in a pound
			this.rate += 0.0195;
		} else if (weight == 128) {
			this.rate += 0.0450;
		} else if (weight > 128) {
			this.rate += 0.0500;
		}
		return this.rate * distance;
	}
}
