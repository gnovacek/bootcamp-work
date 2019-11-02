package com.techelevator;

import com.techelevator.NonStart;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class NonStartTest {
	NonStart test = new NonStart(); 
	
	@Before
	public void setup() {
		test= new NonStart(); 
	}
	
	@Test 
	public void test_for_concat_and_first_index_removals() {
		String returnValue; 
		returnValue = test.getPartialString("Timothee", "Chalamet"); 
		Assert.assertEquals("imotheehalamet", returnValue);
	}
	
	@Test 
	public void first_string_is_0() {
		String returnValue; 
		returnValue = test.getPartialString("", "Chalamet"); 
		Assert.assertEquals("halamet", returnValue);
	}
	
	@Test 
	public void second_string_is_0() {
		String returnValue; 
		returnValue = test.getPartialString("Timothee", ""); 
		Assert.assertEquals("imothee", returnValue);
	}
	
}
