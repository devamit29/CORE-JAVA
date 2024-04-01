package com.sbi.serviceImpl;
import java.util.Scanner;
import com.sbi.model.*;
import com.sbi.service.*;

public class SBI implements RBI {
	Scanner sc = new Scanner(System.in);
	Account ac=new Account();
	Account[] ac_array = new Account[10];

	@Override
	public void createAccount() {

		System.out.println("how many users you want to add ? ");
		int n = sc.nextInt();// 2
		for (int i = 0; i < n; i++) {

			Account ac = new Account();
//		int accountNumber = getAccountNumber();
			ac.setAccountNo(getValidAccountNumber());

			// Take account holder name from scanner
			ac.setAccountName(getValidAccountName());

			System.out.println("Enter aadharcard number ");
			String aadharCard = sc.next();
			ac.setAadharCard(aadharCard);

			System.out.println("Enter pan card");// adghp8765h-- regex
			String pancard = sc.next();
			ac.setPancard(pancard);

			ac.setContact(getValidContactNumber());

			System.out.println("Enter account opening balance ");
			double accountBalance = sc.nextDouble();
			ac.setAccountBalance(accountBalance);

			ac_array[i] = ac;
		}

		System.out.println("@@@@@Account registrations success@@@@@");
	}

	private long getValidContactNumber() {
		System.out.println("enter your contact number ");
		long contact = sc.nextLong();
		String contactInString = String.valueOf(contact);
		if (contactInString == null || contactInString.length() != 10) {
			System.out.println("invalid contact number..");
			return getValidContactNumber();
		}
		return contact;
	}

	private String getValidAccountName() {
		System.out.println("Enter account name ");
		String accName = sc.next();
		if (accName != null && !accName.isEmpty()) {
			int length = accName.trim().length();
			if (length >= 3) {
				return accName;
			} else {
				System.out.println("Acc Name is invalid, please try again: ");
				return getValidAccountName();
			}
		} else {
			System.out.println("Acc Name is Null/Empty, please try again: ");
			return getValidAccountName();
		}

	}

	private int getValidAccountNumber() {
		System.out.println("Enter account number");
		int accountNumber = sc.nextInt();

		// check is valid
		if (accountNumber >= 100000 && accountNumber <= 999999) {
			return accountNumber;
		} else {
			System.out.println("invalid account number...");
			return getValidAccountNumber();
		}

	}

	@Override
	public void showAccountDetails() {

		int accNo = getValidAccountNumber();
		for (Account ac : ac_array) {

			if (ac.getAccountNo() == accNo) {

				System.out.println("ACCOUNT NAME :" + ac.getAccountName() + " CONTACT :" + ac.getContact()
						+ " ACCOUNT NUMBER:" + ac.getAccountNo() + " PANCARD :" + ac.getPancard());

			} else {
				System.out.println("Account doesn't exit !!!");
			}

		}
	}

	@Override
	public void showAccountBalance() {

		int accNo = getValidAccountNumber();
		for (Account ac : ac_array) {
			if (ac.getAccountNo() == accNo) {
				System.out.println("CURRENT ACCOUNT BALANCE :" + ac.getAccountBalance());
			} else {
				System.out.println("ACCOUNT DOESN'T EXIT !!!");
			}
		}
	}

	@Override
	public void withdrawMoney() {

		System.out.println("Enter your Account Number");
		int accNo = sc.nextInt();
		
		if (ac.getAccountNo() == accNo) {
			System.out.println("Enter amount for withdraw");
			double withdrawAmount = sc.nextDouble();
			double accBal = ac.getAccountBalance();
			double updateAmount = accBal - withdrawAmount;
			ac.setAccountBalance(updateAmount);
			System.out.println("***UPDATED AMOUNT**" + updateAmount);
		} else {
			System.out.println("Account no. is not valid");
		}

	}

	@Override
	public void depositMoney() {

	}

	@Override
	public void updateAccountDetails() {

		boolean flag = true;
		int accNo = getValidAccountNumber();
		for (Account ac : ac_array) {
			if (accNo == ac.getAccountNo()) {

				do {
					System.out.println("Update --MENU---");
					System.out.println("1. Name ");
					System.out.println("2. Mobile Number ");
					System.out.println("3. Pancard Number ");
					System.out.println("4. Email ");
					System.out.println("5. Exit.. ");

					System.out.println("Select feild to update :");
					int ch = sc.nextInt();// 1

					switch (ch) {
					case 1:
						System.out.println("Enter account name");
						String nameUpdate = sc.next();
						ac.setAccountName(nameUpdate);
						break;
					case 2:
						System.out.println("You are going to update Mobile number.");
						long mob = sc.nextLong();
						ac.setContact(mob);
						break;
					case 5:
						System.out.println("You are going to Exit update form.");
						flag = false;
						break;
					default:
						System.out.println("Invalid choice try again...");
						break;
					}
				} while (flag);
				
				break;
			} else {
				System.out.println("Account doesn't exist...");
			}
		}
	}

	public void updateAccountName() {

	}
	
}
