package com.aggregation;

public class Faculty {
	int fid;
    String fname;
    Course c;//entity reference
	
    public Faculty(int fid, String fname, Course c) {
		this.fid = fid;
		this.fname = fname;
		this.c = c;
	}
 
}
