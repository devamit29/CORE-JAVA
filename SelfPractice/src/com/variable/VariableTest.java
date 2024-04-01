package com.variable;

public class VariableTest {
	
	int i=10;
	String s="Amit";
	int k;
	String s1;
	
	public void m1() {
		int j=20;
		String n="Amar";
		
		int i=30;
		String s="Vishal";
		
		int j1;
		String n1;
		
		System.out.println(j);//20
		System.out.println(n);//Amar
		System.out.println(i);//30
		System.out.println(s);//Vishal
		
		VariableTest v1=new VariableTest();
		System.out.println(v1.i);//10
		System.out.println(v1.s);//Amit
		System.out.println(v1.k);//0
		System.out.println(v1.s1);//null
	}
	
	
	public static void main(String[] args) {
		System.out.println("---Global Variable calling----");
		VariableTest v=new VariableTest();
		System.out.println(v.i);//10
		System.out.println(v.s);//Amit
		System.out.println(v.k);//0
		System.out.println(v.s1);//null
		System.out.println("---Local Variable calling---");
		v.m1();
	}
}
