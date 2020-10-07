package ui;

import java.util.ArrayList;

import ui.console.Console;

public class PrimeNumberCheckerApp 
{

	public static void main(String[] args) 
	{
		System.out.println("Prime Number Checker");
		boolean loop = true;
		while(loop)
		{
			check();
			if(Console.getYesOrNo("\nTry again? (y/n): "))
				continue;
			else
				loop = false;
		}
		
		System.out.println("Bye");
	}

	public static void check()
	{
		int n = Console.getInt("Please enter an integer from 1 to 5000: ", 1, 5000);
		ArrayList<Integer> factors = new ArrayList<>();
		
		for(int n2 = 1; n2 < n + 1; n2++)
		{
			if (n % n2 == 0)
			{
				factors.add(n2);
			}
		}
		
		if(factors.size() > 2)
		{
			System.out.println(n + " is NOT a prime number.");
			System.out.print("It has " + factors.size() + " factors: ");

			for (int f : factors)
			{
				System.out.print(f + " ");
			}
			System.out.println("");
		}
		else
			System.out.println(n + " is a prime number.");
	}
}
