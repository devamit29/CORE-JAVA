package com.exception;

public class MultipleCatchBlock {
	
	
	public static void main(String[] args) {
		 System.out.println("---main method---");
		 try {
			 //jdk 1.6
			 //jdk 1.7 try with pipe operator
			System.out.println("inside try block");
			String s=args[1];//ArrayIndexOutOfBoundException
			System.out.println("value of s is :"+s);//"40"
			int i=Integer.parseInt(s);//string to integer convert//40
			System.out.println("value of i :"+i);
			int c=10/i;//arithmeticException
			System.out.println("value of c :"+c);//0
			String str=null;
			System.out.println(s.length());//nullPointerException
			//rule : subclass class--->>>super class same level class
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundException handle");
			e.printStackTrace();
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException handle");
			e.printStackTrace();
		}catch(NullPointerException e) {
			System.out.println("NullPointerException handle");
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
			
			
		}
	}


