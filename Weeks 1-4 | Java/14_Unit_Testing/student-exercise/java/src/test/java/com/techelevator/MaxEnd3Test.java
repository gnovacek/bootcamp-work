package com.techelevator;

import com.techelevator.MaxEnd3;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class MaxEnd3Test {
	MaxEnd3 test = new MaxEnd3(); 
	
	@Before
	public void setup() {
		test = new MaxEnd3();
	}
	
	@Test 
	public void highest_number_in_array_returned_three_times() {
		int[] nums = {1, 2, 3}; 
		int[] returnType; 
		
		returnType = test.makeArray(nums);
		
		int[] expected = {3, 3, 3};
		Assert.assertArrayEquals(expected, returnType);
	}
	
	@Test 
	public void first_number_is_largest() {
		int[] nums = {203, 2, 63}; 
		int[] returnType; 
		
		returnType = test.makeArray(nums);
		
		int[] expected = {203, 203, 203};
		Assert.assertArrayEquals(expected, returnType);
	}
	
	@Test 
	public void second_number_is_largest_still_return_first() {
		int[] nums = {44, 88, 22}; 
		int[] returnType; 
		
		returnType = test.makeArray(nums);
		
		int[] expected = {44, 44, 44};
		
		Assert.assertArrayEquals(expected, returnType);
	}
	
	
}
