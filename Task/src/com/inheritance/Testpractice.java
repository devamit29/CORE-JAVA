package com.inheritance;

public class Testpractice {
	
	Testpractice(){
		System.out.println("default constructor");
		int i=10;
		System.out.println(i);
	}
	static int j=10;
	int b=35;
	
	void m1() {
		System.out.println("m1 method call");
		int k=20;
		System.out.println(j+" "+k+" "+b);
		++j;   ++k;
		
	}
	
	public static void main(String[] args) {
		Testpractice tp=new Testpractice();
		tp.m1();
		tp.m1();
		tp.m1();
		
	}

}
