package com.studentmgtsystem;

import java.util.ArrayList;
import java.util.List;

public class College {
  
	public List<Student> addStundentDetails()
	{
		Student s =new Student();
		s.id=201;
		s.name="Ram";
		s.address="Pune";
		
		Student s1 =new Student();
		s1.id=202;
		s1.name="Hari";
		s1.address="Mumbai";
		
		Student s2 =new Student();
		s2.id=203;
		s2.name="Shyam";
		s2.address="Nagpur";
		
		List<Student> listOfStudents=new ArrayList<>();
		listOfStudents.add(s);
		listOfStudents.add(s1);
		listOfStudents.add(s2);
		
		return listOfStudents;
		
		
		
		
	}
}
