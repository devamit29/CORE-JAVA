package com.polymorphism;

public class NarrowingConcept {
	public void m1(Object obj) {
		System.out.println("Object method");
	}
	public void m1(String s) {
		System.out.println("String method");
	}
	public void m1(Byte b) {
		System.out.println("Byte method");
	}
	public void m1(Integer i) {
		System.out.println("Integer method");
	}
	public void m1(Character c) {
		System.out.println("Character method");
	}
	//public void m1(Boolean k) {
	//	System.out.println("Boolean method");
	//}
	public void m1(Short sh) {
		System.out.println("Short method");
	}
	public void m1(Long l) {
		System.out.println("Long method");
	}
	public void m1(float f) {
		System.out.println("float method");
	}
	public void m1(double d) {
		System.out.println("double method");
	}
	public void m1(char c) {
		System.out.println("Char method");
	}
public static void main(String[] args) {
	NarrowingConcept n=new NarrowingConcept();
	n.m1("abc");
	n.m1(10);
	n.m1(true);
	n.m1(10000);
	n.m1(9861733914l);
	n.m1(123.5674f);
	n.m1(12.345);
	n.m1('o');
	
	
}
}
