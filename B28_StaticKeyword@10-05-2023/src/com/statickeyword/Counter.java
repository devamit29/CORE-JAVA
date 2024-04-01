package com.statickeyword;

public class Counter {
	static int i = 0;

	public Counter() {
		i++;
		System.out.println(i);
	}

	public static void main(String[] args) {
		Counter counter = new Counter();
		Counter counter2 = new Counter();
		Counter counter3 = new Counter();

	}

}
