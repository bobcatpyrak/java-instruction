import java.util.Scanner;

public class CommonDivisorCalculatorApp 
{

	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Greatest Common Divisor Factor");
		System.out.println();
		
		while (true)
		{
			System.out.print("Enter first number: ");
			int num1 = kb.nextInt();
			System.out.print("Enter second number: ");
			int num2 = kb.nextInt();			
			int y = num2;
			int x = num1;
			
			while (x != 0)
			{
				while (y >= x)
				{
					System.out.println(y);
					y -= x;
				}
				int newY = x;
				x = y;
				y = newY;
			}
//			for(int i = num2; i < num1; i -= num1)
//			{
//				for(int ii = num1; ii < num2; ii -= num2)
//				{
//					y = ii;
//					System.out.println("DB: " + y);
//				}
//			}
			System.out.println("Greatest common divisor: " + y);
			System.out.println();
			
			System.out.print("Continue? (y/n): ");
			if (kb.next().equalsIgnoreCase("N"))
				break;
		}
		
		kb.close();
		System.out.println("It's over.");
	}

}
