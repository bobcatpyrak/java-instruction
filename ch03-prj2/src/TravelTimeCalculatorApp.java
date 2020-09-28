import java.util.Scanner;

public class TravelTimeCalculatorApp 
{

	public static void main(String[] args) 
	{
		// Create Scanner and variables
		Scanner kb = new Scanner(System.in);
		double miles = 0;
		double mph = 0;
		double hours = 0;
		double minutes = 0;
		String loop = "y";
		
		// Welcome Message
		System.out.println("Welcome to the Travel Time Calculator");
		System.out.println("");
		
		while(loop.equalsIgnoreCase("y"))
		{
			// Prompt
			System.out.print("Enter miles:\t\t");
			miles = kb.nextDouble();
			System.out.print("Enter miles per hour:\t");
			mph = kb.nextDouble();
			
			// Business Code
			hours = miles/mph;
			minutes = (hours*60)%60;
			
			// Output
			System.out.println("");
			System.out.println("Estimated travel time");
			System.out.println("---------------------");
			System.out.println("Hours:\t " + (int)hours);
			System.out.println("Minutes: " + (int)minutes);
			System.out.println("");
		
			// Check for loop
			System.out.print("Continue? (y/n): ");
			loop = kb.next();
			System.out.println("");
		}
		
		// Close and end program
		kb.close();
		System.out.println("Program terminated.");

	}

}
