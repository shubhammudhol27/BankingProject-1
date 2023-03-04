package com.jspiders.DesignPatternTask1.Account;

import java.util.Scanner;

import com.jspiders.DesignPatternTask1.Operation.CheckBalance;
import com.jspiders.DesignPatternTask1.Operation.Deposite;
import com.jspiders.DesignPatternTask1.Operation.Withdraw;

public class Account {
	public double accountBalance;
	static Account account = new Account(10000);

	private Account(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public static Account getAddress() {
		return account;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Bank Managment");
			System.out.println(" 1. Withdraw \n 2. Deposite \n 3. CheckBalance \n 4. Exit");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				Withdraw withdraw = new Withdraw();
				System.out.print("Enter Amount to Withdraw:");
				double amount = scanner.nextDouble();
				withdraw.WithdrawAmount(amount);
				continue;
			case 2:
				Deposite deposite =new Deposite();
				System.out.print("Enter Amount to Deposite :");
				double amountToDepo = scanner.nextDouble();
				deposite.DepositeAmount(amountToDepo);
				continue;
			case 3:
                CheckBalance checkBalance =new CheckBalance();
                checkBalance.checkBalance();
				continue;
			case 4:
				System.out.println("Thank you");
				break;
			default:
				System.out.println("Invalid Input");
				continue;
			}
		  break;
		}
	}
}
