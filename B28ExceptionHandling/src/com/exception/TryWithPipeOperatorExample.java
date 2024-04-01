package com.exception;

public class TryWithPipeOperatorExample {
	public static void main(String[] args) {
		try {
			System.out.println("inside try block");
			String s = args[1];// ArrayIndexOutBoundException
			System.out.println("value of s is :" + s);// "40"
			int i = Integer.parseInt(s);
			System.out.println("value of i :" + i);
			int c = 10 / i;// arithmeticException
			System.out.println("value of c :" + c);
			String str = null;
			System.out.println(str.length());// nullpointerexcetion

		} catch (ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e) {
           e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
