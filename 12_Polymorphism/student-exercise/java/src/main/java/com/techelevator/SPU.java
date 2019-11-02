package com.techelevator;

public abstract class SPU implements DeliveryDriver {
	private String name = "SPU";

//	If "4-Day Ground" then rate = (weight * 0.0050) * distance.
//			If "2-Day Business" then rate = (weight * 0.050) * distance.
//			If "Next Day" then rate = (weight * 0.075) * distance.	
	
	@Override
	public double calculateRate(int distance, double weight) {
		double rate = (weight) * distance; 
		return rate;
	}

	@Override
	public String getName() {
		return this.name;
	}

}
