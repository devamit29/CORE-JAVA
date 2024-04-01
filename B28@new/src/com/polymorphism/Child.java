package com.polymorphism;

public class Child extends Parent {

	@Override
	public void m1() {
		System.out.println("overrided m1 in child");
	}

@Override
public void m2(int i) {
	super.m2(i);
	
}
	@Override
	public int m3() {
		return 30;
	}

	@Override
	public Parent m4() {
		Child c = new Child();
		return c;
	}

	@Override
	public void m5() {
		System.out.println("overrided m5 in child");
	}

	@Override
	protected void m6() {
		System.out.println("overrided m6 in child");
	}

	@Override
	void m7() {
		System.out.println("overrided m7 in child");
	}

	private void m8() {
		System.out.println("overrided m8 in child");
	}// private method we can't override because the scope

	public static void m9() {
		System.out.println("child static method");
	}// static method can't override because the scope is within the class

	public static void main(String[] args) {
		Parent p2 = new Parent();
		// only parent class
		// Parent p=new Child();
		// p.m9();
		Parent.m9();
		Child.m9();

		System.out.println("---Child class method---");
		Child c = new Child();
		c.m1();
		c.m2(10);
		c.m3();
		c.m4();
		c.m5();
		c.m6();
		c.m7();
		c.m8();
		c.m9();
	}
}
