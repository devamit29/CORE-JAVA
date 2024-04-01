package com.returntype;

public class Test {
   public void m1() {
	   System.out.println("m1 method of test class");
   }
   public int m2()
   {
	   return 10;
   }
   public String m3()
   {
	   return "abc";
   }
   public boolean m4() 
   {
	  return true;
   }
   public float m5()
   {
	   return 12.34f;
   }
   public char m6()
   {
	   return 'H';
   }
 public static void main(String[] args) {
	 Test test=new Test();
	 test.m1();
	 int i=test.m2();
	 System.out.println(i);
	 String s=test.m3();
	 System.out.println(s);
	 boolean flag=test.m4();
	 System.out.println(flag);
	 float f=test.m5();
	 System.out.println(f);
	 char c=test.m6();
	 System.out.println(c);
	 
   }
}
