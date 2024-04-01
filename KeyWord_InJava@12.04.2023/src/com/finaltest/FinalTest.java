package com.finaltest;

public  class FinalTest {
	final int id=100;
	
	public final void m1() {
		System.out.println("final m1 method");
	}
	public  void m2() {
		System.out.println("m2 method of final test class");
	}
	public static void main(String[] args) {
	  FinalTest f=new FinalTest();
	  System.out.println(f.id);
	}

}
