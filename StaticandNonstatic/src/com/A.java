package com;

public class A {
	
	static int c=5020;//static variable
	static String name="pqr";
	
     
	int a=103;//non static
	String name1="Abc";
	
	static public void m1() {
		int b =110;
		 String name="xyz";
		//static byte bt=101;
		 final int b1=140;
		System.out.println("value of b:" + b +"   "+"name is :"+name+"  "+b1);
	}
	
	public static void main(String[] args) {
		System.out.println(A.c);
		System.out.println(A.name);
		
		System.out.println("Global variable");
		A a=new A();
		System.out.println(A.c);
		System.out.println(A.name);
		System.out.println("local variable");
		a.m1();
		
		
	}
}
