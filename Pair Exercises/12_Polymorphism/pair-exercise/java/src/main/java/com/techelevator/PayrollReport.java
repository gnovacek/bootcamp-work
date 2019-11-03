package com.techelevator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PayrollReport {

	public static void main(String[] args) {
		Random hours = new Random();
		
		List <Worker> employees = new ArrayList <>();
	
		    employees.add(new HourlyWorker("Ryan", "Sutton", 50));
		    employees.add(new VolunteerWorker("Grace","Novacek"));
		    employees.add(new SalaryWorker("Muna","Luitel",200000));
		    System.out.println("Employees \t Hours Worked \t Pay "  );
		    System.out.println("====================================");
		    int totalHours = 0;
        	double totalPay = 0;
        	
		        for(Worker worker : employees) {
		        	
		        	
		        	int randomHours = hours.nextInt(50);
		        	totalHours += randomHours;
		        	totalPay += worker.calculateWeeklyPay(randomHours);
		        	
		        	System.out.print(worker.getLastName() + ", " + worker.getFirstName() + "\t"+ randomHours +
		        			"\t"  + worker.calculateWeeklyPay(randomHours));
		        	
		        
		        	System.out.println();
		        }
		
		          System.out.println("Total Hours = " + totalHours);
		          System.out.println("Total Pay = " + totalPay);
		          
		        
		        

	}

}
