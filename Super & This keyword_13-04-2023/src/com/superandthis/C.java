package com.superandthis;

public class C {
	C(){
		this(true,false);
		System.out.println(333);
	}
	public C(boolean b, boolean c) {
		this("abc",'c',10);
		System.out.println(111);
	}
    public C(String string,char c,int i) {
        this(991);
        System.out.println(888);
    }
    public C( long l) {
    	System.out.println(555);
    }
}
