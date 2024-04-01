package com.polymorphism;

public class Child extends Parent {
	@Override
	public void m1() {
		System.out.println("Child method");
	}
	@Override
	public void m2(Parent i) {
		System.out.println("Overrided m2 in child");
	}
	@Override
	public Parent m3() {
		System.out.println("overrided m3 in child");
		Child c=new Child();
		return c;
	}
	@Override
	void m4() {
		System.out.println("overrided m4 in child");
	}
	private void m5() {
		System.out.println("parent private method");
	}
	public static void m6() {
		System.out.println("child static method");
	}
	public static void main(String[] args) {
		System.out.println("PARENT CLASS OBJECT");
		Parent p=new Parent();
		p.m1();//Parent method
		p.m2(p);//Parent m2 method
		p.m3();//Parent m3 method
		p.m4();//Parent m4 method
		//p.m5();
		p.m6();//parent static method
		System.out.println("-----");
		System.out.println("mix parent child class object");
		Parent p1=new Child();
		p1.m1();//Child method
		p1.m2(p1);//Overrided m2 in child
		p1.m3();//Overrided m3 in child
		p1.m4();//Overrided m4 in child
		p1.m6();//parent static method
		System.out.println("----");
		System.out.println("Child Class Object");
		Child c=new Child();
		c.m1();//Child method
		c.m2(c);//overrided m2 in child
		c.m3();//overrided m3 in child
		c.m4();//overrided m4 in child
		c.m6();//child static method
		
		
	
	}
}