package com.inheritance;

public class B extends A{
	int j=23;
	String k="Amar";
	public void m2()
	{
		System.out.println("m2 method of class B");
		System.out.println("Object Oriented Programming");
	}
	public static void main(String[] args) {
		System.out.println("main method call");
		A a=new A();
		System.out.println(a.i);
		System.out.println(a.s);
		a.m1();
		
		System.out.println("---class B start---");
		B b=new B();
		System.out.println(b.j);
		System.out.println(b.k);
		b.m2();
		b.m1();
		System.out.println(b.i);
		System.out.println(b.s);
		
	}

}
