package com.techelevator;

import com.techelevator.AnimalGroupName;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class AnimalGroupNameTest {

	AnimalGroupName animals;

	@Before
	public void setup() {
		this.animals = new AnimalGroupName();
	}

	@Test
	public void input_doesnt_match_key() {
		String returnValue;

		returnValue = animals.getHerd("walrus");

		Assert.assertEquals("Please enter an animal name", "unknown", returnValue);
	}

	@Test
	public void input_isnt_case_sensitive() {
		String returnValue;

		returnValue = animals.getHerd("elephANt");

		Assert.assertEquals("Please enter an animal name", "Herd", returnValue);
	}

	@Test
	public void test_for_not_null() {
		String returnValue;

		returnValue = animals.getHerd(null);

		Assert.assertEquals("input cannot be null", "unknown", returnValue);

	}

	@Test
	public void test_for_empty() {
		String returnValue;

		returnValue = animals.getHerd("");

		Assert.assertEquals("Input cannot be empty. Please enter an animal name", "unknown", returnValue);

	}
	
	@Test
	public void returning_value_when_correct_key_is_entered() {
		String returnValue;

		returnValue = animals.getHerd("LION");

		Assert.assertEquals("Please enter another animal name", "Pride", returnValue);

	}

}
