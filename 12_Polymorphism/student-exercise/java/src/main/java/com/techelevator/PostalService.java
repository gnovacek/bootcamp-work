package com.techelevator;

public abstract class PostalService implements DeliveryDriver {
	private String name = "PostalService";


	@Override
	public double calculateRate(int distance, double weight) {
		double totalRate = weight * distance;
		return totalRate;
	}

	@Override
	public String getName() {
		return this.name;
	}

}
