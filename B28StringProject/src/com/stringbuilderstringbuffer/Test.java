package com.stringbuilderstringbuffer;

public class Test {
	public static void main(String[] args) {

		String s = "Test";
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb);
		sb.append("Guys");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}
}
