package com.java8;

public class Test {

	public static void main(String[] args) {
		int x = 50; int y=30;
		MyInterface m1 = (int c,int j) -> x * y;
		int multiplication = m1.calculation(x,y);
		System.out.println(multiplication);

		m1.m1();
		MyInterface.m3();

		MyInterface m2 = (int c,int k) -> x + y;
		int addition = m2.calculation(x,y);
		System.out.println(addition);

		m2.m1();
		MyInterface.m3();
	}

}
