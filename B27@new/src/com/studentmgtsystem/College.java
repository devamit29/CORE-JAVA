package com.studentmgtsystem;

import java.util.ArrayList;
import java.util.List;

public class College {
	
	public List<Student> addStudentDetails()
	{
		Student s=new Student();
		s.id=201;
		s.name="abc";
		s.address="Pune";
		
		Student s1=new Student();
		s1.id=202;
		s1.name="pqr";
		s1.address="Nagpur";
		
		Student s2=new Student();
		s2.id=203;
		s2.name="xyz";
		s2.address="Mumbai";
		
		List<Student>listOfStudents=new ArrayList<>();
		listOfStudents.add(s);
		listOfStudents.add(s1);
		listOfStudents.add(s2);
		
		return listOfStudents;
	}

}
