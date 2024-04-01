package com.accessmodifiers;

public class Test {
	public static void main(String[] args) {
		DefaultTest d=new DefaultTest();
		System.out.println(d.id);
		d.m2();
		
		
		ProtectedTest p=new ProtectedTest();
		System.out.println(p.id);
		p.m1();
	}

}
