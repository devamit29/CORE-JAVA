package com.returntype;

public class ReturnTypeExample {
	public void m1() {
		System.out.println("--m1 method of ReturnTypeExample class---");
	}

	public int m2() {
		return 10;
	}

	public String m3() {
		return "Anuja";
	}

	public char m4() {
		return 'K';
	}

	public boolean m5() {
		return true;
	}

	public float m6() {
		return 10.123f;
	}

	public Employee addEmployeeDetails() {

		Employee e = new Employee();
		e.eid = 10;
		e.ename = "Amol";
		e.address = "Pune";
		return e;
	}

	public Student addStudentDetails() {
		Student s = new Student();
		s.rollNo = 201;
		s.name = "abc";
		return s;
	}

	public static void main(String[] args) {
		System.out.println("main method");
		ReturnTypeExample t = new ReturnTypeExample();
		t.m1();
		int i = t.m2();
		System.out.println(i);
		String s = t.m3();
		System.out.println(s);
		char ch = t.m4();
		System.out.println(ch);
		boolean b = t.m5();
		System.out.println(b);
		float f = t.m6();
		System.out.println(f);

		Employee e2 = t.addEmployeeDetails();
		System.out.println(e2.eid + " " + e2.ename + " " + e2.address);

		Student s2 = t.addStudentDetails();
		System.out.println(s2.rollNo + " " + s2.name);

	}
}
