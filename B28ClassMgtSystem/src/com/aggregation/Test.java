package com.aggregation;

public class Test {
	
	public static void main(String[] args) {
		Course c1=new Course(101,"JAVA");
		System.out.println(c1.cid+" "+c1.cname);
		Faculty f1=new Faculty(10001,"Nilesh Sir",c1);
		System.out.println(f1.fid+" "+f1.fname+" "+f1.c.cid+" "+f1.c.cname);
		Batch b1=new Batch(123,"B28",f1);
		System.out.println(b1.bid+" "+b1.bname+" "+b1.f.fid+" "+b1.f.fname+" "+b1.f.c.cid+" "+b1.f.c.cname);
		Student s1=new Student(001,"Amit",b1);
		System.out.println(s1.sid+" "+s1.sname+" "+s1.b.bid+" "+s1.b.bname+" "+s1.b.f.fid+" "+s1.b.f.fname+" "+s1.b.f.c.cid+" "+s1.b.f.c.cname);
	}

}
