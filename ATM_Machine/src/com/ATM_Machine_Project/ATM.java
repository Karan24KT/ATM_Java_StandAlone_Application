package com.ATM_Machine_Project;

import java.util.Scanner;

//import javax.imageio.plugins.tiff.ExifGPSTagSet;

public class ATM {
	final static int pin = 1234;
	// public static float balance = 10002;

	public ATM(int pin) {
		// TODO Auto-generated constructor stub

	}

	public static void menu() {
		// 1. Withdraw Money
		// 2. Account Balance
		// 3. Deposit Money
		// 4. Exit
		System.out.println("***** ATM Services *****");
		System.out.println();
		System.out.println("Enter Your Choice");
		System.out.println("1. Check Account Balance");
		System.out.println("2. WithDraw Money");
		System.out.println("3. Deposit Money");
		System.out.println("4. EXIT");

		Scanner scanner = new Scanner(System.in);
		int customerChoice = scanner.nextInt();

		checkCustomMenuChoice(customerChoice);

	}

	public static void showMenuAgain() {
		// showMenuAgain==true ? menu() : System.exit(0);
		Scanner scanner = new Scanner(System.in);
		int showAgain = scanner.nextInt();

		if (showAgain == 1) {
			menu();
		} else {
			MenuFunction.exit();
			// System.exit(0);
		}
	}

	public static void checkCustomMenuChoice(int customerChoice) {

		switch (customerChoice) {
		case 1:
			System.out.println("### Current Account Balance Service ### ");
			MenuFunction.checkBalance();
			System.out.println();
			System.out.println("Show Service Again -> Enter 1/0");
			showMenuAgain();
			break;
		case 2:
			System.out.println("### WithDraw Money Service ###");
			MenuFunction.withdrawMoney();
			System.out.println();
			System.out.println("Show Service Again -> Enter 1/0");
			System.out.println();
			showMenuAgain();
			break;
		case 3:
			System.out.println("### Deposit Money Service ###");
			MenuFunction.depositMoney();
			System.out.println();
			System.out.println("### Show Services Again -> Enter 1/0 ###");
			showMenuAgain();
			break;
		case 4:
			MenuFunction.exit();
			System.out.println("Customer Choose to Exit");
			break;
		default:
			System.out.println("Invalid Customer Choice");
			showMenuAgain();
			break;
		}

	}

	public static int EnterPIN() {
		System.out.println("Enter 4 Digit PIN");
		Scanner scanner = new Scanner(System.in);
		int PIN = scanner.nextInt();

		checkPIN(PIN);
		return PIN;
	}

	public static void checkPIN(int pinEnterByCustomer) {
		if (pinEnterByCustomer == pin) {
			System.out.println("***** Access Granted *****");
			System.out.println("Correct PIN");
			System.out.println();
			menu();
		} else {
			System.out.println("***** Security Alert ******");
			System.out.println("Invalid PIN");
			System.out.println();
			System.out.println("Please Enter PIN Again");
			EnterPIN();
		}
	}

	public static void main(String[] args) {

		System.out.println("***** WELCOME To KT~Dev ATM ******");
		System.out.println();

		// System.out.println("Enter 4 DIGIT PIN");

		int pin = ATM.EnterPIN();
		ATM Customer1 = new ATM(pin);

		// Customer1.pin = 1355;
		// Customer1.EnterPIN();

	}

}
