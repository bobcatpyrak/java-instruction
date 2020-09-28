import java.util.Scanner;

public class TableOfPowers 
{

	public static void main(String[] args) 
	{
		// Welcome message
		System.out.println("Welcome to the Squares and Cubes table");
		Scanner kb = new Scanner(System.in);
		
		while(true)
		{
			System.out.print("Enter an integer: ");
			int count = kb.nextInt();
			System.out.println();

			
			System.out.println("Number\tSquared\tCubed");
			System.out.println("======\t=======\t=====");
			
			for (int i = 1; i <= count; i++)
			{
				System.out.println(i + "\t" + i*i + "\t" + i*i*i);
			}
			
			System.out.println();
			System.out.print("Continue? (y/n): ");
			String check = kb.next();
			System.out.println();
			if (check.equalsIgnoreCase("n"))
				break;
		}
		System.out.println("Fare thee well, traveler.");
		kb.close();
	}

}
