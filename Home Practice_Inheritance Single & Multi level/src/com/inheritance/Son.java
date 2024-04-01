package com.inheritance;

public class Son extends Father{
	String name2="Lav";
	public void m3() {
	System.out.println("Son of Ram");
}
	public static void main(String[] args) {
		Son s=new Son();
		System.out.println(s.name);
		System.out.println(s.name1);
		System.out.println(s.name2);
		s.m1();
		s.m2();
		s.m3();
		
	}
}