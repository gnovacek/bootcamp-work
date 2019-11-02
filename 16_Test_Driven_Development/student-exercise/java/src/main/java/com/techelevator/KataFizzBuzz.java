package com.techelevator;

public class KataFizzBuzz {
	
	public String fizzBuzz(int number) {
		boolean numberContains3 = Integer.toString(number).contains("3");
		boolean numberContains5 = Integer.toString(number).contains("5");
		boolean divisibleBy3And5 = (number % 3 == 0 && number % 5 == 0); 
		
		
		if(number >= 1 && number <=100) {
			if (divisibleBy3And5 || numberContains3 && numberContains5) {
				return "FizzBuzz";
			} else if (number % 3 == 0 || numberContains3){
				return "Fizz";
			} else if (number % 5 == 0 || numberContains5){
				return "Buzz"; 
			} else {
				return Integer.toString(number); 
			}
		} else {
			return ""; 
		}
	}
}
