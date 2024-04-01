package com.returnTypes;

public class ReturnTypeTestMain {

	public static void main(String[] args) {
		System.out.println("main method started..");

		ReturnTypeTestMain rtm = new ReturnTypeTestMain();

		rtm.m1();

		int roll = rtm.getRollNumber();

		String name = rtm.getName();

		float per = rtm.getPercentage();

		char div = rtm.getDivision();
		System.out.println(" ROllNo :" + roll + "  , Name: " + name + " , Div :" + div + " & Percentage " + per);

		Student s = rtm.get1StudentDetails();
		int r = s.rollNo;
		String n = s.name;

		System.out.println("Student 1, " + r + " Name: " + s.name + " Per: " + s.per + "  Div: " + s.div);

		Student s1 = rtm.get2StudentDetails();
		System.out.println("Student 2 , " + s1.rollNo + " Name: " + s1.name + " Per: " + s1.per + "  Div: " + s1.div);

		Pen p = rtm.getPendetails();
		System.out.println(p.color + " " + p.company + "  " + p.price);

		rtm.m1();

		ReturnTypeTestMain rajendra = new ReturnTypeTestMain();
		AllStudent as = rajendra.getAllStudentDetails();
		//Student s3 = as.s1;
		//Student s4 = as.s2;
		System.out.println(
				"Student 3rd  , " + as.s1.rollNo + " Name: " + as.s1.name + " Per: " + as.s1.per + "  Div: " + as.s1.div);
		System.out
				.println("Student 4th  , " + as.s2.rollNo + " Name: " + as.s2.name + " Per: " + as.s2.per + "  Div: " + as.s2.div);

		
		PenPouch pp = rtm.getPenPouchDetails();
		System.out.println("1st Pen details : "+ pp.p1.company+ "  "+ pp.p1.color+ "  "+ pp.p1.price);
		System.out.println("2nd Pen details : "+pp.p2.company+ "  "+ pp.p2.color+ "  "+ pp.p2.price);
		System.out.println("main method Completed..");
	}
	
	public PenPouch getPenPouchDetails(){
		PenPouch pp = new PenPouch();
		pp.p1.company = "Renold";
		pp.p1.color = "Blue";
		pp.p1.price = 10;
		
		pp.p2.company = "Cello";
		pp.p2.color = "red";
		pp.p2.price = 20;
		
		PenPouch pp2 = new PenPouch();
		
		return pp;
		
	}

	public AllStudent getAllStudentDetails() {
		AllStudent as = new AllStudent();
		as.s1.rollNo = 21;
		as.s1.div = 'B';
		as.s1.name = "Abc3";

		as.s2.rollNo = 22;
		as.s2.name = "Abc4";
		as.s2.per = 80.50f;
		as.s2.div = 'C';
		return as;
	}

	// penpouch -- pen -- property(color, price)

	// void -- return type --> void + data type (primitive or non primitive)
	// m1 -- method name --> anything (no space-- folllow camel case)
	public void m1() {

		System.out.println("m1 method called...");
		int a = 100;
	}

	public Student get2StudentDetails() {
		Student s = new Student();// default -- default values
		System.out.println(" " + s.rollNo);//
		s.rollNo = 11;
		s.name = "Abc1";
		s.per = 78.90f;
		s.div = 'A';
		return s;
	}

	public Student get1StudentDetails() {
		Student s = new Student();// default -- default values
		s.rollNo = 10;
		s.name = "Abc";
		s.per = 75.90f;
		s.div = 'A';

		return s;
	}//

	public Pen getPendetails() {
		Pen p = new Pen();
		p.company = "cello";
		p.color = "Red";
		p.price = 10;
		return p;
	}

	// x =10;
	// x = 30;

	public float getPercentage() {
		float f = 18.90f;
		return f;

	}

	public String getName() {
		String s = "Amit";
		return s;
	}

	public int getRollNumber() {
		System.out.println("get roll Number called...");
		int s = 40;
		return s;// 40
	}

	public char getDivision() {
		char c = 'A';
		return c;
	}

}