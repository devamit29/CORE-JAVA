package com.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsKeywordExample {
	//file output.txt
	//read
	
	//Amit
	public static void readTextFile()
		throws FileNotFoundException,IOException,ArithmeticException,ArrayIndexOutOfBoundsException {
			File file=new File("output.txt");//FileNotFoundException
			FileInputStream in=new FileInputStream(file);
			System.out.println(in.available());
			System.out.println(in.read());
			//xyz
		}
	//Amar
	public static void main(String[] args) {
		System.out.println("---main method---");
		try {
			readTextFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("---exit from main method---");
	}
		
	

}
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
