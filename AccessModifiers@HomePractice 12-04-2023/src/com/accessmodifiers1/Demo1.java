package com.accessmodifiers1;
import com.accessmodifiers.Test;

public class Demo1 extends Test {
	
	 public static void main(String[] args) {
		 System.out.println("By using Parent Object--main stareted");
	 
			Test t=new Test();
			System.out.println(t.i);
			System.out.println(t.cname);
			t.publicTest();
			t.protectedTest();
			t.defaultTest();
			t.privateTest();

}
}