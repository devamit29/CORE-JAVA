package com.studentmgtsystem;

public class College {
	
	public Student[] addStudentDetails() {
		Student s=new Student();
		s.id=201;
		s.name="Amit";
		s.address="Odisha";
		
		Student s1=new Student();
		s1.id=202;
		s1.name="Amar";
		s1.address="Solapur";
		
		Student s2=new Student();
		s2.id=203;
		s2.name="Akshya";
		s2.address="Ahemadnagar";
		
		Student[] studentArray= {s,s1,s2};//id name address
		return studentArray;
	}

}
