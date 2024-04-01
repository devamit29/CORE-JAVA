package com.abstractions;

public class A extends AbstractClass{
	//parent class : AbstractClass
	//Child class : A
	
	@Override
	public void m1() {
		System.out.println("m1 implemented method");
	}
	public static void main(String[] args) {
		//AbstractClass a=new AbstractClass();we can't create object
	
		//parent child class
		AbstractClass ab=new A();
		ab.m1();
		ab.m2();
	}

}
