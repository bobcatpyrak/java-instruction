import java.util.Scanner;
import java.text.NumberFormat;

public class TemperatureConverterApp 
{

	public static void main(String[] args) 
	{
		// create variables and scanner
		Scanner kb = new Scanner(System.in);
		double fah = 0; // Fahrenheit
		double cel = 0; // celsius
		String loop = "y";
		NumberFormat twoDec = NumberFormat.getNumberInstance();
		twoDec.setMaximumFractionDigits(2);
		
		// Welcome message
		System.out.println("Welcome to the Temperature Converter!");

		while (loop.equalsIgnoreCase("y"))
		{
			// Prompt
			System.out.print("Enter degrees in Fahrenheit:");
			fah = kb.nextInt();
			
			// Business
			cel = (fah-32) * (5.0/9.0);
			System.out.println("Degrees in Celsius: " + twoDec.format(cel));
			
			System.out.println("");
			System.out.print("Continue? (y/n): ");
			loop = kb.next();
		}
		
		// Close Scanner and end program
		kb.close();
		System.out.println("Program ended.");
	}

}
