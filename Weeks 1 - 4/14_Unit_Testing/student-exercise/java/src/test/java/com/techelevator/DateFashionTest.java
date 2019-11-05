package com.techelevator;

import com.techelevator.DateFashion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class DateFashionTest {

	
	DateFashion test = new DateFashion(); 
	
	@Before
	public void setup() {
		test =  new DateFashion(); 
	}
	
	@Test 
	public void no_table_two_or_less_or_date_ten() {
		int returnValue; 
		returnValue = test.getATable(1, 10);
		
		Assert.assertEquals(0, returnValue);
	}
	
	@Test 
	public void no_table_date_two_or_less_or_you_are_ten() {
		int returnValue; 
		returnValue = test.getATable(10, 2);
		
		Assert.assertEquals(0, returnValue);
	}
	
	@Test 
	public void maybe_table_both_are_between_3_and_7() {
		int returnValue; 
		returnValue = test.getATable(4, 7);
		
		Assert.assertEquals(1, returnValue);
	}
	
	@Test 
	public void yes_table_both_are_above_7() {
		int returnValue; 
		returnValue = test.getATable(8, 11);
		
		Assert.assertEquals(2, returnValue);
	}
	
	@Test 
	public void yes_table_you_above_7_date_above_2() {
		int returnValue; 
		returnValue = test.getATable(9, 4);
		
		Assert.assertEquals(2, returnValue);
	}
	
	@Test 
	public void yes_table_you_above_2_date_above_7() {
		int returnValue; 
		returnValue = test.getATable(4, 10);
		
		Assert.assertEquals(2, returnValue);
	}

}
