package com.exception;

public class Example3 {
	public static void main(String[] args) {
		System.out.println("this statement will be executed ");
		try {

			int i = 10 / 0;
			System.out.println("value of i is :" + i);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("this statement will be executed ");

	}

}
