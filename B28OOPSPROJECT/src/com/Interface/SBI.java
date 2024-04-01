package com.Interface;

public class SBI implements RBI,RBI_New{
	
	@Override
	public void createAccount() {
	System.out.println("Account opening started");
	System.out.println("Account opening completed");
		
	}
	
	@Override
	public void checkBalance() {
		int balance=20000;
		System.out.println("Account balance is:"+balance);
		
	}
	@Override
	public void activateUPIPayment() {
		System.out.println("PhonePay");
	}
	
	public static void main(String[] args) {
		RBI rbi=new SBI();
		rbi.createAccount();
		rbi.checkBalance();
		System.out.println("rateOfInterest is:"+RBI.rateOfInterest);
		
		System.out.println("-----");
		RBI_New rbi2=new SBI();
		rbi2.activateUPIPayment();
		System.out.println("rateOfInterest is:"+rbi2.rateOfInterest);
				
				
		
	}

}
