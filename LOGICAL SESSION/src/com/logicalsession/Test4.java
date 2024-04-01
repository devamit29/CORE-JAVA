package com.logicalsession;

import java.util.Iterator;
import java.util.Scanner;

public class Test4 {
	//factorial

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:-");
		int n=sc.nextInt();
		int fact=1;
		for (int i = 1; i <=n; i++) {
			fact=fact * i;
			
		}
		System.out.println("fact of " + n + " is="+fact);
		
	}
}
