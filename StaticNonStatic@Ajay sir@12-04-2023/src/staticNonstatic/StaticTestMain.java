package staticNonstatic;

public class StaticTestMain {

	public static void main(String[] args) {
		StaticTestMain.m1();
	}
	public static void m1() {
		System.out.println("m1 method...");
		StaticTestMain test=new StaticTestMain();
		test.m2();
	}
		public void m2() {
			StaticTestMain.m1();
		}
		//static-->non static-->We need Object
		//non static-->static--->We don't need Object
		//static-->static--->We don't need Object
		//non static-->non static--->We don't need Object
	
}
