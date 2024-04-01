package com.exponent.aa;
import com.exponent.bb.*;
import com.exponent.cc.*;
public class Controller {

	public static void main(String[] args) {
	System.out.println("main method started");
      Student s=new Student();
      System.out.println(s.rollNo);
      s.m1();
      
      System.out.println("main method from Employee class");
         Employee e=new Employee();
         System.out.println(e.empId);
         e.m1();
	}

}
