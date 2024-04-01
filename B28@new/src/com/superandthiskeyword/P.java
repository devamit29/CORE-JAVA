package com.superandthiskeyword;

public class P {
	P(){
		this(10.123,77,'g');
		System.out.println(666);
	}
    P(double d, int j,char c){
    	System.out.println(222);
    }
    P(int j,boolean b){
    	this();
    	System.out.println(999);
    }
}
