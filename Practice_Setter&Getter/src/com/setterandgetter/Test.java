package com.setterandgetter;

public class Test {
     
	public static void main(String[] args) {
		Student s=new Student();
		s.setSid(101);
		System.out.println(s.getSid());
	 
		s.setName("Bajarang");
		System.out.println(s.getName());
		
		s.setAddress("Bargarh");
		System.out.println(s.getAddress());
		
		s.setMobile(9862722174l);
		System.out.println(s.getMobile());
		
		s.setGrade('A');
		System.out.println(s.getAddress());
		
		s.setPerc(78.55);
		System.out.println(s.getPerc());
		
		
		Employee e=new Employee();
		e.setEid(100);
		System.out.println(e.getEid());
		
		e.setAddress("BBSR");
		System.out.println(e.getAddress());
		
		e.setSalary(7000.00);
		System.out.println(e.getSalary());
		
		
	}
		
		
		
	} 
