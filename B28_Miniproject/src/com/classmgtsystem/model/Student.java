package com.classmgtsystem.model;


public class Student {
	protected int sid;
	protected String sname;
	protected Batch b;
	
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Batch getB() {
		return b;
	}
	public void setB(Batch b) {
		this.b = b;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", b=" + b + "]";
	}
	
	

}
