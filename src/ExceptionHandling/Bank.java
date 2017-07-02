package ExceptionHandling;	
import java.util.*;  
	
public class Bank
{
  public static void main(String[] args)
  {
	System.out.println("Enter the ATM details : ATM Id, Bank name, Loaction, Balance space seperately");
	Scanner sc=new Scanner(System.in);
	
	BankAtm atmDemo = new BankAtm( sc.nextInt(), sc.next(), sc.next(), sc.nextDouble());
//Creating BankATM Class Object and passed the parameters in the Constructor.
			
	atmDemo.deposit(10000.0);       
//Depositing Amount in the ATM.
	try      
{
		atmDemo.withdraw(1500.0);      
//Withdraw Amount from the ATM.
		}
	catch(BankATMException e)       
{
		System.out.println(e);   
}
	atmDemo.displayATMDetails();
	
	try       
{
		atmDemo.withdraw(100.0);     
}
	catch(BankATMException e) 
{
		System.out.println(e);   
		}
			
			
			sc.close();     
		}     
	}     
