package com.superandthiskeyword;

public class D extends C{
	public D() {
		//super();default
		this(10);
		System.out.println("child class const");
	}
	public D(int i)
	{
		//super();//default
		this("abc",true);
		System.out.println("parameter const");
	}
	public D(String s,boolean flag)
	{
		super(10.123,'c');
		System.out.println("double parameter");
	}
	public static void main(String[] args) {
		D d=new D();
	}

}
