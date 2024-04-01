package com.inheritance;

public class Child extends Parent {

	@Override
	public void m1() {
		System.out.println("override m1 method in child class");
	}

	public void m3() {
		System.out.println("m3 method of child class");

	}

	public static void main(String[] args) {
		System.out.println("Parent class object");
		Parent p = new Parent();
		p.m1();
		p.m2();

		System.out.println("Parent child mix");
		Parent p1 = new Child();
		p1.m1();
		p1.m2();

		System.out.println("Child class object");
		Child c = new Child();
		c.m1();
		c.m2();
		c.m3();
	}
}
