package com.inheritance;

public class Tata extends Vehicle{//Multilevel inheritance
	int numOfAirBags=3;
	
	public static void main(String[] args) {
		System.out.println("Tata car started..");
		
		Tata t=new Tata();
		t.noOfWheels=4;
		System.out.println("n(Wheels)="+t.noOfWheels);
		System.out.println("Number of Air bags"+t.numOfAirBags);
		t.moveForward();
		t.moveBackward();
		//t.playMusic();
		
		System.out.println("Tata car Stopped...");
		System.out.println("---Child Object---");
		Car c=new Car();
		System.out.println(c.noOfWheels);
		c.moveForward();
		c.moveBackward();
		c.playMusic();
		
		System.out.println("---Parent Object---");
		Vehicle v=new Vehicle();
		System.out.println(v.noOfWheels);
		v.moveForward();
		v.moveBackward();
	
	}

}
