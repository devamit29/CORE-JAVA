package com.arrayexmple;

public class Test {
	public static void main(String[] args) {
		// 10 20 30 40 50
		// integer array
		int[] arrayOfints = new int[5];
		arrayOfints[0] = 10;
		arrayOfints[1] = 20;
		arrayOfints[2] = 30;
		arrayOfints[3] = 40;
		arrayOfints[4] = 50;

		// 5 elements 500
		System.out.println(arrayOfints[3]);// 40
		System.out.println(arrayOfints[4]);// 50
		System.out.println(arrayOfints[1]);// 20

		// ieterate using for loop
		System.out.println("----for loop----");
		for (int i = 0; i < arrayOfints.length; i++) {
			System.out.println(arrayOfints[i]);
			// 10 20 30 40 50
		}

	}

}
