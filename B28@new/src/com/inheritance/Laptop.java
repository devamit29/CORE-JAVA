package com.inheritance;

public class Laptop {
	int LaptopCompany=5;
	String nameOfCompany="Dell+HP+Lenevo";
	
	public void TypesOfLaptop() {
		int types=7;
		System.out.println("Types of Laptop="+types);
	}
	public void laptopFeatures(){
		
	}
	public static void main(String[] args) {
		System.out.println("---Laptop Details---");
		Laptop L=new Laptop();
		System.out.println(L.LaptopCompany);
		System.out.println("nameOfCompany="+L.nameOfCompany);
		L.TypesOfLaptop();
	}

}
