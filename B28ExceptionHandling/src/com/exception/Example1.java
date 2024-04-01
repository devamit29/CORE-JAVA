package com.exception;

public class Example1 {
	
	public static void main(String[] args) {
		System.out.println("This statement will be executed!!!");
		Integer i=new Integer("abc");//NumberFormatException
		System.out.println("value of i : "+i);
		System.out.println("This statement will not be executed..");
	}

}
