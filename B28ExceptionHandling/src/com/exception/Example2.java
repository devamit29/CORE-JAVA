package com.exception;

public class Example2 {
	public static void main(String[] args) {
		System.out.println("this statement will be executed ");
		String s=args[0];
		System.out.println("value of s is :"+s);//ArrayIndexOutOfBoundsException
		System.out.println("this statement will not be executed ");
		//Resolve:run as>Arguments>10 20(any integer/string/values)>then run 
	}

}
