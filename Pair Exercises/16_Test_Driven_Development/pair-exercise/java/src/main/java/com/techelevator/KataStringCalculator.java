package com.techelevator;

public class KataStringCalculator {

	public static int add(String numbers) {
		if (numbers == "") {
			return 0;
		} else {
			return stringToInt(numbers);
		}
	}


	private static int stringToInt(String stringNum){
		/*if(stringNum.substring(0, 2) == "//") {
			char delimeter = stringNum.charAt(2);
		}*/
	//we can take our string and split it at the ","	
	String [] stringNumbersArray = stringNum.split(",|\n");
		
	//make an empty array to put converted strings into
	int [] intArray = new int[stringNumbersArray.length];	
	//for loop to convert string and place it in empty array
	for (int i=0; i < stringNumbersArray.length; i++) {
		int convertedString = Integer.parseInt(stringNumbersArray[i]);
		intArray[i]= convertedString;
	}
		
		if (intArray.length == 1) {
			int singleNumber = intArray[0];
			return singleNumber;
		} else {
			int sum = 0; 
			for(int num : intArray) {
				sum += num; 
			}
			return sum; 
		}
	}
}