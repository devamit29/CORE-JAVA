package com.covariantreturntype;

public class Q extends P{
	
	int y=20;
	
	public void m2()
	{
		System.out.println("Q-class method");
	}
	public static void main(String[] args) {
		Q q=new Q();
		System.out.println(q.x);
		q.m1();
		System.out.println(q.y);
		q.m2();
	}

}
