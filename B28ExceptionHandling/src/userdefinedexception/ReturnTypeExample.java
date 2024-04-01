package userdefinedexception;

public class ReturnTypeExample {
	
	public static int m1() {
		System.out.println("m1 method");
		try {
		System.out.println("Inside try block");
		String s=null;
		System.out.println(s.length());
		return 10;
		} catch (Exception e) {
			System.out.println(e);
			return 20;
		}finally {
			System.out.println("finally block");
			return 30;
		}
	}
	public static void main(String[] args) {
		System.out.println(m1());
		
	}

}
