package com.techelevator;

import com.techelevator.Less20;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class Less20Test {
	
	Less20 test = new Less20(); 
	
	@Before 
	public void setup() {
		test = new Less20(); 
	}

	@Test 
	public void int_passed_in_is_one_less_than_20() {
		//arrange 
		boolean returnValue; 
		
		returnValue = test.isLessThanMultipleOf20(19);
		//act 
		//assert 
		Assert.assertEquals( true, returnValue);
	}
	
	@Test 
	public void int_passed_in_is_two_less_than_20() {
		//arrange 
		boolean returnValue; 
		
		returnValue = test.isLessThanMultipleOf20(18);
		//act 
		//assert 
		Assert.assertEquals(true, returnValue);
	}
	
	@Test 
	public void int_passed_in_is_not_1or2less_than_20() {
		//arrange 
		boolean returnValue; 
		
		returnValue = test.isLessThanMultipleOf20(6);
		//act 
		//assert 
		Assert.assertEquals(false, returnValue);
	}
	

}
