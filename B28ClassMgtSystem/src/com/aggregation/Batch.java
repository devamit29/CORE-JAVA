package com.aggregation;

public class Batch {
	int bid;
	String bname;
	Faculty f;//entity reference
	
	
	public Batch(int bid, String bname, Faculty f) {
		this.bid = bid;
		this.bname = bname;
		this.f = f;
	}

}
