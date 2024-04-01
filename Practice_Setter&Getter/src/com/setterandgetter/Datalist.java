package com.setterandgetter;

public class Datalist {
	
	public static void main(String[] args) {
		Employee e=new Employee();
		e.setEid(100);
		e.setAddress("BBSR");
		e.setSalary(70000.00);
		
		System.out.println(e.getEid());
		System.out.println(e.getAddress());
		System.out.println(e.getSalary());
		
		
	}

}
