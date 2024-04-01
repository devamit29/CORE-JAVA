package com.abstractions;

public class A extends AbstractClass{
	//Parent class : AbstractClass
	//Child class : A
	@Override
	public void m1() {
		System.out.println("m1 implemented method");
		
	}
	
	public void m3() {
		System.out.println("m3 method of child class");
	}
	
	public static void main(String[] args) {
		//AbstractClass ab=new AbstractClass();// can't create direct object
	
	//parent child class object
	AbstractClass ab=new A();
	ab.m1();
	ab.m2();
	//ab.m3();
	
	//child class object
	A a=new A();
	a.m1();
	a.m2();
	a.m3();
	}

}
