package com.superandthis;

public class Child1 extends Parent1{
       int j=20;
       public void m2() {
    	   System.out.println("child class method");
    	   System.out.println(super.id);
    	   super.m1();
       }
       public void m3() {
    	   System.out.println("child class m3 method");
    	   System.out.println(this.j);
    	   this.m2();
       }
	public static void main(String[] args) {
        Child1 c=new Child1();
        c.m2();
        c.m3();
	}

}
