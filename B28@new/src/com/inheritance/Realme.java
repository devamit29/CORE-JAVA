package com.inheritance;

public class Realme extends Samsung{
String version="Android 5g";
	
	public void playVideo() {
		System.out.println("Play Realme Video");
	}
	
	@Override
		public void TextMessaging() {
		int text=5678;
		System.out.println("Users can send the Text.."+text);
		}
	public void fastCharging() {
		System.out.println("Charging is very fast");
	}
	public static void main(String[] args) {
		System.out.println("--Super Parent Object--");
		Mobile m=new Mobile();
		System.out.println(m.version);//Parent class
		m.Calling();//Parent class
		m.TextMessaging();//Parent class
		
		System.out.println("--Parent Object--");
		Samsung s=new Samsung();
		System.out.println(s.version);//child class
		s.Calling();//Parent class
		s.TextMessaging();//Child class_Overrided
		s.playVideo();//Child class
		
		System.out.println("--Child Object--");
		Realme r=new Realme();
		System.out.println(r.version);//child class
		r.Calling();//Super Parent class
		r.TextMessaging();//Child class_Overrided
		r.playVideo();//Child class
		r.fastCharging();
		
		System.out.println("--Mix Object--");
		Mobile m1=new Samsung();
		System.out.println(m1.version);//Parent class
		//m1.playVideo();//Child class can't called
		m1.Calling();//Parent class
		m1.TextMessaging();//Child Class_overrided
		
		System.out.println("--Mix Super Parent & Child--");
		Mobile m2=new Realme();
		System.out.println(m2.version);
		m2.Calling();
		m2.TextMessaging();
		//m2.playVideo();
		//m2.fastCharging();
		
		
	}
}
