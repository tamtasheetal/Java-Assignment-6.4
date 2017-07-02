package ExceptionHandling;
public class BankAtm        
{
	int atmId;         
	String bankName;     
	String location;        
	double balance;       
	
	public BankAtm(int atmId, String bankName, String location, double balance)  
	{
		this.atmId = atmId;     
		this.bankName = bankName;
		this.location = location;
		this.balance = balance;
	}
	
	public void withdraw(double amt) throws BankATMException  
	{
		if(balance < 10000.0 || balance < amt)       
		{
			throw new BankATMException();        
		}
		else
		{
			balance = balance - amt;  
			System.out.println("\nYou have Withdrawn "+amt+" Rs. and your Available Balance is "+balance+" Rs.");   
		}
	}
	
	public void deposit(double amt)     
	{
		balance = balance + amt;      
		System.out.println("\nYou have Depositted "+amt+" Rs. and Available Balance is "+balance+" Rs.");     
	}
	
	public void displayATMDetails()           
	{
		System.out.println("\nThe ATM Id is "+atmId);
		System.out.println("The Bank Name of which ATM belongs is "+bankName);
		System.out.println("The Location where ATM is situated is "+location);
		System.out.println("The Available Balance is "+balance);
//Display ATM Details.
	}
	
}    

