package com.superandthiskeyword;

public class B extends A{
     int j=20;
     
     public void m2()
     {
    	 System.out.println("child class m2 method");
    	 System.out.println(super.i);
    	 super.m1();
     }
     public void m3()
     {
    	 System.out.println("m3 method of child class");
    	 System.out.println(this.j);
    	 this.m2();
     }
     public static void main(String[] args) {
		 B b=new B();
		 b.m2();
		 b.m3();
	}
}
