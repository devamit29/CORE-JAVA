package com.accessmodifier1;

import com.accessmodifier.SameClassTestMain;

public class NoParentChildOutsidePackageTest {
 public static void main(String[] args) {
	System.out.println("By using Parent Object--main started");
	 SameClassTestMain test=new SameClassTestMain();
	 //System.out.println(test.id_private);
	// System.out.println(test.name_default);
	 System.out.println(test.address_protected);
	 System.out.println(test.mobileNo_public);
	 System.out.println("By using Parent Object--main Completed");
	 
	 
}
}
