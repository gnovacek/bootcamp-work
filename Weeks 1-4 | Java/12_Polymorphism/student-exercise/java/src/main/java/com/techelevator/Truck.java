package com.techelevator;

public class Truck implements Vehicle {
	private String type = "Truck"; 
	private int numberOfAxles; 
	
	public Truck(int numberOfAxles) {
		this.numberOfAxles = numberOfAxles; 
	}
	
	@Override
	public double calculateToll(int distance) {
		double toll = 0;
		
		if(this.numberOfAxles == 4) {
			toll = 0.040 * distance; 
		} else if(this.numberOfAxles == 6) {
			toll = 0.045 * distance; 
		} else if (this.numberOfAxles >= 8) {
			toll = 0.048 * distance; 
		}
		return toll;
	}

	@Override
	public String toString() {
		String strToReturn = ""; 
		
		if(this.numberOfAxles == 4) {
			strToReturn+= " (4 axels)"; 
		} else if(this.numberOfAxles == 6) {
			strToReturn+= " (6 axels)"; 
		} else if (this.numberOfAxles == 8) {
			strToReturn += " (8 axels)"; 
		}
		
		return strToReturn; 
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return this.type;
	}

}
