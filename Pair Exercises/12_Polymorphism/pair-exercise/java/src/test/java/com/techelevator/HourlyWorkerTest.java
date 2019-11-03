package com.techelevator;

import com.techelevator.HourlyWorker;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class HourlyWorkerTest {

	@Test
	public void calculate_weekly_pay() {
		HourlyWorker test = new HourlyWorker("Jacob", "Peralta", 25);
		int hoursWorked = 50;
		double overtime = hoursWorked - 40;
		double pay = 25 * hoursWorked;
		double totalPay = pay + (25 * overtime * 0.5);

		test.calculateWeeklyPay(hoursWorked);

		Assert.assertEquals((int) totalPay, (int) test.calculateWeeklyPay(hoursWorked));
	}

	@Test
	public void calculate_weekly_pay_no_overtime() {
		HourlyWorker test = new HourlyWorker("Jacob", "Peralta", 25);
		int hoursWorked = 30;
		double pay = 25 * hoursWorked;

		test.calculateWeeklyPay(hoursWorked);

		Assert.assertEquals((int) pay, (int) test.calculateWeeklyPay(hoursWorked));
	}

}
