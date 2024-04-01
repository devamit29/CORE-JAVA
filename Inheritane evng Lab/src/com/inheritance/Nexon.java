package com.inheritance;

public class Nexon extends Tata{
	
    public void playMusic() {
    	System.out.println("Play music from Nexon...");
    }
    public static void main(String[] args) {
		Nexon n=new Nexon();
		System.out.println(n.noOfAirbags);
		n.moveFarward();
		n.moveBackward();
		n.playMusic();
	}
}

