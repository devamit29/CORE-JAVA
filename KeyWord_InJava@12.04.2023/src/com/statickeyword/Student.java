package com.statickeyword;

public class Student {
	
	//10000 collegeName-DY Patil
	int rollNo;
	String name;
	static String collegeName="DYP";
	
	static{
		System.out.println("Static block of Student class");
	}
	public void m1()//non static method
	{
		System.out.println(rollNo+" "+name);
		System.out.println(Student.collegeName);
	}
	public static void m2()
	{
		System.out.println("static m2 method");
		Student s=new Student();
		System.out.println(s.rollNo+" "+s.name);
	}
	
	
	public static void main(String[] args) {
		Student s=new Student();
		s.rollNo=20;
		s.name="abc";
		System.out.println(s.rollNo+" "+s.name+" "+collegeName);
	     s.collegeName="PCCOE";
		Student s2=new Student();
		s2.rollNo=21;
		s2.name="pqr";
		
		System.out.println(s2.rollNo+" "+s2.name+" "+collegeName);
	
	}

}
