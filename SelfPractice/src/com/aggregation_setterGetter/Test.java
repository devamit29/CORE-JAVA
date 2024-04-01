package com.aggregation_setterGetter;

public class Test {
	
	public static void main(String[] args) {
		Address adr=new Address();
		adr.setLadr("BBSR");
		adr.setPadr("BGH");
		adr.setPincode(751015);
		
		Address adr2=new Address();
		adr2.setLadr("Solapur");
		adr2.setPadr("Pune");
		adr2.setPincode(404143);
		
		Student s1=new Student();
		s1.setSid(11);
		s1.setSname("Amit");
		s1.setAddress(adr);
		
		Student s2=new Student();
		s2.setSid(12);
		s2.setSname("Amar");
		s2.setAddress(adr2);
		
		System.out.println(s1.getSid()+" "+s1.getSname()+" "+s1.getAddress().getLadr()+" "+s1.getAddress().getPadr()+" "+s1.getAddress().getPincode());
		System.out.println(s2.getSid()+" "+s2.getSname()+" "+s2.getAddress().getLadr()+" "+s2.getAddress().getPadr()+" "+s2.getAddress().getPincode());
	}

}
