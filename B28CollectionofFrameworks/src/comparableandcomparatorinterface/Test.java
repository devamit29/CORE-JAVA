package comparableandcomparatorinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		Employee e=new Employee(101, "Vikas","Pune");
		Employee e1=new Employee(107, "Santosh","Mumbai");
		Employee e2=new Employee(102, "Tushar","Nashik");
		Employee e3=new Employee(118, "Vijay","Beed");
		Employee e4=new Employee(115, "Ajay","Pcmc");
		
		List<Employee>listOfEmployees=new  ArrayList<>();
		listOfEmployees.add(e);
		listOfEmployees.add(e1);
		listOfEmployees.add(e2);
		listOfEmployees.add(e3);
		listOfEmployees.add(e4);
		
		System.out.println("---before sorting----");
		for(Employee employee :listOfEmployees) {
		    System.out.println(employee.eid+" "+employee.ename+" "+employee.address);
		}
		
			System.out.println("---sort by using employee id---");
			Collections.sort(listOfEmployees,new SortByEmployeeUsingId());
			for (Employee employee : listOfEmployees) {
				System.out.println(employee.eid+" "+employee.ename+" "+employee.address);
			}
			System.out.println("---sort employee using employee names----");
			Collections.sort(listOfEmployees,new SortByEmployeeUsingName());
			for (Employee employee : listOfEmployees) {
				System.out.println(employee.eid+" "+employee.ename+" "+employee.address);
			}
			
			System.out.println("----sort employee using employee address----");
			Collections.sort(listOfEmployees,new SortByEmployeeUsingAddress());
			for (Employee employee : listOfEmployees) {
				System.out.println(employee.eid+" "+employee.ename+" "+employee.address);
			}
			
		}
	}


