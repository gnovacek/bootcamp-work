//### Linear Convert
//Write a program that converts meters to feet and vice-versa.
//
//The foot to meter conversion formula is:
//    m = f * 0.3048
//
//The meter to foot conversion formula is:
//    f = m * 3.2808399
//
//Write a command line program which prompts a user to enter a length, and whether the measurement is in (m)eters or (f)eet. Convert the length to the opposite measurement, and display the old and new measurements to the console.
//
//```
//Please enter the length: 58
//Is the measurement in (m)eter, or (f)eet? f
//58f is 17m.

package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {

		Scanner inputScanner = new Scanner(System.in);

		System.out.print("Please enter the length:");
		String length = inputScanner.nextLine();

		int lengthNumber = Integer.parseInt(length);

		System.out.print("Is the measurement in (m)eter, or (f)eet?");
		String mOrF = inputScanner.nextLine();

		if (mOrF.equalsIgnoreCase("M")) {
			int lengthF = (int)(lengthNumber * 3.2808399);
			System.out.println(lengthNumber + "m is " + lengthF + "f");

		} else if (mOrF.equalsIgnoreCase("F")) {
			int lengthM = (int)(lengthNumber * 0.3048);
			System.out.println(lengthNumber + "f is " + lengthM + "m");
		}

	}

}
