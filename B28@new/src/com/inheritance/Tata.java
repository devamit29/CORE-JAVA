package com.inheritance;

public class Tata extends Car{
	int numOfAirBags=4;
	int noOfWheels=4;
	
	@Override
	public void playMusic() {
      System.out.println("TATA---PlayMusic");
	}
	@Override
	protected void moveForward() {
     System.out.println("3333");
     super.moveForward();
	}
	
    
	public static void main(String[] args) {
		Vehicle v1=new Car();
		v1.moveBackward();
		v1.moveForward();
		
		System.out.println("----Start---");
		Car c1=new Tata();
		System.out.println(c1.noOfWheels);
		c1.moveForward();
		c1.moveBackward();
		c1.playMusic();
		System.out.println("---END----");
		System.out.println("Tata car started...");
		
		Tata t=new Tata();
		t.noOfWheels=5;
		t.noOfWheels=4;
		
		System.out.println("n(Wheels)="+t.noOfWheels);
		System.out.println("Number Of Air bags"+t.numOfAirBags);
		t.moveForward();
		t.moveBackward();
		t.playMusic();
		
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
