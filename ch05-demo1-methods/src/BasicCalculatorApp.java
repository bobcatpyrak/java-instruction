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

}
