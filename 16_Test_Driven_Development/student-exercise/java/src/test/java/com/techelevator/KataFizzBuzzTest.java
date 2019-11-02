package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataFizzBuzzTest {

	@Test
	public void result_Fizz_when_number_divisible_by_3_or_contains_3() {
		KataFizzBuzz test = new KataFizzBuzz();

		final String expectedString = "Fizz";
		int number = 13;

		String returnValue = test.fizzBuzz(number);

		Assert.assertEquals("Should return Fizz if number passed in is divisible by three or contains three", expectedString,
				returnValue);
	}

	@Test
	public void result_Buzz_when_number_divisible_by_5_or_contains_5() {
		KataFizzBuzz test = new KataFizzBuzz();

		final String expectedString = "Buzz";
		int number = 50;
// 51 is divisble by 3 so this does not work... I could not figure it out!
		String returnValue = test.fizzBuzz(number);

		Assert.assertEquals("Should return Buzz if number passed in is divisible by five or contains five", expectedString, returnValue);
	}

	@Test
	public void result_FizzBuzz_when_number_divisible_by_3_and_5() {
		KataFizzBuzz test = new KataFizzBuzz();

		final String expectedString = "FizzBuzz";
		int number = 15;

		String returnValue = test.fizzBuzz(number);

		Assert.assertEquals("Should return FizzBuzz if number passed in is divisible by three and five", expectedString,
				returnValue);
	}
	
	@Test
	public void result_FizzBuzz_when_number_contains_3_and_5() {
		KataFizzBuzz test = new KataFizzBuzz();

		final String expectedString = "FizzBuzz";
		int number = 53;

		String returnValue = test.fizzBuzz(number);

		Assert.assertEquals("Should return FizzBuzz if number passed in is divisible by three and five", expectedString,
				returnValue);
	}

	@Test
	public void when_number_is_between_1_and_100_return_number_as_a_String() {
		KataFizzBuzz test = new KataFizzBuzz();

		int number = 22;
		String expectedString = "22";

		String returnValue = test.fizzBuzz(number);

		Assert.assertEquals("Should return 22 as a String 22", expectedString, returnValue);
	}

	@Test
	public void when_number_is_1_return_String_1() {
		KataFizzBuzz test = new KataFizzBuzz();

		int number = 1;
		String expectedString = "1";

		String returnValue = test.fizzBuzz(number);

		Assert.assertEquals("Should return 1 as a String 1", expectedString, returnValue);
	}

	@Test
	public void when_number_isnt_between_1_and_100_return_empty_String() {
		KataFizzBuzz test = new KataFizzBuzz();

		int number = 0;
		String expectedString = "";

		String returnValue = test.fizzBuzz(number);

		Assert.assertEquals("Should return an empty String when number is not between 1 and 100", expectedString,
				returnValue);
	}

	
}
