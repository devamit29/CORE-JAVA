package com.logicalsession;

import java.util.Scanner;

public class Test {
	//odd even number Test
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:-");
		int n=sc.nextInt();
		
		if (n%2==0) {
			System.out.println("Number is even");
			
		} else {
			System.out.println("Number is odd");

		}
	}

}
