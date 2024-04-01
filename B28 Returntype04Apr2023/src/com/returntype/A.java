package com.returntype;


public class A {
          int x;
          int y=10;
     public A m1() {
    	 A a1=new A();
    		 a1.x=20;
    		 a1.y=50;
    		 return a1;
     }
     public static void main(String[] args) {
		A a=new A();
		System.out.println(a.x);
		System.out.println(a.y);
		
		
		A a1=a.m1();
		System.out.println(a1.x);
		System.out.println(a1.y);
	
    	 }
     }

