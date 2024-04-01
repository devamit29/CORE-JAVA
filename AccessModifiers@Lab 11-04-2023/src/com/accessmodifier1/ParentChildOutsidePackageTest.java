package com.accessmodifier1;

import com.accessmodifier.SameClassTestMain;

public class ParentChildOutsidePackageTest extends SameClassTestMain{
		
	public static void main(String[] args) {
		
		System.out.println("By Using Parent Object--main started..");
		
		SameClassTestMain test=new SameClassTestMain();
		//System.out.println(test.id_private);
		//System.out.println(test.name_default);
		System.out.println(test.address_protected);
		System.out.println(test.mobileNo_public);
		System.out.println("By Using Parent Object--main Completed");
		
		System.out.println("Child Object main started..");
		ParentChildOutsidePackageTest test1=new ParentChildOutsidePackageTest();
		
	    //System.out.println(test1.id_private);
	    System.out.println(test1.name_default);
	    System.out.println(test1.address_protected);
	    
	    System.out.println(test1.mobileNo_public);
	    System.out.println("Child Object main Completed..");
	
	}

}
