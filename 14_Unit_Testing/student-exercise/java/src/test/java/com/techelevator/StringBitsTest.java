package com.techelevator;

import com.techelevator.StringBits;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class StringBitsTest {

	StringBits test = new StringBits(); 
	
	@Before
	public void setup() {
		test = new StringBits();
	}
	
	@Test
	public void every_other_char() {
		String returnValue; 
		
		returnValue = test.getBits("MamaMia");
		
		Assert.assertEquals("MmMa", returnValue);
	}
	
	@Test
	public void input_is_null() {
		String returnValue; 
		
		returnValue = test.getBits("");
		
		Assert.assertEquals("", returnValue);
	}
	
	@Test
	public void input_is_an_even_length() {
		String returnValue; 
		
		returnValue = test.getBits("gracefully");
		
		Assert.assertEquals("gaeul", returnValue);
	}
}
