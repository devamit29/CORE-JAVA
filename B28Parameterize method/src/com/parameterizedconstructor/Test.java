package com.parameterizedconstructor;

import com.parameterizedmethod.Employee;

public class Test {
	
	public Test() {
		System.out.println("default const");
	}
	
	public Test(int i) {
		System.out.println("Single parameter const");
		System.out.println(i);
	}
    public Test(String s,double d) {
			System.out.println("double parameter const");
			System.out.println(s+" "+d);
		}
    public Test(boolean flag, char c, String s) {
        System.out.println("three parameter const");
        System.out.println(flag+" "+c+" "+s);
    }
    public Test(Employee employee) {
        System.out.println(employee.eid+" "+employee.ename);
	}

	public static void main(String[] args) {
		
		Test t=new Test();
		Test t1=new Test(10);
		Test t2=new Test("amar",10.123);
		Test t3=new Test(true,'M',"Manoj");
		
		Employee e= new Employee();
		e.eid=201;
		e.ename="hhh";
		
		Test t4=new Test(e);
	}

}
