package com.superandthiskeyword;

public class ThisTestMain {
	int id=10;//global
	static int id1=20;//global
	
	public void m1() {
		System.out.println("m1 method called");
		//non static---non static
		int id=30;//local
		System.out.println(this.id);
		System.out.println(id);
	}
	public static void main(String[] args) {
		System.out.println("main method started...");
		//static--non static-->object
		ThisTestMain test=new ThisTestMain();
		System.out.println(test.id);
		//static--static
		System.out.println(id1);//static--static-->>dosen't required object
		System.out.println(ThisTestMain.id1);//classname.idname//static--static-->>Standard method
		System.out.println("main method completed...");
		
	
	}

}
