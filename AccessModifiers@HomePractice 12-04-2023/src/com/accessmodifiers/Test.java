package com.accessmodifiers;

public class Test {
        int i=121;
        String cname="Amit";
        
       public void publicTest() {
        	String name="Srikant";
        	int id=101;
        	long mobNo=9777123134l;
        	System.out.println(name);
        	System.out.println(id);
        	System.out.println(mobNo);
        }
       protected void protectedTest() {
        	String name="Bijay";
        	int id=123;
        	long mobNo=9991341567l;
        	System.out.println(name);
        	System.out.println(id);
        	System.out.println(mobNo);
        }
         void defaultTest() {
        	String name="Nikhil";
        	int id=050;
        	long mobNo=9861722334l;
        	System.out.println(name);
        	System.out.println(id);
        	System.out.println(mobNo);
        }
       private void privateTest() {
        	String name="Papu";
        	int id=80;
        	long mobNo=965874563l;
        	System.out.println(name);
        	System.out.println(id);
        	System.out.println(mobNo);
        }
        public static void main(String[] args) {
			Test t=new Test();
			System.out.println(t.i);
			System.out.println(t.cname);
			t.publicTest();
			t.protectedTest();
			t.defaultTest();
			t.privateTest();
		}
        
      

        
}
