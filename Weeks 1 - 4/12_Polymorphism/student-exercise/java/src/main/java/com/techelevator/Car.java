package com.techelevator;

public class Car implements Vehicle {
	private String type = "Car";
	private boolean hasTrailer; 

	public Car(boolean hasTrailer) {
		this.hasTrailer = hasTrailer;
	}

	@Override
	public double calculateToll(int distance) {
		double toll = distance * 0.020;

		if (hasTrailer) {
			toll += 1.00; 
		}
		return toll;
	}
	
	@Override 
	public String toString() {
		String strToReturn = ""; 
		if(hasTrailer) {
			strToReturn += " (with trailer)"; 
		}
		return strToReturn; 
	}

	@Override
	public String getType() {
		return this.type;
	}

}
