package com.accessmodifier;

public class SameClassTestMain {
	private int id_private=10;
	protected String name_default="Abc";
	public String address_protected="Pune";
	public long mobileNo_public=7008959963l;
	
	
	public void m1() {
		System.out.println("m1 method with public scope..");
	}
	public static void main(String[] args) {
		System.out.println("main started..");
		SameClassTestMain test=new SameClassTestMain();
		System.out.println(test.id_private);
		System.out.println(test.name_default);
		System.out.println(test.address_protected);
		System.out.println(test.mobileNo_public);
		System.out.println("main Completed");
	}

}
