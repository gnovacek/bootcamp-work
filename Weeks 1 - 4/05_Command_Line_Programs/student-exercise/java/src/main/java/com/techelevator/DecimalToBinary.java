

//### Decimal to Binary
//
//Write a command line program which prompts the user for a series of decimal integer values separated by spaces. Each decimal integer is displayed along with its equivalent binary value.
//
//```
//Please enter in a series of decimal values (separated by spaces): 460 8218 1 31313 987654321
//
//460 in binary is 111001100
//8218 in binary is 10000000011010
//1 in binary is 1
//31313 in binary is 111101001010001
//987654321 in binary is 111010110111100110100010110001
//```
//
//* Many people have solved the fibonacci sequence in many different ways. In fact, this may even come up during a technical interview. Rather than looking at the solutions that already exist, try making an effort at solving this problem on your own. If you do ~~steal~~ borrow a solution, take the time to understand what the code is actually doing.
//* Please take the time to review each of the tasks for the output that should be displayed, as well as the text that should be used for prompting the user for information. Try to get this to match the specification as closely as possible when working through the exercise.



package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);

		System.out.print("Please enter in a series of decimal values (separated by spaces):");
		String numbers = inputScanner.nextLine();
		
		String[] numberToConvert = numbers.split(" ");
			
		int[] nums = new int[numberToConvert.length];
				
		for(int i=0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(numberToConvert[i]); 
		}
		
		for(int i=0; i < nums.length; i++) {
			System.out.println(nums[i] + " in binary is " + Integer.toBinaryString(nums[i]));
		}

	}

}
