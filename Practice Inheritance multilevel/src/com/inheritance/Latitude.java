package com.inheritance;

public class Latitude extends Dell {
    String modelName="E7440";
    
    public void modelPrice() {
    	System.out.println("Processor is very fast");
    }
    public static void main(String[] args) {
		Laptop l=new Laptop();
		System.out.println(l.Lp);
		l.type();
		
		Dell d=new Dell();
		System.out.println(d.name);
		d.accessories();
		System.out.println(d.Lp);
		d.type();
		
		Latitude lt=new Latitude();
		System.out.println(lt.modelName);
		lt.modelPrice();
		lt.type();
		lt.accessories();
		System.out.println(lt.Lp);
		System.out.println(lt.name);
		
	}
}
