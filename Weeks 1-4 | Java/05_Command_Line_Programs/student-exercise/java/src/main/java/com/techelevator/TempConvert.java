//### Temperature Convert
//
//The Fahrenheit to Celsius conversion formula is:
//    Tc = (Tf - 32) / 1.8
//where 'Tc' is the temperature in Celsius, and 'Tf' is the temperature in Fahrenheit
//
//The Celsius to Fahrenheit conversion formula is:
//    Tf = Tc * 1.8 + 32
//
//Write a command line program which prompts a user to enter a temperature, and whether its in degrees (C)elsius or (F)arenheit. Convert the temperature to the opposite degrees, and display the old and new temperatures to the console.
//
//Please enter the temperature: 58
//Is the temperature in (C)elcius, or (F)arenheit? F
//58F is 14C.

package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {

		Scanner inputScanner = new Scanner(System.in);

		System.out.print("Please enter the temperature:");
		String temp = inputScanner.nextLine();

		int tempNumber = Integer.parseInt(temp);

		System.out.print("Is the temperature in (C)elcius, or (F)arenheit?");
		String cOrF = inputScanner.nextLine();

		if (cOrF.equalsIgnoreCase("F")) {
			int tempC = (int)((tempNumber - 32) / 1.8);
			System.out.println(tempNumber + "F is " + tempC + "C"); 
			
		} else if (cOrF.equalsIgnoreCase("C")) {
			int tempF = (int)(tempNumber * 1.8 + 32);
			System.out.println(tempNumber + "C is " + tempF + "F"); 
		}

	}

}
