package com.techelevator.bank;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BankCustomer {
	
		private String name;
		private String address;
		private String phoneNumber;
		private BankAccount[] accounts;
		private boolean isVip;
		
		
		
		private List <BankAccount> accountsToAdd = new ArrayList<BankAccount>();
		
		
		
		
	public BankAccount[] getAccounts() {
		accounts = accountsToAdd.toArray(new BankAccount[accountsToAdd.size()]);
		return accounts;
	}

		public void setName(String name) {
			this.name = name;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		
		public void addAccount(BankAccount newAccount){
			accountsToAdd.add(newAccount);
			
		}

	public boolean isVip() {
		
		BigDecimal totalAmount = new BigDecimal("0");
		BigDecimal amount = new BigDecimal("25000");

		for (BankAccount account : this.getAccounts()) {
			totalAmount = totalAmount.add(account.getBalance());
		}

		if (totalAmount.compareTo(amount) >= 0) {

			return true;

		}

		return false;
	}
		

	
}
