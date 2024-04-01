package accessmodifiers2;

import com.accessmodifiers.Test;
public class Demo2 {
	
	public static void main(String[] args) {
	 System.out.println("By using Parent Object--main stareted");
     Test t=new Test();
	 System.out.println(t.publicTest);
	 System.out.println(t.protectedTest);
	 System.out.println(t.defaultTest);
	 System.out.println(t.privateTest);
	}
}
