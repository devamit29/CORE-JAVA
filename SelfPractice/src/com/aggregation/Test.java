package com.aggregation;

public class Test {
	public static void main(String[] args) {
		//BBSR ODISHA 751015
		Address adr=new Address("BBSR","ODISHA",751015);
		Student s1=new Student("Amit",101,adr);
		Student s2=new Student("Subhajit",102,adr);
		
		System.out.println(s1.sname+" "+s1.sid+" "+s1.address.ladr+" "+s1.address.padr+" "+s1.address.pincode);
		System.out.println(s2.sname+" "+s2.sid+" "+s2.address.ladr+" "+s2.address.padr+" "+s2.address.pincode);
	}

}
