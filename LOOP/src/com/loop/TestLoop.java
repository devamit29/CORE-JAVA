package com.loop;

import java.util.Iterator;

public class TestLoop {
	
	public static void main(String[] args) {
		
		//for loop
		/*for (int i = 1; i <=100; i++) {
			System.out.println(i);
			
		}*/
		
		//nested loop
		for (int i = 1; i <=3; i++) {
			
			for (int j = 1; j <=4; j++) {
				System.out.println(i+" "+j);
				
			}
			
		}
		
	}

}
