package com.inheritance;

public class Vehicle {
      int noOfWheels=10;
      
      protected void moveForward() {
    	  System.out.println("1111");
      }
      public void moveBackward() {
    	  int speed=10;
    	  System.out.println("Vehicle is moving in backward dirction..."+speed);
    	  
      }
      
      public static void main(String[] args) {
		System.out.println("Move forward from vehicle");
	}
}
