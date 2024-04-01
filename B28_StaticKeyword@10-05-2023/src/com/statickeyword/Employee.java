package com.statickeyword;

public class Employee {
	int x = 10;
	String name = "abc";
	static String companyName = "Infosys";

	public static void m1() {
		System.out.println("---static method---");
		Employee e = new Employee();
		System.out.println(e.x);
		System.out.println(e.name);

	}

	public void m2() {
		System.out.println("--non static method--");
		System.out.println(x);
		System.out.println(name);
		System.out.println(companyName);
	}

	public static void main(String[] args) {
		m1();
		Employee employee = new Employee();
		employee.m2();
	}
}
