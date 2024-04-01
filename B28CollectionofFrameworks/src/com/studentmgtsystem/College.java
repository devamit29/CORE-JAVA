package com.studentmgtsystem;

import java.util.ArrayList;
import java.util.List;

public class College {
	
	public List<Student> addStudentDetails()
	{
		Student s=new Student();
		s.id=201;
		s.name="abc";
		s.address="pune";
		Student s1=new Student();
		s1.id=202;
		s1.name="xyz";
		s1.address="pune";
		Student s2=new Student();
		s2.id=203;
		s2.name="pqr";
		s2.address="pcmc";
		List<Student>studentLists=new ArrayList<Student>();
		studentLists.add(s);
		studentLists.add(s1);
		studentLists.add(s2);
		return studentLists;
		
		
	}

}
