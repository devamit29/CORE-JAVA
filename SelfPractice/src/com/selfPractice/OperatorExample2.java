package com.selfPractice;

public class OperatorExample2 {
      public static void main(String[] args) {
		int a=10;
		int b=20;
		
		boolean c=true;
		boolean d=false;
		
		//System.out.println(a++ + ++a);//10+12=22
		//System.out.println(b++ + ++b);//20+22=42
		
		int x=10;
		int y=10;
		
		System.out.println(~x);//-11  (-10-1)
		System.out.println(~~x);//10  (-
		System.out.println(~~~x);//-11
		System.out.println(~y);//-11
		
		System.out.println(!c);//false
		System.out.println(!d);//true
		System.out.println(!!c);//true
		System.out.println(!!!c);//false
		
		
	}
}
