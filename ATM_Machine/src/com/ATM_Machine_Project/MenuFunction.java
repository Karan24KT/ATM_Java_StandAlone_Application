package com.ATM_Machine_Project;

import java.util.Scanner;

public class MenuFunction {

	int amount;
	static int balance = 10000;

	public static void checkBalance() {
		System.out.println("+++ Current Balance = " + balance);
		System.out.println();
		// System.out.println(balance);
		// ATM.balance;
	}

	public static void withdrawMoney() {
		System.out.println("Enter Amount to be WithDraw");
		Scanner scanner = new Scanner(System.in);
		float withdrawAmount = scanner.nextFloat();

		if (withdrawAmount > 1 && withdrawAmount < balance) {
			balance -= withdrawAmount;
			System.out.println("Successfully withdraw amount " + withdrawAmount);
			System.out.println("New Balance = " + balance);
			System.out.println();
		} else {
			System.out.println("Invalid Amount Entered or Low Balance");
			System.out.println("Current Balance = " + balance);
			System.out.println();
		}
	}

	public static void depositMoney() {
		System.out.println("Enter Amount to be Deposited");
		Scanner scanner = new Scanner(System.in);
		float depositedAmount = scanner.nextFloat();

		if (depositedAmount > 1) {
			balance += depositedAmount;
			System.out.println("Successfully Deposited amount " + depositedAmount);
			System.out.println("New Balance = " + balance);
			System.out.println();
		} else {
			System.out.println("Invalid Amount Entered");
			System.out.println("Current Balance = " + balance);
			System.out.println();
		}
		// ATM.balance;
	}

	public static void exit() {
		System.out.println("**** Thank You For Using Our ATM ******");
		// ATM.balance;
		System.exit(0);
	}

}
