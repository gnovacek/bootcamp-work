package com.techelevator.bank;
import java.math.BigDecimal;

public class SavingsAccount extends BankAccount {

	public SavingsAccount() {

	}

	@Override
	public BigDecimal withdraw(BigDecimal amountToWithdraw) {

		// less than - returns -1
		// equal to - returns 0
		// greater than - returns 1

		// New stuff, learn from this!
		BigDecimal newBalance = balance.subtract(amountToWithdraw);
		BigDecimal limit = new BigDecimal("150");
		BigDecimal serviceChargeFee = new BigDecimal("2");
		boolean withdrawIsPositive = (amountToWithdraw.compareTo(BigDecimal.ZERO) > 0);
		if(!withdrawIsPositive) {
			return balance;
		}
		else if(amountToWithdraw.compareTo(BigDecimal.ZERO) < 0) {
			return balance;
		}
		else if (newBalance.compareTo(BigDecimal.ZERO) < 0) {
			return balance;
			// if your balance goes under 150, you you get service charge
		} else if (newBalance.compareTo(limit) < 0) {
			balance = newBalance.subtract(serviceChargeFee);
			return balance;
		} else {
			balance = newBalance;
			return balance;
		}

	}

}