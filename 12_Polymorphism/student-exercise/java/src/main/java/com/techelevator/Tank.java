package com.techelevator;

public class Tank implements Vehicle{
	private String type = "Tank"; 
	
	@Override
	public double calculateToll(int distance) {
		return 0;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return this.type;
	}

	@Override
	public String toString() {
		String strToReturn = ""; 
		return strToReturn; 
	}
	
}
