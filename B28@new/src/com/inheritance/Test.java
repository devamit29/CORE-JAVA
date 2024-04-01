package com.inheritance;

public class Test implements I {
	//int x=30;
	//public static final int j=45;
	
	@Override
	public void m1() {
	System.out.println("m1 implemented method");	
	}
	
	@Override
	public void m2() {
	System.out.println("m2 implemented method");	
	}
	
	public static void main(String[] args) {
		//I i=new I();//Direct Object can't create
		
		I i=new Test();//Indirect object create
		i.m1();
		i.m2();
		System.out.println(I.x);
		System.out.println(I.j);
		
		Test t=new Test();
		System.out.println(t.x);
		System.out.println(t.j);
		t.m1();
		t.m2();
	}

}
