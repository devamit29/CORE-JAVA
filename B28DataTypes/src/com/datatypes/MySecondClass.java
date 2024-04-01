package com.datatypes;

public class MySecondClass {
		   byte b= 120;
		   short s=32000;
		   int i=2147483600;
		   long m=9861720301L;
		   float x=191.12745f;
		   double y=879.789;
		   boolean flag=true;
		   char c='o';
		   
		   String name="Chunu";
		   
		   public void m1() {
			   byte b=127;
			   short s=32767;
			   int i=2147483647;
			   long m=7008959963L;
			   float x=321.723f;
			   double y=45.67;
			   boolean flag=false;
			   char c='k';
			   String name ="Munu";
			   System.out.println("b="+b);
			   System.out.println("s="+s);
			   System.out.println("i="+i);
			   System.out.println("m="+m);
			   System.out.println("x="+x);
			   System.out.println("y="+y);
			   System.out.println("flag="+flag);
			   System.out.println("c="+c);
			   System.out.println("name="+name);
		   }
	public static void main(String[] args) {
		    System.out.println("---Data Types Program---");
		    System.out.println("main method call");
		    MySecondClass f=new MySecondClass();
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



