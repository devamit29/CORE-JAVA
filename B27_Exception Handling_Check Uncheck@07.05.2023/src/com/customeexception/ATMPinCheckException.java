package com.customeexception;

public class ATMPinCheckException extends Exception{

	
	public ATMPincheckException(String error_message)
	{
		super(error_message);
	}
}
