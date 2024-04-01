package com.setterandgetter;

public class Student {
	private int sid;
	private String name;
	private String address;
	private long mobile;
	private char grade;
	private double perc;

	public void setSid(int studentId) {
		sid = studentId;
	}

	public int getSid() {
		return sid;
	}

	public void setName(String studentName) {
		name = studentName;
	}

	public String getName() {
		return name;
	}

	public void setAddress(String studentAddress) {
		address = studentAddress;
	}

	public String getAddress() {
		return address;
	}

	public void setMobile(long studentMob) {
		mobile = studentMob;
	}

	public long getMobile() {
		return mobile;
	}

	public void setGrade(char studentGrade) {
		grade = studentGrade;
	}

	public char getGrade() {
		return grade;
	}

	public void setPerc(double studentPerc) {
		perc = studentPerc;
	}

	public double getPerc() {
		return perc;
	}

}
