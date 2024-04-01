package com.datatypes;

public class FirstClass {
	
	   byte b= -128;
	   short s=-32768;
	   int i=-2147483648;
	   long m=9777134136L;
	   float x=123.127f;
	   double y=12.34;
	   boolean flag=true;
	   char c='j';
	   
	   String name="Amit";
	   
	   public void m1() {
		   byte b=127;
		   short s=32767;
		   int i=2147483647;
		   long m=7008959963L;
		   float x=321.723f;
		   double y=45.67;
		   boolean flag=false;
		   char c='k';
		   String name ="Nikhil";
		   System.out.println(b);
		   System.out.println(s);
		   System.out.println(i);
		   System.out.println(m);
		   System.out.println(x);
		   System.out.println(y);
		   System.out.println(flag);
		   System.out.println(c);
		   System.out.println(name);
	   }
public static void main(String[] args) {
	    System.out.println("---Data Types Program---");
	    System.out.println("main method call");
	    FirstClass f=new FirstClass();
	    System.out.println(f.b);
	    System.out.println(f.s);
	    System.out.println(f.i);
	    System.out.println(f.m);
	    System.out.println(f.x);
	    System.out.println(f.y);
	    System.out.println(f.flag);
	    System.out.println(f.c);
	    System.out.println(f.name);
	    System.out.println("---m1 method calling---");
	    f.m1();
		  
		   
	   }
	   
	   
	   
	   
	   
	   
	   

}
