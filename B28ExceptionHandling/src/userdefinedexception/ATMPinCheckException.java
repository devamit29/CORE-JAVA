package userdefinedexception;

public class ATMPinCheckException extends RuntimeException{//checkedException
	
	public ATMPinCheckException(String error_message)
	{
		super(error_message);
		
	}

}
