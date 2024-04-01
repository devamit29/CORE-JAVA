package com.abstraction;

public class Test implements I3 {

	@Override
	public void m1() {
		System.out.println("I1-interface");

	}

	@Override
	public void m2() {
		System.out.println("I2-interface");

	}

	@Override
	public void m3() {
		System.out.println("I3-interface");

	}

	public static void main(String[] args) {
		System.out.println("---I1---");//I1
		I1 i1 = new Test();
		System.out.println(I1.x);
		i1.m1();
		
		System.out.println("---I2---");//I1+I2
		I2 i2 = new Test();
		System.out.println(I2.x);
		i2.m1();
		System.out.println(I2.y);
		i2.m2();
		
		System.out.println("---I3---");//I1+I2+I3
		I3 i3 = new Test();
		System.out.println(I3.x);
		i3.m1();
		System.out.println(I3.y);
		i3.m2();
		System.out.println(I3.z);
		i3.m3();
		
		System.out.println("***Implemented class***");//
		Test test=new Test();
		System.out.println(Test.x);
		test.m1();
		System.out.println(Test.y);
		test.m2();
		System.out.println(Test.z);
		test.m3();
		
	}

}
