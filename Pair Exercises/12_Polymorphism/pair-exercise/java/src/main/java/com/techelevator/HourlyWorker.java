package com.techelevator;

public class HourlyWorker implements Worker {
	
	private double hourlyRate;
	private String firstName;
	private String lastName;
	

	public HourlyWorker(String firstName, String lastName, double hourlyRate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.hourlyRate = hourlyRate;
	}
	
	public double getHourlyRate() {
		return this.hourlyRate;
	}

	@Override
	public String getFirstName() {
		
		return this.firstName;
	}

	@Override
	public String getLastName() {
		
		return this.lastName;
	}

	@Override
	public double calculateWeeklyPay(int hoursWorked) {
		double overtime = 0;
		double pay = this.hourlyRate * hoursWorked;
		if(hoursWorked > 40) {
		 overtime = hoursWorked - 40;
		}
		pay = pay + (this.hourlyRate *overtime * 0.5);
		
		return pay;
	}
	

}
