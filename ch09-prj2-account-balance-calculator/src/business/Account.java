package business;
import java.text.NumberFormat;

public class Account implements Depositable, Withdrawable, Balanceable 
{
	double balance;
	NumberFormat currency = NumberFormat.getCurrencyInstance();

	public Account()
	{
		
	}
	
	public Account(double balance)
	{
		this.balance = balance;
	}
	
	public String displayBalance()
	{
		return currency.format(balance);
	}
	
	@Override
	public double getBalance() 
	{
		return balance;
	}
	@Override
	public void setBalance(double amount) 
	{
		balance = amount;
	}
	@Override
	public void withdraw(double amount) 
	{
		balance -= amount;
	}
	@Override
	public void deposit(double amount) 
	{
		balance += amount;
	}

		
}
