import java.util.Scanner;

public class ConverterApp 
{

	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		int charNum;
		String loop = "y";
		
		while (loop.equalsIgnoreCase("y"))
		{
			System.out.println("Enter a character number.");
			charNum = kb.nextInt();
			
			System.out.println((char)charNum);
			System.out.println("Continue? (y/n)");
			loop = kb.next();
		}
		
		kb.close();
		System.out.println("Application finished.");
	}

}
