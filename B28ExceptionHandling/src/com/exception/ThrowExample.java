package com.exception;

import java.util.Scanner;

public class ThrowExample {
	
	//bank account ---->>> online
	//user age < 18
	
	public static void validateAge(int age) {
		System.out.println("---entry into the validateAge method-----");
		if(age<18) {
			throw new ArithmeticException("Person is not eligible to create the bank account, Please visit again after completing the age 18");
		}else {
			System.out.println("Person is eligible for create the bank account");
		}
	
	}
	public static void main(String[] args) {
		System.out.println("Enter into the main method");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int userAge=sc.nextInt();
		try {
			validateAge(userAge);
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
		
	}

}
