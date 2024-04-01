package com.parameterizedmethod;

public class Demo {
     public void m1() {
    	 System.out.println("m1 method of Demo class");
     }
     public void m2(int i) {
    	 System.out.println("Single parameter method");
    	 System.out.println(i);
     }
     public void m3(String s, char c) {
    	 System.out.println("double parameter method");
    	 System.out.println(s+" "+c);
    	  }
     public void m4(double d,boolean b,int i)
     {
    	 System.out.println("m4 method of Demo class");
    	 System.out.println(d+" "+b+" "+i);
     }
     
      public void displayStudentDetails(Student s) {
    	  System.out.println("Display Student Details");
    	  System.out.println(s.rollNo+" "+s.name+" "+s.address);
      }
      
      
      public void displayEmpAndStudentDetails(Employee e,Student s){
    	  System.out.println("Display Employee and Student Details");
    	  System.out.print(e.eid+" "+e.name+"  ");
    	  System.out.println(s.rollNo+" "+s.name+" "+s.address);
      }
      
      public void displaySubjectDetails(Subject sub) {
    	  System.out.println("Display Subject Details");
    	  System.out.println(sub.name+" "+sub.marks);
      }
	public static void main(String[] args) {
            Demo demo=new Demo();
            demo.m1();
            demo.m2(51);
            demo.m3("Amit", 'A');
            demo.m4(11.101, false, 123);
            
            
            Student std=new Student();
            std.rollNo=23;
            std.name="Nikhil";
            std.address="Odisha";
            demo.displayStudentDetails(std);
            
            Employee e=new Employee();
            e.eid=101;
            e.name="Bikranta";
            demo.displayEmpAndStudentDetails(e ,std);
            
            Subject sub=new Subject();
            sub.name="English";
            sub.marks=70;
            demo.displaySubjectDetails(sub);
            
           
	}	

}
