package com.practice;

public class Variable {
	
	int i=10;
	String s="Amit";
	
	int j;
	
	static int k=25;
	
	void m1(){
		int i=13;
		System.out.println(i);
		
		
	}
	
	public static void main(String[] args) {
		
		Variable v=new Variable();
		System.out.println(v.i);
		System.out.println(v.s);
		System.out.println(v.j);
		//System.out.println(v.k);
		System.out.println(Variable.k);
		
		v.m1();
		
		
	
	}


}
