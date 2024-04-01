package com.inheritance;

public class Car extends Vehicle{
	public void playMusic() {
		System.out.println("Music system started...");
	}
	public static void main(String[] args) {
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
		
		System.out.println("--Mix Object--");
		Vehicle v1=new Car();
		System.out.println(v.noOfWheels);
		v.moveForward();
		v.moveBackward();
	}

}
