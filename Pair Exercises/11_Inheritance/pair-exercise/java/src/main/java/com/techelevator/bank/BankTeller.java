package com.techelevator.bank;
import java.math.BigDecimal;

public class BankTeller {
	public static void main (String[] args) {
		BankAccount checkingAccount = new CheckingAccount();
		BankAccount savingsAccount = new SavingsAccount();

		BankCustomer jayGatsby = new BankCustomer();
		jayGatsby.addAccount(checkingAccount);
		jayGatsby.addAccount(savingsAccount);
		
		BigDecimal amountToDeposit = new BigDecimal("24000");
		savingsAccount.deposit(amountToDeposit);
		
		//BigDecimal amountToWithdraw = new BigDecimal("4");

		System.out.println(String.format("Jay Gatsby has %s accounts.", jayGatsby.getAccounts().length));
		System.out.println("Checking before: " + savingsAccount.getBalance() +" "+jayGatsby.isVip() );
		
		//savingsAccount.withdraw(amountToWithdraw);
		//System.out.println("Checking after: " + savingsAccount.getBalance());
		
		
	}
}
