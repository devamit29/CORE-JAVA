package com.abstractions2;

public class TestMain {
	
	public static void main(String[] args) {
		//we can't create object of Vehicle because its abstract class
		//Vehicle v =new Vehicle();
		
		/* we can't create object if car is abstract
		 Vehicle v=new Car();
		 v.breakingSystem();
		 v.playMusic();
		 */
		
		Car c=new Tata();
		c.breakingSystem();
		c.airCondition();
		c.playMusic();
		
		System.out.println(c.numOfWheels);
		
		Vehicle v=new Tata();
		v.breakingSystem();
		v.playMusic();
		 
	}

}
