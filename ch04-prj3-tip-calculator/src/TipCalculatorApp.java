import java.util.Scanner;
import java.math.BigDecimal;
import java.text.NumberFormat;

public class TipCalculatorApp 
{

	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		NumberFormat percent = NumberFormat.getPercentInstance();
		NumberFormat money = NumberFormat.getCurrencyInstance();
		
		System.out.println("Tip Calculator");
		System.out.println();
		
		while (true)
		{
			System.out.print("Cost of meal: ");
			BigDecimal cost = kb.nextBigDecimal();
			System.out.println();
			
			for (double p = .15; p <= .25; p += .05)
			{
				BigDecimal perc = new BigDecimal(Double.toString(p));
				BigDecimal tip = cost.multiply(perc);
				BigDecimal total = cost.add(tip);
				System.out.println(percent.format(perc));
				System.out.println("Tip amount: " + money.format(tip));
				System.out.println("Total amount: " + money.format(total));
				System.out.println();
			}
			
			System.out.println();
			System.out.print("Continue? (y/n): ");
			if (kb.next().equalsIgnoreCase("N"))
				break;
		}
		
		kb.close();
		System.out.println("It's all ogre now.");

	}

}
