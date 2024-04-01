package com.inheritance;

public class Dell extends Laptop{
	int priceOfDell=50000;
	
	public void TypesOfDell() {
		int types=8;
		System.out.println("Types of Dell="+types);
	}
	public void Processor() {
		String types="Dualcore";
		System.out.println(types);
	}
	public void sizeOfRAM() {
		int size=16;
		System.out.println("Size of RAM="+size);
	}
	public static void main(String[] args) {
		Dell d=new Dell();
		System.out.println("Price Of Dell="+d.priceOfDell);
		d.TypesOfDell();
		d.Processor();
		d.sizeOfRAM();
		
		System.out.println("---Parent Class---");
		Laptop L=new Laptop();
		System.out.println(L.LaptopCompany);
		System.out.println(L.nameOfCompany);
		L.TypesOfLaptop();
		
		System.out.println("---Parent Child mix--");
		Laptop L1=new Dell();
		L1.TypesOfLaptop();
		
	}

}
