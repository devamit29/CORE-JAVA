package com.abstraction;

public  abstract class Car extends Vehicle{
	int numOfWheels=4;
	/*@Override
	public void breakingSystem() {
		System.out.println("---Disc Break---");
		
	}*/
	public void airCondition() {
		System.out.println("---AC started---");
	}
	
  /* public static void main(String[] args) {
	Car c=new Car();
	c.breakingSystem();
	c.airCondition();
	System.out.println(c.numOfWheels);
	
	
}*/  //we can't create object when class is abstract
}
