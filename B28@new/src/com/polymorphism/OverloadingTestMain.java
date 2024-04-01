package com.polymorphism;

public class OverloadingTestMain {
	// polymorphism--
	//need method name same
	//parameter(data types) should be different
	//access modifires and return type doesn't matter
	public void addition(int a, int b) {
		System.out.println("sum is :" + (a + b));
	}

	public int addition(int a, int b, int c) {
		System.out.println("sum is :" + (a + b + c));
		int add=a+b+c;
		return add;
	}
	public static void main(String args) {
		System.out.println("222");
	}
	public static void main(int[] args) {
		System.out.println(111);
	}
	
	public static void main(String[] args) {
		OverloadingTestMain main=new OverloadingTestMain();
		main.addition(10,20);
		
		
	}
}
