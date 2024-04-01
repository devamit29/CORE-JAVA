package com.polymorphism;

public class Parent {
	public void m1() {
		System.out.println("m1 method of parent");
	}
	public void m2(int i) {
		System.out.println("parent m2 method");
	}
	public int m3()
	{
		System.out.println("parent m3 method");
		return 10;
	}
	public Parent m4()
	{
		Parent p=new Parent();
		return p;
				
	}
	public void m5()
	{
		System.out.println("public method");
	}
    protected void m6()
    {
    	System.out.println("protected method");
    }
     void m7() {
    	 System.out.println("default  method");
     }
     private void m8() {
    	 System.out.println("private method");
     }
     public static void m9() {
    	 System.out.println("parent static method");
     }
}
