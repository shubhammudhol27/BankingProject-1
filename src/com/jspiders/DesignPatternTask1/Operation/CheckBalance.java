package com.jspiders.DesignPatternTask1.Operation;

import com.jspiders.DesignPatternTask1.Account.Account;

public class CheckBalance {
	public void checkBalance() {
		Account account =Account.getAddress();
		System.out.println("Current Balance is :" +account.accountBalance);
	}
}
