import java.util.Scanner;

public class ChangeCalculatorApp 
{

	public static void main(String[] args) 
	{
		// Create things
		Scanner kb = new Scanner(System.in);
		String loop = "y";
		int change = 0;
		int quarters;
		int dimes;
		int nickels;
		int pennies;

		// Welcome massage
		System.out.println("Welcome to the Change Calculator");
		System.out.println();
		

		
		while (loop.equalsIgnoreCase("y"))
		{
			// Prompt
			System.out.print("Enter number of cents (0-99): ");
			change = kb.nextInt();
			System.out.println();
			

			// math
			quarters = change/25;
			change = change%25;
			dimes = change/10;
			change = change%10;
			nickels = change/5;
			change = change%5;
			pennies = change;
			
			System.out.println("Quarters: " + quarters);
			System.out.println("Dimes:\t  " + dimes);
			System.out.println("Nickels:  " + nickels);
			System.out.println("Pennies:  " + pennies);
			System.out.println();
			
			System.out.print("Continue? (y/n) ");
			loop = kb.next();
			System.out.println();
		}
		
		// Farewell Massage
		kb.close();
		System.out.println("See ya");
	}

}
