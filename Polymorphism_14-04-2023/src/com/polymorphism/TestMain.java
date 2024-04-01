package com.polymorphism;

public class TestMain {
	    static {
	    	System.out.println("1111");
	    }
	private static void display() {
		System.out.println("display method call...");
	}
	private static void display(int rollNo) {
		System.out.println("display method call..."+rollNo);
	}
	private static void display(int rollNo,String name) {
		System.out.println("display method call..."+rollNo+"Name:"+name);
	}
	
	public static void main(String[] args) {
	display();
	display(10);
	display(15,"Amit");
	
	}

}
