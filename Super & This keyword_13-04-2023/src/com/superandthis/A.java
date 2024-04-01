package com.superandthis;

public class A {
	A(){
	super();
	System.out.println("parent default const");
	}
	A(boolean flag,char c,String s)
	{
		this ();
		System.out.println("three parameter parent");
	}
	

}
