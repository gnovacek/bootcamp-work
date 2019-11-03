package com.techelevator;

import com.techelevator.VolunteerWorker;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class VolunteerWorkerTest {

	@Test
	public void volunteers_make_no_money () {
		VolunteerWorker test = new VolunteerWorker("Jacob","Peralta");
		
	
		
		Assert.assertEquals(0, (int)test.calculateWeeklyPay(100));
	}
	
}
