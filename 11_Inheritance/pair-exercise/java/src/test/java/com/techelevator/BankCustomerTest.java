package com.techelevator;

import com.techelevator.bank.BankCustomer;
import com.techelevator.bank.CheckingAccount;
import com.techelevator.bank.SavingsAccount;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import java.math.BigDecimal;

public class BankCustomerTest {

	@Test
	public void isvip_returns_true_if_amount_over_25000() {
		BankCustomer testCustomer = new BankCustomer();
		CheckingAccount checking = new CheckingAccount();
		SavingsAccount savings = new SavingsAccount();
		BigDecimal deposit1 = new BigDecimal("15000");
		BigDecimal deposit2 = new BigDecimal("10000");

		testCustomer.addAccount(checking);
		testCustomer.addAccount(savings);

		checking.deposit(deposit2);
		savings.deposit(deposit1);

		Assert.assertTrue(testCustomer.isVip());
	}

	@Test
	public void isvip_returns_false_if_amount_under_25000() {
		BankCustomer testCustomer = new BankCustomer();
		CheckingAccount checking = new CheckingAccount();
		SavingsAccount savings = new SavingsAccount();
		BigDecimal deposit1 = new BigDecimal("100");
		BigDecimal deposit2 = new BigDecimal("10000");

		testCustomer.addAccount(checking);
		testCustomer.addAccount(savings);

		checking.deposit(deposit2);
		savings.deposit(deposit1);

		Assert.assertFalse(testCustomer.isVip());
	}

}
