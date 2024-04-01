package com.covariantreturntype;

public class Logic {
	public Q testMethod() {
		P p=new P();
		Q q=new Q();
		R r=new R();
		
		return q;
	}
	public static void main(String[] args) {
		Logic logic=new Logic();
		P p=logic.testMethod();
		System.out.println(p.x);
		p.m1();
		
		System.out.println("---Q class---");
		Q q=(Q)logic.testMethod();
		System.out.println(q.x);
		System.out.println(q.y);
		q.m1();
		q.m2();
		
		
		System.out.println("---R---");
		R r=new R();
		System.out.println(r.x);
		System.out.println(r.y);
		System.out.println(r.z);
	}

}
