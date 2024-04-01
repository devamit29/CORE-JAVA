package comparableandcomparatorinterfacemultichain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		Employee e=new Employee(201,"Amit",30, 70000.00,"BBSR");
		Employee e1=new Employee(504,"Amar",25, 50000.00,"Solapur");
		Employee e2=new Employee(100,"Akshya",32 , 75000.00, "Ahemadnagar");
		Employee e3=new Employee(105,"Subhrajit",24 , 58000.00,"Berhampur");
		Employee e4=new Employee(250,"Vishal",28 , 60000.00,"Pune");
		
		List<Employee>listOfEmployees=new ArrayList<>();
		listOfEmployees.add(e);
		listOfEmployees.add(e1);
		listOfEmployees.add(e2);
		listOfEmployees.add(e3);
		listOfEmployees.add(e4);
		
		System.out.println("----before sorting----");
		for (Employee employee : listOfEmployees) {
		System.out.println(employee.eid+" "+employee.ename+" "+employee.age+" "+employee.salary+" "+employee.address);
			
		}
		
		Collections.sort(listOfEmployees, new EmployeeChainedComparator());
		System.out.println("---after sorting----");
		for (Employee employee : listOfEmployees) {
		System.out.println(employee.eid+" "+employee.ename+" "+employee.age+" "+employee.salary+" "+employee.address);
		}

	}

}
