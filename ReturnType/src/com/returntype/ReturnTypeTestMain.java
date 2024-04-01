package com.returntype;

public class ReturnTypeTestMain {
	
    public static void main(String[] args) {
    System.out.println("main method started");
    ReturnTypeTestMain rtm=new ReturnTypeTestMain();
    rtm.m1();
    int roll=rtm.getRollNumber();
    String name=rtm.getName();
    float per=rtm.getPercentage();
    char div=rtm.getDivision();
    System.out.println("RollNo:"+roll+",Name:"+name+",Div:"+div+" & Percentage"+per);
    System.out.println("main method Completed...");
    }
    public void m1() {
    	System.out.println("m1 method called...");
    	   int a=100;
    	   System.out.println(a);
    }
    	   public float getPercentage() {
    		   float f=78.90f;
    		   return f;
    	   }
    	   public String getName() {
    		   String s="Amit";
    		   return s;
    	   }
    	   public int getRollNumber() {
    		   System.out.println("get roll Number called...");
    		   int s=40;
    		   return s;
    	   }
    	   public char getDivision() {
    		   char c='A';
    		   return c;
    	   }
  
	

	}

