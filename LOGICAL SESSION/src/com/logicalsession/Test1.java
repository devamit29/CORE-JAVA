package com.logicalsession;

import java.util.Scanner;

public class Test1 {
	//even odd number Test using Ternary operator
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		
		String Test1=(n % 2==0) ? "even no." : "odd no.";
		System.out.println(n + " is "+Test1);
	}

}
