package com.setterandgetter;

public class Employee {
	private int eid;
	private String address;
	private double salary;
	
	public void setEid(int employeeID) {
		eid=employeeID;
	}
	public int getEid() {
		return eid;
	}
	
	public void setAddress(String empAddress) {
		address=empAddress;
	}
	public String getAddress() {
		return address;
	}
	public void setSalary(double empSalary) {
		salary=empSalary;
	}
	public double getSalary() {
		return salary;
	}

}
