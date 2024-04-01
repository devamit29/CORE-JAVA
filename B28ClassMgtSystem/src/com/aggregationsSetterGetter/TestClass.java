package com.aggregationsSetterGetter;

public class TestClass {
	
	public static void main(String[] args) {
		Course c=new Course();
		c.setCid(5001);
		c.setCname("Software Testing");
		
		Faculty f=new Faculty();
		f.setFid(52);
		f.setFname("Nilesh Sir");
		f.setC(c);
		
		Batch b=new Batch();
		b.setBid(28);
		b.setBname("JAVA");
		b.setF(f);
		
		Student s=new Student();
		s.setSid(101);
		s.setSname("Amit");
		s.setB(b);
		
		System.out.println(f.getC().getCid()+" "+f.getC().getCname());
		System.out.println(f.getFid()+" "+f.getFname()+" "+f.getC().getCid()+" "+f.getC().getCname());
		System.out.println(s.getSid()+" "+s.getB().getF().getC().getCid()+" "+s.getB().getF().getC().getCname());
		
	}

}


