package com.returntype;

public class A {
	
	public void m1() {
		
		System.out.println("m1 method");
	}
	
	public int m2() {
		
		System.out.println("m2 method");
		int i=50;
		
		return i;
	}
	
	public int add(int a,int b) {
		
		int c=a+b;
		
		return c;
		
		
	}
	
	public static void main(String[] args) {
		System.out.println("main method started");
		A a=new A();
		
		a.m1();
		int i=a.m2();
		System.out.println(i);
		
		int addition=a.add(60, 70);
		System.out.println(addition);
		
		int add2=a.add(55, 23);
		System.out.println(add2);
		System.out.println("main method end");
	}

}
