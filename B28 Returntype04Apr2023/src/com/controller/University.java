package com.controller;
 
 import com.model.*;
 import com.service.*;
 
public class University {
        public static void main(String[] args) {
			College college=new College();
			Student std=college.addStudentDetails();
			
			System.out.println(std.id+" "+std.name+" "+std.address);
		}
}
