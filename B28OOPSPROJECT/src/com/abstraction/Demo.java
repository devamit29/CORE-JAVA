package com.abstraction;

public class Demo implements I7{
	public static void main(String[] args) {
		System.out.println(I7.x);
		System.out.println(x);
		System.out.println(Demo.x);
		
		I7 i7=new Demo();
		System.out.println(i7.x);
		
		Demo d=new Demo();
		System.out.println(d.x);
	}

}
