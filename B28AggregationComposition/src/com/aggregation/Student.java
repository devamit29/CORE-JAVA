package com.aggregation;

public class Student {

	int sid;
	String sname;
	Address address;// entity reference

	public Student(int sid, String sname, Address address) {
		this.sid = sid;
		this.sname = sname;
		this.address = address;
	}

}
