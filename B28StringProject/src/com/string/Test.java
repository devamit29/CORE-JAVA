package com.string;

//stringbuilderstringbuffer

public class Test {
	
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Hello");
		System.out.println(sb);//Hello
		sb.append(" Guys");
		System.out.println(sb);//Hello Guys
		sb.reverse();
		System.out.println(sb);//syuG olleH
		
	}

}
