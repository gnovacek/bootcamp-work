package com.techelevator;

public class SalaryWorker implements Worker{

	private String firstName;
	private String lastName;
	protected double annualSalary;
	
	
	
	public SalaryWorker(String firstName, String lastName,double annualSalary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.annualSalary = annualSalary;
	}

	@Override
	public String getFirstName() {
		
		return this.firstName;
	}

	@Override
	public String getLastName() {
		
		return this.lastName;
	}
	public double getAnnualSalary() {
		return this.annualSalary;
	}

	@Override
	public double calculateWeeklyPay(int hoursWorked) {
		
		double pay = this.annualSalary/52;
		
		return pay;
	}
	

}
