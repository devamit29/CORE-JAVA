package com.inheritance;


public class SubClass2 extends SubClass1{
   String m="Exponent";

   public void m3() {
	   System.out.println("SubClass2 method");
	   
   }
   public static void main(String[] args) {
	SuperClass s=new SuperClass();
	System.out.println(s.i);
	System.out.println(s.j);
     s.m1();
     
     SubClass1 s1=new SubClass1();
     System.out.println(s1.i);
     System.out.println(s1.j);
     System.out.println(s1.k);
     s1.m1();
     s1.m2();
     
     
     SubClass2 s2=new SubClass2();
     System.out.println(s2.i);
     System.out.println(s2.j);
     System.out.println(s2.k);
     System.out.println(s2.m);
     s2.m1();
     s2.m2();
     s2.m3();
     
   
   }
}
