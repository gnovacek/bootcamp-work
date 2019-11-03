package com.techelevator;

import com.techelevator.bank.CheckingAccount;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

import java.math.BigDecimal;

import org.junit.After;

public class CheckingAccountTest {

	@Test
	public void doesnt_go_below_negative_100() {
		CheckingAccount test = new CheckingAccount();
		BigDecimal withdraw = new BigDecimal("200");

		test.withdraw(withdraw);

		Assert.assertEquals(test.getBalance(), BigDecimal.ZERO);
	}

	@Test
	public void negative_withdraw_number_doesnt_change_balance() {
		CheckingAccount test = new CheckingAccount();
		BigDecimal withdraw = new BigDecimal("-200");

		test.withdraw(withdraw);

		Assert.assertEquals(test.getBalance(), BigDecimal.ZERO);
	}

	@Test
	public void withdraw_works_normally() {
		CheckingAccount test = new CheckingAccount();
		BigDecimal deposit = new BigDecimal("1000");
		BigDecimal withdraw = new BigDecimal("200");

		test.deposit(deposit);
		test.withdraw(withdraw);

		Assert.assertEquals(test.getBalance(), deposit.subtract(withdraw));
	}

	@Test
	public void overdraft_if_balance_under_zero() {
		CheckingAccount test = new CheckingAccount();
		BigDecimal deposit = new BigDecimal("10");
		BigDecimal withdraw = new BigDecimal("20");
		BigDecimal overdraftFee = new BigDecimal("10");

		test.deposit(deposit);
		test.withdraw(withdraw);

		Assert.assertEquals(test.getBalance(), deposit.subtract(withdraw).subtract(overdraftFee));
	}
}
