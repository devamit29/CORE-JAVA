package com.superandthis;

public class B extends A{
  B(){
	  this(10);
	  System.out.println("child default constructor");
  }
  B(int i)
  {
	  this("abc",10.123);
	  System.out.println("single parameter const");
  }
  B(String s, double d)
  {
	  super(true,'H',"abc");
	  System.out.println("double parameter const");
  }
  public static void main(String[]args) {
	  B b=new B();
  }
}
