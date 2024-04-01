package com.sbi.serviceImpl;

import java.util.Scanner;

import com.sbi.model.*;
import com.sbi.service.*;

public class SBI implements RBI {
	Scanner sc = new Scanner(System.in);
	Account[] ac_array=new Account[10];
    Account ac = new Account();

	@Override
	public void createAccount() {
		System.out.println("how many users you want to add ?");
		int n=sc.nextInt();//2
		for(int i=0;i<n;i++) {
		System.out.println("Enter Account Number");
		int accountNumber = sc.nextInt();
		ac.setAccountNo(accountNumber);
		System.out.println("Enter Account Name");
		String accName = sc.next();
		ac.setAccountName(accName);
		System.out.println("Enter aadharcard number");
		String aadharCard = sc.next();
		ac.setAadharCard(aadharCard);
		System.out.println("Enter Pan Card");
		String pancard = sc.next();
		ac.setPancard(pancard);
		System.out.println("Enter your contact number");
		long contact = sc.nextLong();
		ac.setContact(contact);
		System.out.println("Enter account opening balance");
		double accountBalance = sc.nextDouble();
		ac.setAccountBalance(accountBalance);
		}
		System.out.println("@@@@@Account registrations success@@@@@");

	}

	@Override
	public void showAccountDetails() {
		System.out.println("Enter your Account Number");
		int accNo = sc.nextInt();
		if (ac.getAccountNo() == accNo) {
			System.out.println("ACCOUNT NAME:" + ac.getAccountName() + "CONTACT:" + ac.getContact() + "ACCOUNT NUMBER:"
					+ ac.getAccountNo() + "PANCARD:" + ac.getPancard());

		} else {
			System.out.println("Account doesn't exist!!!");
		}

	}

	@Override
	public void showAccountBalance() {
		System.out.println("Enter your Account Number");
		int accNo = sc.nextInt();
		if (ac.getAccountNo() == accNo) {
			System.out.println("CURRENT ACCOUNT BALANCE:" + ac.getAccountBalance());
		} else {
			System.out.println("ACCOUNT DOESN'T EXIST!!!");
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
		System.out.println("Enter your Account Number");
		int accNo = sc.nextInt();
		if (ac.getAccountNo() == accNo) {
			System.out.println("Enter amount for deposit");
			double depositAmount = sc.nextDouble();
			double accBal = ac.getAccountBalance();
			double updateAmount = accBal + depositAmount;
			ac.setAccountBalance(updateAmount);
			System.out.println("**updated amount**" + updateAmount);
		} else {
			System.out.println("***account no is invalid***");
		}

	}

	@Override
	public void updateAccountDetails() {
		boolean flag=true;
		System.out.println("Enter Your Account Number");
		int accNo = sc.nextInt();
		if (ac.getAccountNo() == accNo) {
			System.out.println("1. Update Account Name");
			System.out.println("2. Update Contact Number");
			System.out.println("3. Update Pancard Number");
			System.out.println("4. Update Email Address");
			System.out.println("5. Exit..");
			System.out.println("Please select from above option");
			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Enter new name");
				String accName = sc.next();
				ac.setAccountName(accName);
				System.out.println("Account name updated");
				System.out.println("Updated Account Name:-" + accName);
				break;
			case 2:
				System.out.println("Enter new contact number");
				long contactNum = sc.nextLong();
				ac.setContact(contactNum);
				System.out.println("Contact number updated");
				System.out.println("Updated Contact Number:" + contactNum);
				break;
			}
		} else {
			System.out.println("Account Doesn't Exist");
		}

	}

}



