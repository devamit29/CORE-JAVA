package com.Interface;

import java.io.Serializable;
import java.io.SerializablePermission;

public class Desktop implements Computer,Laptop{
	String size="Large";
	@Override
	public void Hardware() {
		System.out.println("Contains CPU,RAM,Montitor...");
		
	}
	
	@Override
	public void Software() {
		int Types=3;
		System.out.println("Types Of Software="+Types);
		
	}
	@Override
	public void chargeable() {
		System.out.println("Charging time of Laptop is 4hrs");
		
	}
	public static void main(String[] args) {
		System.out.println("---Computer---");
		Computer c=new Desktop();
		System.out.println(c.typesOfComp);
		c.Hardware();
		c.Software();
		
		System.out.println("---Laptop---");
		Laptop L=new Desktop();//Laptop
		System.out.println(L.size);
		
		System.out.println("--Implemented Class--");
		Desktop d=new Desktop();
		System.out.println(d.typesOfComp);
		d.Hardware();
		d.Software();
		System.out.println(d.size);
		d.chargeable();
		
		
		
		
		
	}
}
