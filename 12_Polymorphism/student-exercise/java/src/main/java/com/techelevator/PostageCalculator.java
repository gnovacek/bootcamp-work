package com.techelevator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PostageCalculator {

	public static void main(String[] args) {

		Scanner inputScanner = new Scanner(System.in);

		System.out.println("Please enter the weight of the package?");
		String weightOfPackage = inputScanner.nextLine();
		double weightAsNumber = Double.parseDouble(weightOfPackage);

		System.out.println("(P)ounds or (O)unces?");
		String poundsOrOunces = inputScanner.nextLine();

		System.out.println("What distance will it be traveling?");
		String distanceInput = inputScanner.nextLine();
		int distanceGiven = Integer.parseInt(distanceInput);

		if (poundsOrOunces.equalsIgnoreCase("P")) {
			weightAsNumber = weightAsNumber * 16;
		} else if (poundsOrOunces.equalsIgnoreCase("O")) {

		}

		System.out.println("Delivery Method \t \t \t $ cost");
		System.out.println("------------------------------------------------------");

		PostalService firstClass = new FirstClass();
		PostalService secondClass = new SecondClass();
		PostalService thirdClass = new ThirdClass();
		FedEx fedEx = new FedEx();
		SPU fourDay = new FourDay();
		SPU twoDay = new TwoDay();
		SPU nextDay = new NextDay();

		System.out.println(
				"Postal Service (1st Class) \t \t $" + firstClass.calculateRate(distanceGiven, weightAsNumber));
		System.out.println(
				"Postal Service (2nd Class) \t \t $" + secondClass.calculateRate(distanceGiven, weightAsNumber));
		System.out.println(
				"Postal Service (3rd Class) \t \t $" + thirdClass.calculateRate(distanceGiven, weightAsNumber));
		System.out.println("FedEx \t \t \t \t \t $" + fedEx.calculateRate(distanceGiven, weightAsNumber));
		System.out.println("SPU (4-Day Ground) \t \t \t $" + fourDay.calculateRate(distanceGiven, weightAsNumber));
		System.out.println("SPU (2-Day Business) \t \t \t $" + twoDay.calculateRate(distanceGiven, weightAsNumber));
		System.out.println("SPU (Next Day) \t \t \t \t $" + nextDay.calculateRate(distanceGiven, weightAsNumber));

	}

}
