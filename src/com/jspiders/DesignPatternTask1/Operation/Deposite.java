package com.jspiders.DesignPatternTask1.Operation;

import com.jspiders.DesignPatternTask1.Account.Account;

public class Deposite {
	public double DepositeAmount(double Amount) {
		Account account =Account.getAddress();
		account.accountBalance+=Amount;
		System.out.println("Current Balance is :" +account.accountBalance);
		return account.accountBalance;
	}

}
