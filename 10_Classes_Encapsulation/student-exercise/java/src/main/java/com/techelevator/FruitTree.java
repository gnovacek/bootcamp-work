package com.techelevator;

public class FruitTree {
	private String typeOfFruit;
	private int piecesOfFruitLeft;

	public FruitTree(String typeOfFruit, int startingPiecesOfFruit) {
		this.typeOfFruit = typeOfFruit;
		this.piecesOfFruitLeft = startingPiecesOfFruit;
	}

	public String getTypeOfFruit() {
		return typeOfFruit;
	}

	public int getPiecesOfFruitLeft() {
		return piecesOfFruitLeft;
	}

	public boolean pickFruit(int numberOfPiecesToRemove) {
		if (getPiecesOfFruitLeft() > 0) {
			piecesOfFruitLeft = piecesOfFruitLeft - numberOfPiecesToRemove;
			return true;
		}
		return false;
	}

}
