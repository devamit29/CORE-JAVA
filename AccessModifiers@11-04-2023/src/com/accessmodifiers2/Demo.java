package com.accessmodifiers2;

import com.accessmodifiers.DefaultTest;
import com.accessmodifiers.ProtectedTest;

public class Demo extends ProtectedTest {
	
	public static void main(String[] args) {
		//DefaultTest t=new DefaultTest();
		//System.out.println(t.id);
		//t.m2();
		
		ProtectedTest p=new ProtectedTest();
		//System.out.println(p.id);
		//p.m1();
		
		Demo demo=new Demo();
		System.out.println(demo.id);
		demo.m1();
	}

}
