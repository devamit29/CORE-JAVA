package com.logicalsession;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		
		
		long fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: -");
		int num=sc.nextInt();
		
		for (int i = 1; i <=num; i++) {
			
			fact = fact*i;
			
		}
		System.out.println("factorial of "+ num + " is "+fact);
	}

}
