package com.exception;

public class InnerTryCatchBlock {
	public static void main(String[] args) {
		System.out.println("----inner try catch block----");
		try {
			System.out.println("---Outer try block----");
			String s="Amit";
			System.out.println(s.length());//NullPointerEception//4
			try {
				System.out.println("---inner try block---");
				Integer i=new Integer("abc");
				System.out.println("value of i is s:"+i);//NumberFormatException
			} catch (ArrayIndexOutOfBoundsException  e) {
				System.out.println("---inner catch block---");
				e.printStackTrace();
			}
		} catch (Exception e) {
			System.out.println("---outer catch block----");
			e.printStackTrace();
		}
	}

}
