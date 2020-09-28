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
			length = kb.nextDouble();
			System.out.print("Enter width: ");
			width = kb.nextDouble();
			
			System.out.println("Area: " + (width*length));
			System.out.println("Perimeter: " + ((2*width) + (2*length)));
			
			System.out.print("Continue? (y/n): ");
			loop = kb.next();
		}
		System.out.println("Farewell.");
		
	}

}
