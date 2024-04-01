package com.aggregation;

public class MainClass {

	public static void main(String[] args) {
		// Ahmednagar Pune 413201//10
		Address adr = new Address("Ahmednagar", "Pune", "413201");
		Student s1 = new Student(11, "Santosh", adr);
		Student s2 = new Student(12, "Rohit", adr);
		System.out.println(
				s1.sid + " " + s1.sname + " " + s1.address.ladr + " " + s1.address.padr + " " + s1.address.pincode);
		System.out.println(
				s2.sid + " " + s2.sname + " " + s2.address.ladr + " " + s2.address.padr + " " + s2.address.pincode);
		Address adr2 = new Address("Nashik", "Mumbai", "413250");
		Student s3 = new Student(13, "Amit", adr2);
		System.out.println(s3.sid);
		System.out.println(s3.sname);
		System.out.println(s3.address.ladr);
		System.out.println(s3.address.padr);
		System.out.println(s3.address.pincode);
	}

}
