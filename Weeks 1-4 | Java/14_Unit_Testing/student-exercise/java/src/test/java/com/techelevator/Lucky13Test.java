package com.techelevator;

import com.techelevator.Lucky13;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class Lucky13Test {
	Lucky13 test = new Lucky13();

	@Before
	public void setup() {
		test = new Lucky13();
	}

	@Test
	public void return_true_if_no_ones_or_threes() {
		boolean returnValue;

		int[] testArr = { 0, 2, 4 };

		returnValue = test.getLucky(testArr);

		Assert.assertEquals(true, returnValue);
	}
	
	@Test
	public void return_false_if_three() {
		boolean returnValue;

		int[] testArr = { 0, 3, 4 };

		returnValue = test.getLucky(testArr);

		Assert.assertEquals(false, returnValue);
	}
	
	@Test
	public void return_false_if_one() {
		boolean returnValue;

		int[] testArr = { 1, 7, 4 };

		returnValue = test.getLucky(testArr);

		Assert.assertEquals(false, returnValue);
	}

}
