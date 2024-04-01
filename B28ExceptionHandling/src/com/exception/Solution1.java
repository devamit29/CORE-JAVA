package com.exception;

public class Solution1 {
	public static void main(String[] args) {
		System.out.println("This statement will be executed!!!");
		try {
			System.out.println("--Inside try block--");
			Integer i=new Integer("abc");
			System.out.println("---try block---");
			System.out.println("value of i :"+i);
			
		} catch (Exception e) {
			e.printStackTrace();//without this command the exception is not visible/not print in output
			
		}
		System.out.println("Now, this statement will also be executed!!!");
		//normal terminate
	}

}
