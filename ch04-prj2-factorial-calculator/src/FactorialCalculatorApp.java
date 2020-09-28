import java.util.Scanner;

public class FactorialCalculatorApp 
{

	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Welcome to the Factorial Calculator");

		while (true)
		{	
			System.out.println();
			System.out.print("Enter an integer that's greater than 0 and less than 26: ");
			int input = kb.nextInt();
			
			if (input < 26 && input > 0)
			{
				long fact = 1;
				
				for(int i = 1; i <= input; i++)
				{
					fact *=i;
				}
				
				System.out.println("The factorial of " + input + " is " + fact + ".");
				
				System.out.println();
				System.out.print("Continue? (y/n): ");
				if (kb.next().equalsIgnoreCase("n"))
					break;
			}
			else
				System.out.println("LESS than 26, and greater than 0, please.");

		}
			
		System.out.println("Bye");
		kb.close();
	}

}
