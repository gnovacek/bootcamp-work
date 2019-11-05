package com.techelevator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TollCalculator {

	public static void main(String[] args) {
		Random distance = new Random();

		List<Vehicle> travelingVehicles = new ArrayList<>();

		travelingVehicles.add(new Car(true));
		travelingVehicles.add(new Car(false));
		travelingVehicles.add(new Truck(8));
		travelingVehicles.add(new Tank());
		travelingVehicles.add(new Truck(4));

		System.out.println("Vehicle \t \t Distance Traveled \t \t Toll $ ");
		System.out.println("-----------------------------------------------------------------");
		int totalMilesTraveled = 0;
		double totalTolls = 0;

		for (Vehicle vehicle : travelingVehicles) {

			int randomDistance = distance.nextInt(230) + 10;
			totalMilesTraveled += randomDistance;
			totalTolls += vehicle.calculateToll(randomDistance);

			System.out.print(vehicle.getType() + vehicle.toString() + "\t \t" + randomDistance + "\t \t \t" + "$"
					+ vehicle.calculateToll(randomDistance));

			System.out.println();
		}
		System.out.println();
		System.out.println("Total Miles Traveled: " + totalMilesTraveled);
		System.out.println("Total Tollbooth Revenue: $" + totalTolls);

	}

}
