package com.aggregation;

public class Student {
	int sid;
	String sname;
	Batch b;//entity reference
	
	public Student(int sid, String sname, Batch b) {
		this.sid = sid;
		this.sname = sname;
		this.b = b;
	}

}
