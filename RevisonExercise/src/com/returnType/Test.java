package com.returnType;

public class Test {

	public void m1() {
		System.out.println("---m1 method of Test Class---");
	}

	public int m2() {
		return 10;
	}

	public long m3() {
		return 9861733174l;
	}

	public String m4() {
		return "Amit";
	}

	public boolean m5() {
		return true;
	}

	public float m6() {
		return 12.3f;
	}

	public double m7() {
		return 11.23d;
	}

	public char m8() {
		return 'A';
	}
	public Employee addEmployeeDetails() {
		Employee e=new Employee();
		e.eid=101;
		e.name="Vishal";
		e.address="Pune";
		
		return e;
		
	}

	public static void main(String[] args) {
		Test t = new Test();
		t.m1();

		int i = t.m2();
		System.out.println(i);

		long l = t.m3();
		System.out.println(l);

		String s = t.m4();
		System.out.println(s);

		boolean b = t.m5();
		System.out.println(b);

		float ft = t.m6();
		System.out.println(ft);

		double dl = t.m7();
		System.out.println(dl);

		char c = t.m8();
		System.out.println(c);
		
		Employee employee=t.addEmployeeDetails();
		System.out.println(employee.eid+" "+employee.name+" "+employee.address);

	}

}
