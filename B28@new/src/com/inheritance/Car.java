package com.inheritance;

public class Car extends Vehicle {
	int noOfWheels = 5;

	public void playMusic() {
		System.out.println("Car Music system started...");
	}

	@Override
	protected void moveForward() {
		System.out.println("2222");

	}

	public static void main(String[] args) {
		System.out.println("----Child Object----");
		Car c = new Car();
		System.out.println(c.noOfWheels);
		c.moveForward();
		c.moveBackward();
		c.playMusic();
		
		System.out.println("---Parent Object---");
		Vehicle v=new Vehicle();
		System.out.println(v.noOfWheels);
		v.moveForward();
		v.moveBackward();
		
		System.out.println("---Parent Child Mix---");
		Vehicle v1=new Car();
		v1.moveForward();
		v1.moveBackward();
		System.out.println(v1.noOfWheels);
		

	}

}
