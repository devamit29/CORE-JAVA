package com.serialanddeserial;

import java.io.Serializable;

public class Student implements Serializable{
	int sid;
	String sname;
	Address address;//HAS-A
	

	public Student(int sid, String sname, Address address) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.address = address;
	}
	

}
