package com.techelevator;

public class KataPotter {
	// one book $8 
	// two diff titles, 5% discount 
	// three titles, 10% discount 
	// four titles, 20% discount 
	// all five, 25%
	
	// the best I could do with the time I have!
	
	public static double getCost(int[] books) {
		double totalCost= 0;
		
		for(int i=0; i < books.length; i++) {
			totalCost += books[i] * 8; 
		}
		
		if(books.length == 2) {
			totalCost = totalCost * .95; 
		} else if (books.length == 3) {
			totalCost = totalCost * .9; 
		} else if (books.length == 4) {
			totalCost = totalCost * .8; 
		} else if (books.length == 5) {
			totalCost = totalCost * .75; 
		}
		
		return totalCost; 
	}
	
	
}
