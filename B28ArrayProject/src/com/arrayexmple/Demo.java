package com.arrayexmple;

public class Demo {
	public static void main(String[] args) {
		double[] arrayOfDoubles = { 10.123, 20.34, 45.67, 89.09 };

		// jdk 1.7 for each loop

		for (double d : arrayOfDoubles) {
			System.out.println(d);
		}
		System.out.println("----char array----");

		char[] arrayOfChar = { 'h', 'j', 'k', 'a' };

		for (char c : arrayOfChar) {
			System.out.println(c);
		}
		System.out.println("---int array---");
		int[] arrayOfints = { 12, 15, 17, 19, 21 };
		for (int i : arrayOfints) {
			System.out.println(i);
		}
		System.out.println("---String array---");
		String[] arrayOfstring = { "Amit", "Amar", "Akshya", "Vishal", "Dhananjay", "Gourav" };
		for (String s : arrayOfstring) {
			System.out.println(s);
		}

	}

}
