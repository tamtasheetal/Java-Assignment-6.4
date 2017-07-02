package ExceptionHandling;

public class BankATMException extends Exception   
{
	public String toString()   
{
 return ("Generating BankATMException because either the balance is less than 10000 or withdrawl amount is greater than balance available.");
				
}
	
}     

