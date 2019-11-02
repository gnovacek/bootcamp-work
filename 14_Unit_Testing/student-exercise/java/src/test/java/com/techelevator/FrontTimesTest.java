package com.techelevator;

import com.techelevator.FrontTimes;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class FrontTimesTest {

	FrontTimes test = new FrontTimes(); 
	@Before
	public void setup() {
		test = new FrontTimes(); 
	}
	
	@Test 
	public void checking_for_3_chars_repeated_4_times() {
		String returnValue; 
		returnValue = test.generateString("Nickjonas", 4);
		Assert.assertEquals("NicNicNicNic", returnValue);
	}
	
	@Test 
	public void inital_string_less_than_3() {
		String returnValue; 
		returnValue = test.generateString("Jo", 2);
		Assert.assertEquals("JoJo", returnValue);
	}
	
	@Test 
	public void string_not_null() {
		String returnValue; 
		returnValue = test.generateString(null, 2);
		Assert.assertEquals("", returnValue);
	}
	
}
