package com.inheritance;

public class Son extends Father{
       int sid=50;
       public void m5() {
    	   System.out.println("Son:method");
       }
       
       public static void main(String[] args) {
    	   GrandFather g= new GrandFather();
    	   System.out.println(g.gid);
    	   g.m2();
    	    
    	   Father f=new Father();
    	   System.out.println(f.gid);
    	   f.m4();
    	   System.out.println(f.fid);
    	   
    	   Son s=new Son();
    	   System.out.println(s.gid);
    	   System.out.println(s.fid);
    	   System.out.println(s.sid);
    	   s.m2();
    	   s.m4();
    	   s.m5();
    	   
       }
}
