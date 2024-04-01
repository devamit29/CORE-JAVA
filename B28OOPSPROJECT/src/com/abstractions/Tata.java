package com.abstractions;

public class Tata extends Vehicle {

	@Override
	public void specification() {
		System.out.println("tata specification");
	}

	public static void main(String[] args) {

		Vehicle v = new Tata();
		v.tyre();
		v.specification();

		Vehicle v1 = new MS();
		v1.tyre();
		v1.specification();

		System.out.println("---VW---");
		Vehicle v2 = new VW();
		v2.tyre();
		v2.specification();
	}

}
