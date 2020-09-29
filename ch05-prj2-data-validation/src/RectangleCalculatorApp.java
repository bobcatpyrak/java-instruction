import java.util.Scanner;

public class RectangleCalculatorApp 
{

	public static void main(String[] args) 
	{
		// creation of scanner and variables
		Scanner kb = new Scanner(System.in);
		double length;
		double width;
		
		//welcome message
		System.out.println("Welcome to the Area and Perimeter Calculator");
		String loop = "y";
		while (loop.equalsIgnoreCase("y"))
		{
			//ask for length and width
			System.out.print("Enter length: ");
			length = getDouble(kb);
			System.out.print("Enter width: ");
			width = getDouble(kb);
			
			System.out.println("Area: " + (width*length));
			System.out.println("Perimeter: " + ((2*width) + (2*length)));
			
			System.out.print("Continue? (y/n): ");
			loop = kb.next();
		}
		System.out.println("Farewell.");
		
	}
	
	private static double getDouble(Scanner kb)
	{
		double num = 0.0;
		if (kb.hasNextDouble())
		{
			num = kb.nextDouble();
			kb.nextLine();
		}
		else
		{
			System.out.println("Enter a valid number, please.\n");
			kb.nextLine();
			num = getDouble(kb);
		}
		return num;
	}
	

}

