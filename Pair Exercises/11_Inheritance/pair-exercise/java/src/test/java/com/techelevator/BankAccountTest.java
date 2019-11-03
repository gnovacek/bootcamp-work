package com.techelevator;

import com.techelevator.bank.BankAccount;
import com.techelevator.bank.CheckingAccount;
import com.techelevator.bank.SavingsAccount;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import java.math.BigDecimal;



public class BankAccountTest {

	@Test
	public void deposit_adds_amounttodeposit_to_checking() {
		CheckingAccount test = new CheckingAccount();
		BigDecimal deposit = new BigDecimal("10"); // arrange

		test.deposit(deposit); // act

		Assert.assertEquals(test.getBalance(), deposit);// assert

	}

	@Test
	public void deposit_adds_amounttodeposit_to_savings() {
		SavingsAccount test = new SavingsAccount();
		BigDecimal deposit = new BigDecimal("10"); // arrange

		test.deposit(deposit); // act

		Assert.assertEquals(test.getBalance(), deposit);// assert

	}

	@Test
	public void withdraw_subtracts_amounttowithdraw_from_checking() {
		CheckingAccount test = new CheckingAccount();
		BigDecimal deposit = new BigDecimal("200");
		BigDecimal withdraw = new BigDecimal("10");// arrange

		test.deposit(deposit);
		test.withdraw(withdraw);// act

		Assert.assertEquals(test.getBalance(), deposit.subtract(withdraw));// assert

	}

	@Test
	public void withdraw_subtracts_amounttowithdraw_from_savings() {
		SavingsAccount test = new SavingsAccount();
		BigDecimal deposit = new BigDecimal("200");
		BigDecimal withdraw = new BigDecimal("10");// arrange

		test.deposit(deposit);
		test.withdraw(withdraw);// act

		Assert.assertEquals(test.getBalance(), deposit.subtract(withdraw));// assert

	}

	@Test
	public void transfer_from_savings_to_checking() {
		SavingsAccount savings = new SavingsAccount();
		CheckingAccount checking = new CheckingAccount();
		BigDecimal deposit = new BigDecimal("200");
		BigDecimal transfer = new BigDecimal("10");// arrange

		savings.deposit(deposit);
		savings.transfer(checking, transfer);// act

		Assert.assertEquals(checking.getBalance(), transfer);
		Assert.assertEquals(savings.getBalance(), deposit.subtract(transfer));// assert

	}

	@Test
	public void transfer_from_checking_to_savings() {
		SavingsAccount savings = new SavingsAccount();
		CheckingAccount checking = new CheckingAccount();
		BigDecimal deposit = new BigDecimal("200");
		BigDecimal transfer = new BigDecimal("10");// arrange

		checking.deposit(deposit);
		checking.transfer(savings, transfer);// act

		Assert.assertEquals(savings.getBalance(), transfer);
		Assert.assertEquals(checking.getBalance(), deposit.subtract(transfer));// assert
	}
}
