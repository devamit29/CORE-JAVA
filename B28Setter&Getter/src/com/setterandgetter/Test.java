package com.setterandgetter;

public class Test {
	public static void main(String[] args) {
		Student s = new Student();
		s.setSid(25);
		s.setName("Amit");
		s.setAddress("Odisha");
		s.setMobile(9777134136l);
		s.setGrade('A');
		s.setPerc(92.97);

		System.out.println(s.getSid());
		System.out.println(s.getName());
		System.out.println(s.getAddress());
		System.out.println(s.getMobile());
		System.out.println(s.getGrade());
		System.out.println(s.getPerc());
	}

}
