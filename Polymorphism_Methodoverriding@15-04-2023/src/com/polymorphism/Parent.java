package com.polymorphism;

public class Parent {
	public void m1() {
		System.out.println("Parent method");
	}
	public void m2(Parent i) {
		System.out.println("Parent m2 method");
	}
	public Parent m3() {
		System.out.println("Parent m3 method");
		Parent p=new Parent();
		return p;
	}
	void m4() {
		System.out.println("Parent m4 method");
	}
	private void m5() {
	System.out.println("parent private method");

}
	public static void m6() {
		System.out.println("parent static method");
	}
}
