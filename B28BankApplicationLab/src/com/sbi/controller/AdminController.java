package com.sbi.controller;

import java.util.Scanner;

public class AdminController {
	public static void main(String[] args) {
		System.out.println("****WELCOME TO SBI BANK****");
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		RBI rbi = new SBI();
		while (flag) {
			System.out.println("----------------------------");
			System.out.println("----------------------------");
			System.out.println("1: CREATE BANK ACCOUNT      ");
			System.out.println("2: SHOW ACCOUNT DETAILS     ");
			System.out.println("3: SHOW ACCOUNT BALANCE      ");
			System.out.println("4: DEPOSIT MONEY            ");
			System.out.println("5: WITHDRAW MONEY           ");
			System.out.println("6: UPDATE ACCOUNT DETAILS   ");
			System.out.println("7: EXIT                      ");
			System.out.println("----------------------------");
			System.out.println("----------------------------");
			System.out.println("Enter Your Choice");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				rbi.createAccount();
				break;
			case 2:
				rbi.showAccountDetails();
				break;
			case 3:
				rbi.showAccountBalance();
				break;
			case 4:
				rbi.depositMoney();
				break;
			case 5:
				rbi.withdrawMoney();
				break;
			case 6:
				rbi.updateAccountDetails();
				break;
			case 7:
				flag = false;
				break;

			default:
				System.out.println("Invalid choice try again!!!");
				break;
			}

		}
		sc.close();
		System.out.println("::::Thank You for Banking::::");

	}

}

