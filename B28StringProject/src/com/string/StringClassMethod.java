package com.string;

public class StringClassMethod {
	public static void main(String[] args) {
		// indexOf ,toCharArray(),charAt(),toUppercase(),toLowerCase();
		// trim()
		String str = "  Hi I am Amit  ";
		System.out.println("***toCharArray***");
		char[] charArray = str.toCharArray();
		for (char c : charArray) {
			System.out.println(c);// o/p->str in up to down
		}
		System.out.println(str);
		System.out.println("***trim method***");
		String s = str.trim();
		System.out.println(s);// leftend space & rightend space on sentence are trim.
        
		System.out.println("---convert all letter to Upper case--");
		System.out.println(str.toUpperCase());//HI I AM AMIT
		System.out.println("---convert all letter to Lower case--");
		System.out.println(str.toLowerCase());//hi i am amit
		
		String s5="Java";//constant pool area
		String s3=new String("Java").intern();
		//String s3=new String("Java");//heap area
		String s4=new String("Java");
		System.out.println(s3==s4);//reference//address//false
		System.out.println(s5==s3);//false//in intern method o/p=>true
	}
	

}
