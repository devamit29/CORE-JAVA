package com.accessmodifiers;

public class PrivateTest {
	private PrivateTest(){
		
	}
	private int id=10;
	private void m1() {
		System.out.println("private method of PrivateTest class");
	}
	public static void main(String[] args) {
		PrivateTest test=new PrivateTest();
		System.out.println(test.id);
		test.m1();
		
		//System s=new System();
	}

}
