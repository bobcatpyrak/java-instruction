package ui;
import business.*;
import ui.console.Console;

public class AccountBalanceApp 
{

	public static void main(String[] args) 
	{
		System.out.println("Welcome to the Account application\n");
		
		CheckingAccount c = new CheckingAccount(1000.00, 1.00);
		SavingsAccount s = new SavingsAccount(1000.00, 0.01);
		System.out.println("Starting Balances");
		System.out.println("Checking: " + c.displayBalance());
		System.out.println("Savings: " + s.displayBalance());
		System.out.println("\nEnter the transactions for the month");
		
		boolean loop = true;
		while(loop)
		{
			String choiceA = Console.getChoiceString("\nWithdrawal or deposit? (w/d): ", "w", "d");
			String choiceB = Console.getChoiceString("Checking or savings? (c/s): ", "c", "s");
			double amount = Console.getDouble("Amount?: ");
			
			if(choiceB.equalsIgnoreCase("c"))
			{
				if(choiceA.equalsIgnoreCase("w"))
					c.withdraw(amount);
				else
					c.deposit(amount);
				
			}	
			else
			{
				if(choiceA.equalsIgnoreCase("w"))
					s.withdraw(amount);
				else
					s.deposit(amount);
			}
			
			if(Console.getChoiceString("\nContinue? (y/n): ", "y", "n").equalsIgnoreCase("n"))
				loop = false;
		}
		
		System.out.println("\nMonthly Payments and Fees");
		System.out.println("Checking fee:\t\t  " + c.chargeMonthlyFee());
		System.out.println("Savings interest payment: " + s.addMonthlyInterestPayment());
		
		System.out.println("\nFinal Balances");
		System.out.println("Checking: " + c.displayBalance());
		System.out.println("Savings: " + s.displayBalance());
	
	}

}
