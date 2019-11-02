package com.techelevator;

import com.techelevator.SameFirstLast;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class SameFirstLastTest {
	SameFirstLast test = new SameFirstLast(); 
	
	@Before
	public void setup() {
		test = new SameFirstLast();
	}

	@Test
	public void array_length_0() {
		int[] numsArr = { }; 
		
		boolean returnValue; 
		returnValue = test.isItTheSame(numsArr); 
		
		Assert.assertEquals(false, returnValue);
	}
	
	@Test
	public void first_and_last_index_equal() {
		int[] numsArr = {9, 5, 7, 9}; 
		
		boolean returnValue; 
		returnValue = test.isItTheSame(numsArr); 
		
		Assert.assertEquals(true, returnValue);
	}
	
	@Test
	public void first_and_last_index_not_equal() {
		int[] numsArr = {1, 5, 7, 9}; 
		
		boolean returnValue; 
		returnValue = test.isItTheSame(numsArr); 
		
		Assert.assertEquals(false, returnValue);
	}

	// my null test is not working 
//	@Test
//	public void null_array_is_false() {
//		int[] numsArr = { }; 
//		
//		boolean returnValue; 
//		returnValue = test.isItTheSame(numsArr); 
//		
//		Assert.assertEquals(false, returnValue);
//	}
}
