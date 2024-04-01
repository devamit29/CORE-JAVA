package com.string;

public class Demo {
	public static void main(String[] args) {
		String s="Java";//litera//constant pool area
		
		//String s="Test";
		
		System.out.println(s);
		String s1=new String("Java");//new keyword object//heap area
		System.out.println(s1);
		s=s.concat("test");
		System.out.println(s);//Java Test
	}

}
