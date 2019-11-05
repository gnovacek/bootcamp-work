package com.techelevator;

import org.junit.Test;
import org.junit.Assert;

public class KataStringCalculatorTest {

	@Test
	public void empty_string_returns_zero() {
		// arrange
		final String emptyString = "";
		final int expectedNumber = 0;
		// act
		int output = KataStringCalculator.add(emptyString);
		// assert
		Assert.assertEquals("Empty string needs to return zero", expectedNumber, output);
	}

	@Test
	public void single_number_returns_itself() {
		// arrange
		final String soloNumber = "1";
		final int expectedNumber = 1;
		// act
		int output = KataStringCalculator.add(soloNumber);
		// assert
		Assert.assertEquals("Single number passed in needs to return itself as a int", expectedNumber, output);
	}

	@Test
	public void two_string_numbers_return_an_int_sum() {
		// arrange
		final String twoNumbers = "1,2";
		final int expectedNumber = 3;
		// act
		int output = KataStringCalculator.add(twoNumbers);
		// assert
		Assert.assertEquals("Two numbers passed are added and a sum int is returned", expectedNumber, output);
	}
	
	@Test
	public void three_string_numbers_return_an_int_sum() {
		final String threeNumbers = "5,7,12";
		final int expectedNumber = 24;
		int output = KataStringCalculator.add(threeNumbers);
		Assert.assertEquals("Three numbers passed are added and a sum int is returned", expectedNumber, output);
	}
	
	@Test
	public void four_string_numbers_return_an_int_sum() {
		final String fourNumbers = "6,2,1,8";
		final int expectedNumber = 17;
		int output = KataStringCalculator.add(fourNumbers);
		Assert.assertEquals("Four numbers passed are added and a sum int is returned", expectedNumber, output);
	}
	
	@Test
	public void new_line_divided_string_numbers_return_an_int_sum_three_numbers() {
		final String newLineNumbers = "5\n3,2";
		final int expectedNumber = 10;
		int output = KataStringCalculator.add(newLineNumbers);
		Assert.assertEquals("Three numbers passed are added and a sum int is returned", expectedNumber, output);
	}
	
	@Test
	public void new_line_divided_string_numbers_return_an_int_sum_four_numbers() {
		final String newLineNumbers = "3\n5\n2,4";
		final int expectedNumber = 14;
		int output = KataStringCalculator.add(newLineNumbers);
		Assert.assertEquals("Four numbers passed are added and a sum int is returned", expectedNumber, output);
	}
	
	/*
	@Test
	public void semicoma_divided_string_numbers_return_an_int_sum_two_numbers() {
		final String newDelimeatsNumbers = "//;\n1;2";
		final int expectedNumber = 3;
		int output = KataStringCalculator.add(newDelimeatsNumbers);
		Assert.assertEquals("two numbers passed are added and a sum int is returned when there are semicolans and weirdness", expectedNumber, output);
	}
	*/
	

}
