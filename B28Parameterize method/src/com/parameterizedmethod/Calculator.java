package com.parameterizedmethod;

public class Calculator {
	
	public int additions(int i, int j) {
		int add=i+j;
		return add;
	}
	public int substractions(int k, int m) {
		int sub=k-m;
		return sub;
	}
	public int multiplications(int i,int j) {
		int multi = i*j;
		return multi;
	}
	public int division(int l, int r) {
		int div=l/r;
		return div;
	}
	public static void main(String[] args) {
		Calculator c=new Calculator();
		int additions=c.additions(50,20);
		System.out.println("Additions of two nos is:"+additions);
		
		int substractions=c.substractions(100, 10);
		System.out.println("Substractions of two nos is:"+substractions);
		
		int multiplications=c.multiplications(2,6);
		System.out.println("Multiplications of two nos is:"+multiplications);
		
		int division=c.division(55,11);
		System.out.println("Division of two nos is:"+division);
		
		
		
	}

}
