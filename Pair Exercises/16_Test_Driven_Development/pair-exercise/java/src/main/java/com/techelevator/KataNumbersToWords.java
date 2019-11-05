package com.techelevator;

public class KataNumbersToWords {

	// still need to do logic for when number equals 20 exactly
	// still need to do logic for when number equals 30 exactly... and 40 and 50 and
	// 60 and 70 and 80 and 90

	public static String convertToWord(int number) {
		
		
		if (number < 20) {
			return oneToNineteen(number);
		} else if (number < 100) {
			return twentyToNinety(number);
		} else if (number < 1000) {
			return hundred(number);
		} else if (number < 10000) {
			return thousand(number);
		} else if (number < 100000){
			return tenThousand(number);
		}
		return null;
	}

	// 20-90 helper
	public static String twentyToNinety(int number) {
		if (number < 30) {
			return twenty(number);
		} else if (number < 40) {
			return thirty(number);
		} else if (number < 50) {
			return forty(number);
		} else if (number < 60) {
			return fifty(number);
		} else if (number < 70) {
			return sixty(number);
		} else if (number < 80) {
			return seventy(number);
		} else if (number < 90) {
			return eighty(number);
		} else if (number < 100) {
			return ninety(number);
		}
		return null;

	}

	// twenty helper function
	private static String twenty(int x) {
		String returnVal = "";

		if (x < 30 && x > 20) {
			returnVal += "twenty " + oneToNineteen(x - 20);
		}
		return returnVal;
	}

	// thirty helper function
	private static String thirty(int x) {
		String returnVal = "";

		if (x > 30 && x < 40) {
			returnVal += "thirty " + oneToNineteen(x - 30);
		}
		return returnVal;
	}

	// forty helper function
	private static String forty(int x) {
		String returnVal = "";

		if (x > 40 && x < 50) {
			returnVal += "forty " + oneToNineteen(x - 40);
		}
		return returnVal;
	}

	// fifty helper function
	private static String fifty(int x) {
		String returnVal = "";

		if (x > 50 && x < 60) {
			returnVal += "fifty " + oneToNineteen(x - 50);
		}
		return returnVal;
	}

	// Sixty helper
	private static String sixty(int x) {
		String returnVal = "";

		if (x > 60 && x < 70) {
			returnVal += "sixty " + oneToNineteen(x - 60);
		}
		return returnVal;
	}

// seventy helper function
	private static String seventy(int x) {
		String returnVal = "";

		if (x > 70 && x < 80) {
			returnVal += "seventy " + oneToNineteen(x - 70);
		}
		return returnVal;
	}

// eighty helper function
	private static String eighty(int x) {
		String returnVal = "";

		if (x > 80 && x < 90) {
			returnVal += "eighty " + oneToNineteen(x - 80);
		}
		return returnVal;
	}

// ninety helper function
	private static String ninety(int x) {
		String returnVal = "";
		if (x == 90) {
			return "ninety";
		}
		if (x > 90 && x < 100) {
			returnVal += "ninety " + oneToNineteen(x - 90);
		}
		return returnVal;
	}

	// 100 helper
	private static String hundred(int x) {

		// will give the hundereds place value
		int firstNumber = ((x / 10) / 10);
		// gives you the solo hundreds to subtract
		int solidHundred = firstNumber * 100;
		// pop the back off the hundred
		int tensPlaces = x - solidHundred;

		return oneToNineteen(firstNumber) + " hundred " + twentyToNinety(tensPlaces);

	}

	// 1000 helper
	private static String thousand(int x) {

		// will give the thousanths place value 1,000 = 1
		int firstNumber = ((x / 100) / 10);

		// gives you the solo thousand to subtract
		int solidThousand = firstNumber * 1000;

		// pop the hundred ex 2250 = 250
		int hundredsPlace = x - solidThousand;

		// at this point call to the hundreds helper

		// 1= one thousand call to the hundreds helper
		return oneToNineteen(firstNumber) + " thousand " + hundred(hundredsPlace);

	}

	// 10,000 helper
	private static String tenThousand(int x) {
		String returnVal = "";
		//divide x by 1000 to get the tens place thousand
		int tenThousand = x / 1000; // 20,000 =  20
		
		//if 10 -19 
		if (tenThousand < 20) {
			returnVal = oneToNineteen(tenThousand);	
		} else if (tenThousand < 100) {
			returnVal = twentyToNinety(tenThousand);
		}
		//20,250 twenty thousand, two hundred fifty
		
		//ten * 1000 equals the solid number to subtract
		// 20 * 1000 = 20,000
		int solidTenThousand = tenThousand * 1000;
		//20,250 - 20,000 = 250
		int hundredsPlace = x - solidTenThousand;
		// return value is the tens thousands place + hundreds 
		return returnVal + " thousand " + hundred(hundredsPlace);
	}

	// helper function
	private static String oneToNineteen(int integer) {
		switch (integer) {
		case 0:
			return "zero";
		case 1:
			return "one";
		case 2:
			return "two";
		case 3:
			return "three";
		case 4:
			return "four";
		case 5:
			return "five";
		case 6:
			return "six";
		case 7:
			return "seven";
		case 8:
			return "eight";
		case 9:
			return "nine";
		case 10:
			return "ten";
		case 11:
			return "eleven";
		case 12:
			return "twelve";
		case 13:
			return "thirteen";
		case 14:
			return "fourteen";
		case 15:
			return "fifteen";
		case 16:
			return "sixteen";
		case 17:
			return "seventeen";
		case 19:
			return "nineteen";
		}
		return null;
	}

}
