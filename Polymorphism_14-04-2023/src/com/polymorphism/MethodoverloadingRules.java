package com.polymorphism;

public class MethodoverloadingRules {
	public static void m1(String s,int j) {
		System.out.println("m1 with two parameter");
	}
	protected int m1(double d) {
		System.out.println("m1 with single parameter ");
		return 10;
	}
	final void m1(int d) {
		System.out.println("m1 with single parameter2 ");
	}
	public static void main(String[] args) {
		MethodoverloadingRules m=new MethodoverloadingRules();
		m.m1("abc",10);
		m.m1(10);
		m.m1(10.12);
		
	}
		
	

}
