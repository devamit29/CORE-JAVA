package com.superandthis;

public class B extends A {
	B(String a){
		this("","");
		System.out.println("Single parameter --B");//2
	}
	
	B(String a,String s){
		//this(a);
		super(10);
		System.out.println("Double Parameter--B");//3
	}
	public static void main(String[] args) {
		B b=new B("");
	
	}
	

}
