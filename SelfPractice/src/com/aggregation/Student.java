package com.aggregation;

public class Student {
	
	String sname;
	int sid;
	Address address;//entity reference
	
	public Student(String sname,int sid,Address address) {
		this.sname=sname;
		this.sid=sid;
		this.address=address;
	}

}
