package com.returntype;

public class B {
      int i=100;
      int j=20;
      public B m2() {
    	  B b1=new B();
    	  b1.i=88;
    	  b1.j=77;
    	  int i=10;
    	  int j=20;
    	  System.out.println(i);
    	  System.out.println(b1.i);
    	  B b2=new B();
    	  b2.i=b1.i;
    	  b2.j=j;
    	  return b2;
      }
      public static void main(String[] args) {
		B b=new B();
		System.out.println(b.i);
		System.out.println(b.j);
		B b3=b.m2();
		System.out.println(b3.i);
		System.out.println(b3.j);
		
	}
      }

