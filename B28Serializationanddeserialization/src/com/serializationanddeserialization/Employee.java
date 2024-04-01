package com.serializationanddeserialization;

import java.io.Serializable;

public class Employee implements Serializable{
	int eid;
	String ename;
	transient String address;//null
	public Employee(int eid, String ename, String address) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.address = address;
	}
	
	

}
