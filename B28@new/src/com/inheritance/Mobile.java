package com.inheritance;

public class Mobile {
	String version="Android";
	
	protected void Calling() {
		System.out.println("101");
	}
	
	public void TextMessaging() {
		int text=1234;
		System.out.println("Users can send the Text.."+text);
	}

}
