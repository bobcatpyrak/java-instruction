import java.util.Scanner;
import java.text.NumberFormat;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class InterestCalculatorApp 
{

	public static void main(String[] args) 
	{
		// create scanner and variables
		Scanner kb = new Scanner(System.in);
		String loop = "y";
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		NumberFormat pct = NumberFormat.getPercentInstance();
		pct.setMaximumFractionDigits(3);
		BigDecimal loan = new BigDecimal(0);
		BigDecimal rate = new BigDecimal(0);
		BigDecimal interest = new BigDecimal(0);

		
		// Welcome Message
		System.out.println("Welcome to the Interest Calculator");
		System.out.println("");
		
		while(loop.equalsIgnoreCase("y"))
		{
			// Prompt
			System.out.print("Enter loan amount:\t\t");
			loan = kb.nextBigDecimal();
			System.out.print("Enter interest rate:\t");
			rate = kb.nextBigDecimal();
			
			// Business Code
			interest = loan.multiply(rate)
					.setScale(2, RoundingMode.HALF_UP);
			// System.out.println(interest);
			
			// Output
			System.out.println("");
			System.out.println("Loan amount:\t " + currency.format(loan));
			System.out.println("Interest rate:\t " + pct.format(rate));
			System.out.println("Interest:\t " + currency.format(interest));
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
