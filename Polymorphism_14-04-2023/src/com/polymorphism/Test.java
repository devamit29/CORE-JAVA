package com.polymorphism;

public class Test {
	
	public void m1(int i) {
		System.out.println("Single parameter method");
		System.out.println("Saving account");
	}
	public void m1(int i,int j) {
		System.out.println("Double parameter method");
		System.out.println("Current account");
	}
    public static void main(String[] args) {
		Test t=new Test();
		t.m1(10,12);
	}
}
