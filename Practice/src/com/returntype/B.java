package com.returntype;

public class B {
	int i=120;
	int j=66;
	public B m2() {
		B b1=new B();
		b1.i=79;
		b1.j=81;
		int i=124;
		int j=11;
		System.out.println(i);
		System.out.println(b1.i);
		B b2=new B();
		b2.i=b1.i;
		b2.j=j;
		return b2;
	}

}
