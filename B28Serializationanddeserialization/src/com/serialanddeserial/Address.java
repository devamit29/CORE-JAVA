package com.serialanddeserial;
import java.io.Serializable;

public class Address implements Serializable{
	int aid;
	String ladr;
	String padr;
	public Address(int aid, String ladr, String padr) {
		super();
		this.aid = aid;
		this.ladr = ladr;
		this.padr = padr;
	}
	

}
