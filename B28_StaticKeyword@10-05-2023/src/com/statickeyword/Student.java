package com.statickeyword;

public class Student {
	int id;
	String name;

	static {
		System.out.println("--Static block---");

	}
	static String collegeName = "DYP";

	public static void m1() {
		System.out.println("m1 static method");
	}

	public static void main(String[] args) {
		Student s = new Student();
		s.id = 101;
		s.name = "pqr";

		Student s2 = new Student();
		s2.id = 201;
		s2.name = "xyz";

		System.out.println(s.id + " " + s.name + " " + collegeName);
		s2.collegeName = "PCCOE";

		System.out.println(s2.id + " " + s2.name + " " + Student.collegeName);
		Student.m1();

	}
}
