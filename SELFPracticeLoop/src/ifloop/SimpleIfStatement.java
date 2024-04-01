package ifloop;

public class SimpleIfStatement {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		//simple if statement
	 /*  if (a+b>25) {
		   System.out.println("a+b is greater than 25");
		
	}*/
		//if else statement
		/*if(a+b<25) {
			System.out.println("a+b is less than 25");
		}else {
			System.out.println("a+b is greater than 25");
		}*/
		
		//if else if ladder
		if (a+b<25) {
			System.out.println("a+b is less than 25");
			
		} else if(a+b==25) {
			
			System.out.println("a+b is equal to 25");

		}else {
			System.out.println("a+b is greater than 25");
			
		}
	}

}
