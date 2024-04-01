package com.objectandclass;

public class Rectangle {
	int length;
	int breadth;
	void insert(int l,int b) {
		length=l;
		breadth=b;
	}
	void calculateArea() {
		System.out.println(length*breadth);
	}
	public static void main(String[] args) {
		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle();
		r1.insert(15,10);
		r2.insert(25,25 );
		r1.calculateArea();
		r2.calculateArea();
		
	}

}
