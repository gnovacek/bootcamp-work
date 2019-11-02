package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataPotterTest {

	@Test
	public void buy_book_one_once() {
		double costOfOneBook = 8;
		int[] books = new int[]{1}; 
		
		double returnValue = KataPotter.getCost(books);

		Assert.assertEquals("One book costs $8", costOfOneBook, returnValue, 0.001);
	}
	
	@Test
	public void buy_book_one_twice() {
		double costOfTwoSame = 16;
		int[] books = new int[]{2}; 
		
		double returnValue = KataPotter.getCost(books);

		Assert.assertEquals("One book costs $8, your total should be $16", costOfTwoSame, returnValue, 0.001);
	}

	@Test
	public void buy_two_different_books_once() {
		double cost2BooksWithDiscount = 15.2;
		int[] books = new int[]{1, 1}; 
		
		double returnValue = KataPotter.getCost(books);

		Assert.assertEquals("Two different books should cost $15.20", cost2BooksWithDiscount, returnValue, 0.001);
	}
	
	@Test
	public void buy_three_different_books_once() {
		double cost3BooksWithDiscount = 21.6;
		int[] books = new int[]{1, 1, 1}; 
		
		double returnValue = KataPotter.getCost(books);

		Assert.assertEquals("Three different books should cost $21.60", cost3BooksWithDiscount, returnValue, 0.001);
	}
	
	@Test
	public void buy_four_different_books_once() {
		double cost4BooksWithDiscount = 25.6;
		int[] books = new int[]{1, 1, 1, 1}; 
		
		double returnValue = KataPotter.getCost(books);

		Assert.assertEquals("Four different books should cost $25.60", cost4BooksWithDiscount, returnValue, 0.001);
	}
	
	@Test
	public void buy_five_different_books_once() {
		double cost5BooksWithDiscount = 30;
		int[] books = new int[]{1, 1, 1, 1, 1}; 
		
		double returnValue = KataPotter.getCost(books);

		Assert.assertEquals("Three different books should cost $30", cost5BooksWithDiscount, returnValue, 0.001);
	}
	
	@Test
	public void buy_five_different_books_a_variety_of_times() {
		double cost5BooksWithDiscount = 96;
		int[] books = new int[]{3, 2, 4, 1, 6}; 
		
		double returnValue = KataPotter.getCost(books);

		Assert.assertEquals("Three different books should cost $30", cost5BooksWithDiscount, returnValue, 0.001);
	}
}
