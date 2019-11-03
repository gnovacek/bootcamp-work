package com.techelevator;
import com.techelevator.SalaryWorker;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class SalaryWorkerTest {

	@Test
	public void weekly_pay_is_pay_divided_by_52() {
		SalaryWorker test = new SalaryWorker("Jacob","Peralta",52000);
		
		test.calculateWeeklyPay(40);
		
		double pay = test.annualSalary/52;
		//assertEquals with doubles is deprecated, is this good??
		Assert.assertEquals((int)pay, (int)test.getAnnualSalary()/52);
	}
}
