package com.superandthiskeyword;

public class Q extends P{
	Q(){
		this("abc",90,80);
		System.out.println(444);
	}
   Q(boolean b, float f){
	   System.out.println(777);
   }
   Q(String s,int k,int j){
	   this(true,67.123f);
	   System.out.println(333);
   }
   public static void main(String[] args) {
	  Q q=new Q();
}
}
