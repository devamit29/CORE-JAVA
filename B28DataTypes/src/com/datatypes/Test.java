package com.datatypes;


public class Test {
	byte b=127;
	short s=133;
	int i=33000;
	long l=99999999;
	float f=123.127f;
	double d=10.45;
	boolean flag=true;
	char c='H';
	String name="abc";
	
	byte b1;
	public void m1()
	{
		byte b=127;
		
		
		short s=133;
		int i=33000;
		long l=99999999;
		float f=123.127f;
		double d=10.45;
		boolean flag=true;
		char c='H';
		String name="abc";
		System.out.println(b);
	}
		public static void main(String[] args) {
	    System.out.println("--data type program--");
	      Test test=new Test();
		System.out.println(test.b);
		System.out.println(test.b1);
		System.out.println(test.s);
	    System.out.println(test.i);
	    System.out.println(test.l);
	    System.out.println(test.f);
	    System.out.println(test.d);
	    System.out.println(test.flag);
	    System.out.println(test.c);
	    System.out.println(test.name);
	    System.out.println("---method calling---");
	    test.m1();
	    
		}

	
}
