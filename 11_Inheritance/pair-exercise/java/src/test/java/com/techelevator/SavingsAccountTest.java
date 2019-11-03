package com.techelevator;

import com.techelevator.bank.SavingsAccount;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

import java.math.BigDecimal;

import org.junit.After;

public class SavingsAccountTest {

	
	@Test
	public void withdraw_zero_returns_balance() {
		SavingsAccount test = new SavingsAccount();
		test.withdraw(BigDecimal.ZERO);//act
		
		Assert.assertEquals(test.getBalance(), test.getBalance().subtract(BigDecimal.ZERO));// assert
	}

	@Test
	public void withdraw_under_150() {
		SavingsAccount test = new SavingsAccount();
		BigDecimal limit = new BigDecimal("150");
		BigDecimal toWithdraw = new BigDecimal("10");
		BigDecimal fee = new BigDecimal("2");
		
		test.deposit(limit); // arrange

		test.withdraw(toWithdraw); // act

		Assert.assertEquals("Balance is not subtracted by two and withdraw amount",
				(limit.subtract(toWithdraw).subtract(fee)), test.getBalance());
		// assert
	}

	@Test
	public void withdraw_balance_is_subtracted() {
		SavingsAccount test = new SavingsAccount();
		BigDecimal toDeposit = new BigDecimal("13000");
		BigDecimal toWithdraw = new BigDecimal("10");
		
		test.deposit(toDeposit);// arrange
		test.withdraw(toWithdraw);// act
		Assert.assertEquals(test.getBalance(), toDeposit.subtract(toWithdraw));// assert
	}

	@Test
	public void withdraw_does_not_allow_negative_withdrawl() {
		SavingsAccount test = new SavingsAccount();
		BigDecimal toDeposit = new BigDecimal("13000");
		BigDecimal toWithdraw = new BigDecimal("-10");// arrange
		test.deposit(toDeposit);
		
		test.withdraw(toWithdraw);// act
		Assert.assertEquals(test.getBalance(), toDeposit);// assert
	}

	@Test
	public void withdraw_does_not_allow_balance_to_become_negative() {
		SavingsAccount test = new SavingsAccount();
		BigDecimal toDeposit = new BigDecimal("200");
		BigDecimal toWithdraw = new BigDecimal("300");// arrange
		
		test.deposit(toDeposit);
		test.withdraw(toWithdraw);// act
		
		Assert.assertEquals(test.getBalance(), toDeposit);// assert
	}

}
