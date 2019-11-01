//The Fibonacci numbers are the integers in the following sequence:
//
//    0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
//
//By definition, the first two numbers in the Fibonacci sequence are 0 and 1, and each subsequent number is the sum of the previous two.
//
//Write a command line program which prompts the user for an integer value and display the Fibonacci sequence leading up to that number.
//
//Please enter the Fibonacci number: 25
//
//0, 1, 1, 2, 3, 5, 8, 13, 21

package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);

		System.out.print("Please enter the Fibonacci number:");
		String fibonacci = inputScanner.nextLine();

		int fibonacciNum = Integer.parseInt(fibonacci);

		System.out.print("0, 1");

		int previousVal = 0;

		for (int i = 1; i < fibonacciNum; i += previousVal) {

			previousVal = i - previousVal;

			System.out.print(", " + i);

		}
	}
}
