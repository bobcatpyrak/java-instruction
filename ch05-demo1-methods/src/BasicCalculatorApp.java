import java.util.*;

public class BasicCalculatorApp 
{

	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		printWelcomeMessage();
		System.out.println("State your name.");
		printHello(kb.nextLine());
		printWelcomeMessage();
		
		int nbr = getInt("What number to print? ", kb);
		
		System.out.println(nbr);
		
		int a = getInt("Enter a whole number: ", kb);
		int b = getInt("Enter a whole number: ", kb);
		System.out.println("Sum of "+a+" + "+b+" = "+ sum(a, b));
		
		double c = getDouble("Enter a decimal number: ", kb);
		double d = getDouble("Enter a decimal number: ", kb);
		System.out.println("Sum of "+c+" + "+d+" = "+ sum(c, d));
		
		int month = getIntWithinRange("Enter a month number", kb, 1, 12);
		System.out.println("The month is month number " + month);
		kb.close();
	}
	
	// method, no input and no return type
	private static void printWelcomeMessage()
	{
		System.out.println("Welcome to the Calculator");
	}
	
	// method, with input, no return type
	private static void printHello (String name)
	{
		System.out.println("Hello " + name);
	}
	
	private static int sum(int a, int b)
	{
		return a+b;
	}
	private static double sum(double a, double b)
	{
		return a+b;
	}
	private static int getInt(String prompt, Scanner kb)
	{
		int nbr = 0;
		while (true)
		{
			try
			{
				System.out.println(prompt);
				nbr = kb.nextInt();
				break;
			}
			catch (InputMismatchException ime)
			{
				System.out.println("Error! Invalid number. Try again.\n");
				kb. nextLine();
				continue;
			}
		}
		return nbr;
	}

	private static double getDouble(String prompt, Scanner kb)
	{
		double nbr = 0;
		while (true)
		{
			System.out.println(prompt);
			if (kb.hasNextDouble())
			{
				nbr = kb.nextDouble();
				break;
			}
			else
			{
				System.out.println("Error! Invalid number. Try again.\n");
				kb.nextLine();
				continue;
			}
		}
		return nbr;
	}
	
	private static int getIntWithinRange(String prompt, Scanner kb, int min, int max)
	{
		int nbr = 0;
		boolean isValid = false;
		while (!isValid)
		{
			nbr = getInt(prompt, kb);
			if (nbr > max)
			{
				System.out.println("Number is too high!");
				continue;
			}
			else if (nbr < min)
			{
				System.out.println("Number is too low.");
				continue;
			}
			else
				isValid = true;
		}
		return nbr;
	}
}
