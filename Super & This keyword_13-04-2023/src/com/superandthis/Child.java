package com.superandthis;

public class Child extends Parent{
	int j=20;
	public void m2()
	{
		System.out.println("child class method");
		System.out.println(super.id);
		super.m1();
	}
	public static void main(String[] args) {
		Child c=new Child();
		c.m2();
		
	}

}
