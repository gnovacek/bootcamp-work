package com.techelevator.bank;
import java.math.BigDecimal;

public class CheckingAccount extends BankAccount {

    public CheckingAccount() {

    }

    @Override
    public BigDecimal withdraw(BigDecimal amountToWithdraw) {
        // less than - returns -1 // equal to - returns 0 // greater than - returns 1
        BigDecimal tempBalance = balance.subtract(amountToWithdraw);

        BigDecimal maxLimit = new BigDecimal("-100");
        BigDecimal overDraftFee = new BigDecimal("10");
        if (amountToWithdraw.compareTo(BigDecimal.ZERO) < 0) {
        	return balance;
        }
        // can't be more than -100... if it is, nothing happens 
        else if (tempBalance.compareTo(maxLimit) < 0) {
            return balance; 
        } else if (tempBalance.compareTo(BigDecimal.ZERO) < 0) {
            // if your balance goes under 0, you get overDraft fee of $10
            balance = tempBalance.subtract(overDraftFee);
            return balance;
        } else {
            balance = tempBalance;
            return balance;
        }

    }
}