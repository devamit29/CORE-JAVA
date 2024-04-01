package com.block;

public class Block {
	static {
		System.out.println("1st");
	}
	
	
	static {
		System.out.println("2nd");
	}
		public static void main(String[] args) {
			//Block b=new Block();//static block direct call  without object creation	
		
	}
		static {
			System.out.println("3rd");
		}

}
