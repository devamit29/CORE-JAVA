package com.inheritance;

public class Son extends Father {
	String e="Lav";
	public void m3() {
		System.out.println("m3 method call");
		System.out.println("Elder son of Ram");
	}
	public static void main(String[] args) {
		System.out.println("Start class of GrandFather");
		
		
		System.out.println("Start class of Son");
		Son p=new Son();
		System.out.println(p.e);
		p.m3();
		System.out.println(p.d);
		p.m2();
		System.out.println(p.c);
		p.display();
		
	    

	}

}
