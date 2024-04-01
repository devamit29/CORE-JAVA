package com.superandthis;

public class D extends C{
	D(){
	this(10,10.123);
	System.out.println(555);
}
	D(int i,double d){
		super();
		System.out.println(777);
	}
	D(String s,boolean v,char c){
		this();
		System.out.println(222);
	}
	public static void main(String[] args) {
		D d=new D("abc",false,'F');
	}
}
