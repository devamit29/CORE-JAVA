package com.DataTypes;

public class Test {
	// byte,short,int,long,float,double,boolean char
	// String

	byte b = 127;
	byte b1;
	short s = 32767;
	short s1;
	int i = 2147483647;
	int i1;
	long l = 9223372036854775807l;
	long l1;

	float ft = 102.457892345f;// upto 5 decimal
	float ft1;
	double dl = 120.987654321654321;// upto 14 decimal
	double dl1;

	boolean flag = true;
	boolean flag1;

	char c = 'H';
	char c1;

	String name = "Amit";
	String name1;

	public void m1() {
		byte b = 127;
		byte b1 = 0;
		short s = 32767;
		short s1 = 0;
		int i = 2147483647;
		int i1 = 0;
		long l = 9223372036854775807l;
		long l1 = 0;

		float ft = 102.457892345f;// upto 5 decimal
		float ft1 = 0;
		double dl = 120.987654321654321;// upto 14 decimal
		double dl1 = 0;

		boolean flag = true;
		boolean flag1 = false;

		char c = 'H';
		char c1 = 0;

		String name = "Amit";
		String name1 = null;

		System.out.println(b + " " + "Default value :" + b1);
		System.out.println(s + " " + "Default value :" + s1);
		System.out.println(i + " " + "Default value :" + i1);
		System.out.println(l + " " + "Default value :" + l1);
		System.out.println(ft + " " + "Default value :" + ft1);
		System.out.println(dl + " " + "Default value :" + dl1);
		System.out.println(flag + " " + "Default value :" + flag1);
		System.out.println(c + " " + "Default value :" + c1);
		System.out.println(name + " " + "Default value :" + name1);

	}

	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t.b + "     " + "Default value :" + t.b1);
		System.out.println(t.s + "     " + "Default value :" + t.s1);
		System.out.println(t.i + "     " + "Default value :" + t.i1);
		System.out.println(t.l + "     " + "Default value :" + t.l1);
		System.out.println(t.ft + "    " + "Default value :" + t.ft1);
		System.out.println(t.dl + "    " + "Default value :" + t.dl1);
		System.out.println(t.flag + "   " + "Default value :" + t.flag1);
		System.out.println(t.c + "    " + "Default value :" + t.c1);
		System.out.println(t.name + "    " + "Default value :" + t.name1);

		System.out.println("******m1 method call******");
		t.m1();

	}

}
