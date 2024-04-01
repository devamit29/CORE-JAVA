package com.polymorphism;

public class DemoTest {
	public void m1(int a) {
		System.out.println("Single parameter method");
	}
	public void m1(String s,int a) {
		System.out.println("Double parameter method");
	}
	public void m1(String s,double d,float f) {
	System.out.println("Three parameter method");
	}
	public static void main(String[] args) {
		DemoTest dt=new DemoTest();
		dt.m1("a",0.00,12.00f);
	}

}
