package com.stringbuilderstringbuffer;

public class StringClassMethod {
	public static void main(String[] args) {
		//indexOf,toCharArray(),charAt(),toUppercase,toLowerCase();
		//trim()//intern()
		String str="Hi I am Amit";
		System.out.println(str);
		 String s=str.trim();
		 System.out.println(s);
		 char[] charArray=str.toCharArray();
		 for(char c:charArray) {
			// System.out.println(c);
		 }
		 System.out.println(str.toUpperCase());
		 System.out.println(str.toLowerCase());
		 
		 String s5="JAVA";//constant pool area
		 String s3=new String("JAVA").intern();//heap area
		
		String s4=new String("JAVA");
		System.out.println(s3==s4);//reference//address//false
		System.out.println(s5==s3);//false//true
	}

}
