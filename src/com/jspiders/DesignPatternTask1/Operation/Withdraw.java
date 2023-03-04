package com.jspiders.DesignPatternTask1.Operation;

import com.jspiders.DesignPatternTask1.Account.Account;

public class Withdraw {

	public double WithdrawAmount(double Amount) {
		Account account =Account.getAddress();
		if(Amount<=account.accountBalance) {
			account.accountBalance-=Amount;
		}
		else {
			System.out.println("Insuficient Balance to withdraw");
		}
		System.out.println("Current Balance is :" +account.accountBalance);
		return account.accountBalance;
	}
}
