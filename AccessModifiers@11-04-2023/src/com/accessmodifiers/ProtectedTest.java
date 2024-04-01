package com.accessmodifiers;

public class ProtectedTest {
	
	protected int id=10;
	
	protected void m1()
	{
		System.out.println("m1 protected method of Protected Test class");
	}
	
	public static void main(String[] args) {
		ProtectedTest t= new ProtectedTest();
		System.out.println(t.id);
		t.m1();
	}


}
