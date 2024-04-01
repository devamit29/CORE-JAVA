package com.exception2;

public class A {
	public static int m1() {
		try {
			int i=10;
			return 10;
			
		}catch (Exception e) {
			return 20;
		}
		finally {
			return 30;
		}
	}
	public static void main(String[] args) {
		System.out.println(m1());
	}

}
