package com.inheritance;

public class Samsung extends Mobile {
	String version="Android 4g";
	
	public void playVideo() {
		System.out.println("Play Samsung Video");
	}
	
	@Override
	public void TextMessaging() {
		int text=2341;
		System.out.println("Users can send the Text.."+text);
	}
	public static void main(String[] args) {
		System.out.println("--Super Parent Object--");
		Mobile m=new Mobile();
		System.out.println(m.version);//Super Parent class
		m.Calling();//Super Parent class
		m.TextMessaging();//Super Parent class
		
		System.out.println("--Child Object--");
		Samsung s=new Samsung();
		System.out.println(s.version);//child class
		s.Calling();//Super Parent class
		s.TextMessaging();//Super Parent class_Overrided
		s.playVideo();//Parent class
		
		System.out.println("--Mix Object--");
		Mobile m1=new Samsung();
		System.out.println(m1.version);//Super Parent class
		//m1.playVideo();//Parent class can't called
		m1.Calling();//Super Parent class
		m1.TextMessaging();//Parent Class_overrided
		
		
	}

}
