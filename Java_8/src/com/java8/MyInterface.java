package com.java8;

@FunctionalInterface
public interface MyInterface {
	
	int calculation(int x,int y);
	
	default void m1() {
		System.out.println("Default method in functional interface");
	}
	public static void m3() {
		System.out.println("static method means functional");
	}

}
