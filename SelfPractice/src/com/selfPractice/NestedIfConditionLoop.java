package com.selfPractice;

public class NestedIfConditionLoop {
	public static void main(String[] args) {
		int x=20;
		int y=30;
		
		if (x+y==40) {
			System.out.println("x+y is equal to 40");
			
			if (x+y>30) {
				System.out.println("x+y is less than 40 ");
			}
		} else {
			System.out.println("x+y is greter than 40");

		}
	}

}
