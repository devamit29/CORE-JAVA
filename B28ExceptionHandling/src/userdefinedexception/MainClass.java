package userdefinedexception;

import java.util.Scanner;

public class MainClass {
	
	public static void atmPinCheck()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your atm pin");
		String atmPin=sc.next();
		if(atmPin.equals("1234"))
		{
			System.out.println("txn success..");
		}else {
			System.out.println("Entered invalid pin,Please enter valid pin for txn");
			
		}
		sc.close();
	}
	public static void main(String[] args) {
		
		try {
			atmPinCheck();
		} catch (ATMPinCheckException e) {
			e.printStackTrace();
			
		}
		
	}

}
