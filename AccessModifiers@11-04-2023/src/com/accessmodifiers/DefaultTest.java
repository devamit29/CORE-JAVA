package com.accessmodifiers;

public class DefaultTest {
       int id=10;
       DefaultTest(){
    	   
       }
       void m2()
       {
    	   System.out.println("default m2 method of DefaultTest");
       }
       public static void main(String[] args) {
		   DefaultTest d=new DefaultTest();
		   System.out.println(d.id);
		   d.m2();
		   
	}
}
