package com.exception;

import java.io.IOException;

public class Child extends Parent{
	public Child() throws Exception {//same or parent
		super();
	}
	@Override
	public void m1() throws IOException {//same or child
		System.out.println("----overrided m1 method  in child class---");
		
	}

}
