package com.string;

public final class Student {      //class final
	 private final int id=10;     //variable final

	public int getId() {          //getter method
		return id;
	}
	 public final void m1()             //method final
	 {
		 System.out.println("method");
	 }
	 public static void main(String[] args) {
		Student s=new Student();
		System.out.println(s.id);
		s.m1();
		System.out.println(s.getId());
	}

}

/*
//immutable class consider ruels:
    Rule 1: final--> class
    Rule 2: variable final:constant
    Rule 3:getter method
    Rule 4:method final
    */