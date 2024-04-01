package com.inheritance;

public class B extends A{
	int cba=05;
	public void m2() {
		System.out.println("Inheritance of class B");
		
	}
      public static void main(String[] args) {
		B b=new B();
		System.out.println(b.cba);
		System.out.println(b.abc);
		b.m1();
		b.m2();
	}
}
