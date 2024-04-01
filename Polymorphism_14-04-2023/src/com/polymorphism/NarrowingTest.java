package com.polymorphism;

public class NarrowingTest {
  public static void m1(Object ob) {
	  System.out.println("---object class---");
}
  public static void m1(int i) {
	  System.out.println("--integer class--");
  }
  public static void m1(String s) {
	  System.out.println("--string class--");
	
}

  public static void main(String[] args) {
	m1(0);
}
}
