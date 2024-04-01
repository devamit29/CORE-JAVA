package com.datatypes;

public class ThirdClass {
	 byte b= 120;
	   short s=32000;
	   int i=2147483600;
	   long m=9861720301L;
	   float x=191.12745f;
	   double y=879.789;
	   boolean flag=true;
	   char c='o';
	   
	   String name="Kishan";
	  public void m1() {
		   byte marks=127;
		   short totalMarks=32767;
		   int regdNo=12345;
		   long mobileNo=7008959963L;
		   float rupees=321.723f;
		   double litre=45.67;
		   boolean flag=false;
		   char c='k';
		   String name ="Kanhaiya";
		   System.out.println("marks="+marks);
		   System.out.println("totalMarks="+totalMarks);
		   System.out.println("regdNo="+regdNo);
		   System.out.println("mobileNo="+mobileNo);
		   System.out.println("rupees="+rupees);
		   System.out.println("litre="+litre);
		   System.out.println("flag="+flag);
		   System.out.println("c="+c);
		   System.out.println("name="+name);
		}

	public static void main(String[] args) {
	    System.out.println("---Data Types Program---");
	    System.out.println("main method call");
	    ThirdClass f=new ThirdClass();
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
