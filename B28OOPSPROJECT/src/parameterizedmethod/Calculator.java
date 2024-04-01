package parameterizedmethod;

public class Calculator {
	public int addition(int i,int j) {
		int add=i+j;
		return add;
	}
	public int substractions(int k,int m) {
		int sub=k-m;
		return sub;
	}
	public int multiplications(int i,int j) {
		int multi=i*j;
		return multi;
	}
	public int divison(int p,int q) {
		int div=p/q;
		return div;
	}
	public static void main(String[] args) {
		Calculator c=new Calculator();
		int additions=c.addition(10,20);
		System.out.println("Additions of two nos is:"+additions);
		
		int substractions=c.substractions(100,10);
		System.out.println("Substractions two no is:"+substractions);
		
		int multi=c.multiplications(2, 6);
		System.out.println(multi);
		
		int div=c.divison(12, 3);
	}

}
