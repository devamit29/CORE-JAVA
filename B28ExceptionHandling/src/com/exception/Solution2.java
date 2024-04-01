package com.exception;

public class Solution2 {
	public static void main(String[] args) {
		System.out.println("this statement will be executed ");
		try {
			String s=args[0];
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Now , this statement will also be executed ");
	}

}
