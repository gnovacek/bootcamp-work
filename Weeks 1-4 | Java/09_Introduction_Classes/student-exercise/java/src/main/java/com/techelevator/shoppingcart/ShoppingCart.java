package com.techelevator.shoppingcart;

public class ShoppingCart {

	private int totalNumberOfItems = 0;
	private double totalAmountOwed = 0.0;

	public int getTotalNumberOfItems() {
		return totalNumberOfItems;
	}

	public double getTotalAmountOwed() {
		return totalAmountOwed;
	}

	public double getAveragePricePerItem() {
		if (this.totalNumberOfItems == 0) {
			return 0.0;
		} else {
			return totalAmountOwed / totalNumberOfItems;
		}
	}

	public void addItems(int numberOfItems, double pricePerItem) {
		this.totalNumberOfItems += numberOfItems;
		this.totalAmountOwed += (pricePerItem * numberOfItems);
	}

	public void empty() {
		this.totalAmountOwed = 0;
		this.totalNumberOfItems = 0;
	}

}
