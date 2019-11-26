package com.techelevator;

public class ThirdClass extends PostalService {
	public double rate;

	@Override
	public double calculateRate(int distance, double weight) {
		this.rate = 0;
		if (weight <= 7) {
			this.rate += 0.0020;
		} else if (weight >= 8 && weight < 15) {
			this.rate += 0.0022;
		} else if (weight == 15) {
			this.rate += 0.0024;
		} else if (weight >= 16 && weight <= 127) {
			// 16 ounces in a pound
			this.rate += 0.0150;
		} else if (weight == 128) {
			this.rate += 0.0160;
		} else if (weight > 128) {
			this.rate += 0.0170;
		}
		return this.rate * distance;
	}
}
