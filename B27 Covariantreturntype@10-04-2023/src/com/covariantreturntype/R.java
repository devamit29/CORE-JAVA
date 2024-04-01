package com.covariantreturntype;

public class R extends Q{
	 int z=30;
	 public void m3()
	 {
		 System.out.println("R-class method");
	 }
	 public static void main(String[] args) {
		R r=new R();
		System.out.println(r.x);
		r.m1();
		System.out.println(r.y);
		r.m2();
		System.out.println(r.z);
		r.m3();
	}

}
