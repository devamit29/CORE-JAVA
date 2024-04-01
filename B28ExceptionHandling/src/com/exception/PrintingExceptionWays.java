package com.exception;

public class PrintingExceptionWays {
	public static void main(String[] args) {
		System.out.println("main method");
		try {
			System.out.println("try block");
			int i=10 / 0;
			System.out.println(i);
		} catch (Exception e) {
			//e.printStackTrace();
			//System.out.println(e.getMessage());//description of exception
			System.out.println(e);//name & description of exception
		}
	}

}
