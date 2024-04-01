package com.polymorphism;

public class NarrowingTestMain {
	public static void m1(Object obj) {
		System.out.println("m1 with object");
	}
public static void m1(Parent p) {
		System.out.println("m1 with Parent");
	}
public static void m1(Child c) {
	System.out.println("m1 with child");
}

    public static void main(String[] args) {
		m1("abc");
    	m1(new Child());
		m1(new Parent());
		
	}
}
