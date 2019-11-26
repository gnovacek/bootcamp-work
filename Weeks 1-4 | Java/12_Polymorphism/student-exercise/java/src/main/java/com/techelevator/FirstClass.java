package com.techelevator;

public class FirstClass extends PostalService {
	public double rate;

	@Override
	public double calculateRate(int distance, double weight) {
		this.rate = 0;
		if (weight <= 7) {
			this.rate += 0.035;
		} else if (weight >= 8 && weight < 15) {
			this.rate += 0.040;
		} else if (weight == 15) {
			this.rate += 0.047;
		} else if (weight >= 16 && weight <= 127) {
			// 16 ounces in a pound
			this.rate += 0.195;
		} else if (weight == 128) {
			this.rate += 0.450;
		} else if (weight > 128) {
			this.rate += 0.500;
		}
		return this.rate * distance;
	}
}
