package com.techelevator;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class WordCountTest {
	WordCount test = new WordCount();

	@Before
	public void setup() {
		test = new WordCount();
	}

	@Test
	public void returning_accurate_map() {

		String[] words = { "ice", "ice", "baby" };

		Map<String, Integer> returnValue;

		returnValue = test.getCount(words);

		Map<String, Integer> expectedValue = new HashMap();

		expectedValue.put("ice", 2);
		expectedValue.put("baby", 1);

		Assert.assertEquals(expectedValue, returnValue);
	}

}
