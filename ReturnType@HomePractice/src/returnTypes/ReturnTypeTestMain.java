package returnTypes;

public class ReturnTypeTestMain {

	public static void main(String[] args) {
		System.out.println("main method started..");

		ReturnTypeTestMain rtm = new ReturnTypeTestMain();

		rtm.m1();

		int roll = rtm.getRollNumber();

		String name = rtm.getName();

		float per = rtm.getPercentage();

		char div = rtm.getDivision();

		System.out.println("RollNo:" + roll + ",Name:" + name + ",Div:" + div + "& Percentage" + per);

		Student s = rtm.getStudentDetails();

		System.out.println("Student," + s.rollNo + "Name:" + s.name + "per:" + s.per + "Div:" + s.div);

		Pen p = rtm.getPenDetails();
		System.out.println(p.color + " " + p.company + " " + p.price);
		System.out.println("main method completed...");
	}

	public Student getStudentDetails() {
		Student s = new Student();
		System.out.println("before RollNo" + s.rollNo);
		s.rollNo = 10;
		System.out.println("After RollNo" + s.rollNo);
		s.name = "Abc";
		s.per = 75.90f;
		s.div = 'A';
		s.rollNo = 50;

		Student s1 = new Student();
		s.rollNo = 100;
		s1.rollNo = 200;
		return s1;
	}

	public Pen getPenDetails() {
		Pen p = new Pen();
		p.company = "Cello";
		p.color = "Red";
		p.price = 10;
		return p;
	}

	public void m1() {
		System.out.println("m1 method called...");

		int a = 100;
	}

	public float getPercentage() {
		float f = 78.90f;
		return f;
	}

	public String getName() {
		String s = "Amit";
		return s;
	}

	public int getRollNumber() {
		System.out.println("get roll Number called...");
		int s = 40;
		return s;
	}

	public char getDivision() {
		char c = 'A';
		return c;

	}

}
