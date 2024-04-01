package com.exception;

public class TryCatchFinallyBlock {
	public static void main(String[] args) {
		System.out.println("----main method----");
		try {
			System.out.println("----inside try block----");
		    //String str=null;
			String str="abc";
			System.out.println(str.length());
			System.out.println("---try block end---");
			
		} catch(Exception e) {
			System.out.println("---catch block----");
			e.printStackTrace();
		}
		finally {
			//System.exit(0);//forcefully terminate
			System.out.println("---finally block----");
		}
		System.out.println("---exit from main method----");
		
		
	}

}
