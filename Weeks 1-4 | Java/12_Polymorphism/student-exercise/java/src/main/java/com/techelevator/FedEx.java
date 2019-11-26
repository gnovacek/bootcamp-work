package com.techelevator;

public class FedEx implements DeliveryDriver {
	private String name = "FedEx";

	@Override
	public double calculateRate(int distance, double weight) {
		double rate = 20.00;
		if (distance > 500) {
			rate += 5.00;
		}

		if (weight > 48) {
			rate += 3.00;
		}

		return rate;
	}

	@Override
	public String getName() {
		return this.name;
	}

}
