package com.techelevator.bank;
import java.math.BigDecimal;

public abstract class BankAccount {

	protected String accountNumber;
	protected BigDecimal balance;

	public BankAccount() {
		this.balance = BigDecimal.ZERO;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public BigDecimal deposit(BigDecimal amountToDeposit) {
		balance = balance.add(amountToDeposit);
		return balance;
		
	}

	public BigDecimal withdraw(BigDecimal amountToWithdraw) {
		balance = balance.subtract(amountToWithdraw);
		return balance;
	}

	public void transfer(BankAccount destinationAccount, BigDecimal transferAmount) {
		balance = balance.subtract(transferAmount); 
		destinationAccount.deposit(transferAmount); 
		}
	}
