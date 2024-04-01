package com.inheritance;

public class MainClass {
	public P m5() {
		P p=new P();
		Q q=new Q();
		R r=new R();
		//return p;
		//return q;
		return r;
	}
	public static void main(String[] args) {
		MainClass t=new MainClass();
		P p=t.m5();
		System.out.println(p.x);
		p.m1();
		System.out.println("---Q class---");
		
		Q q=(Q)t.m5();
		System.out.println(q.x);
		System.out.println(q.y);
		q.m1();
		q.m2();
		
		System.out.println("---R class---");
		R r=(R)t.m5();
		System.out.println(r.x);
		System.out.println(r.y);
		System.out.println(r.z);
		r.m1();
		r.m2();
		r.m3();
	}

}
