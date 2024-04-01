package com.string;

public class StringTestMain {

	public static void main(String[] args) {
		// literal
		String s1 = "abc";
		String s2 = "abc";
		String s3 = "Abc";
		System.out.println(s1);// abc
		System.out.println(s1 == s2);// true//== used for reference comparison//store in same memory
		System.out.println(s1 == s3);// false//store in different memory location
		System.out.println("by using equals s1==s3 : " + (s1.equals(s3)));// false
		System.out.println("by using equals s1==s3 : " + (s1.equalsIgnoreCase(s3)));// true
		// String constant Point(SCP)--single value store-single memory
		// location(s1,s2);another memory(s3)-unique
		// Heap--s4="pqr",s5="pqr"--duplicate

		// new keyword
		String s4 = new String("pqr");
		String s5 = new String("pqr");
		System.out.println(s4 == s5);// false

		String s6 = "xyz";
		String s7 = new String("xyz");
		System.out.println(s6 == s7);// false//different memory allocated//equal operator
		System.out.println("by using equals method :" + s6.equals(s7));// true

		// 1.concat
		System.out.println(s6 + "pqr");// xyzpqr
		s6.concat(s7);
		System.out.println(s6);// xyz
		s6 = s6.concat(s7);
		System.out.println(s6);// xyzxyz
		s6 = s6.concat(s7).concat(s1).concat(s2);
		System.out.println(s6);// xyzxyzxyzabcabc
		System.out.println("latest value in s6 :" + s6);

		// 2.length
		System.out.println(s1.length());// 3//"abc"
		System.out.println(s6.length());// 15//"xyzxyzxyzabcabc"

		// 3.Contains
		System.out.println(s1.contains("a"));// true
		System.out.println(s1.contains("p"));// false
		System.out.println("latest value in s6 :" + s6);// "xyzxyzxyzabcabc"
		System.out.println(s6.contains("acb"));// false

		// 4.Replace
		String string = "Hi welcRme tR String class";
		System.out.println(string.replace('R', 'o'));// Hi Welcome to String class//replace old to new
		System.out.println("Before replace:" + string);
		System.out.println(string.replace('o', 'R'));// replace new to old letter replace
		System.out.println(string.replace("Hi", "Hello"));// word replace
		// replaceFirst, replaceAll
		System.out.println(string.replaceFirst("Hi", "Hey"));
		String string1 = "Hi welcome to Amit's World";
		System.out.println(string.replaceAll(string, string1));// sentence replacement

		// 5.substring
		System.out.println(string1.substring(1));// we need to pass starting index//i welcome to Amit's world
		System.out.println(string1.substring(3, 10));// 3-beginindex,10-endindex

		// 6.split
		System.out.println("Split method for : Hi_welcome_to_Split_method");
		String s10 = "Hi_welcome_to_Split_method";
		String[] array_s10 = s10.split("_");
		for (String string2 : array_s10) {
			System.out.println(string2);
		}
		String s11 = "Hello Guys ,Welcome to JAVA";
		String[] array_s11 = s11.split("to");
		for (String string3 : array_s11) {
			System.out.println(string3);
		}

		// 7.format
		String name = "Amit";
		int rollNo = 50;
		String address = "Odisha";
		System.out.println("Hi," + name + " your roll number is:" + rollNo + " & Address: " + address);
		String s12 = String.format("Hi,%s your roll number is:%s & Address:%s", name, rollNo, address);
		System.out.println("By Using format method");
		System.out.println(s12);

		// 8.equals &
		System.out.println("---equals method---");
		String s13 = "Amit";
		String s14 = "Amit";
		String s15 = "Amar";
		System.out.println(s13.equals(s15));// false
		System.out.println(s14.equals(s13));// true
		System.out.println(s13.equals(s14));// true

		// 9.endsWith()
		System.out.println("---By using endsWith method---");
		string.endsWith("pqr");// boolean
		System.out.println(string.endsWith("abc"));// false
		System.out.println(string.endsWith("xyz"));// false
		System.out.println(string.endsWith("class"));// true
		System.out.println(s11.endsWith("to"));// false
		System.out.println(s11.endsWith("JAVA"));// true

	}

}
