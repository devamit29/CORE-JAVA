package com.inheritance;

public class Tata extends Vehicle {

	public void moveBackward() {
		System.out.println("move backward from Tata");
	}

	public static void main(String[] args) {
		Tata t = new Tata();
		System.out.println(t.noOfAirbags);
		t.moveBackward();
		t.moveFarward();

	}
}
