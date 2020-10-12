import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingApp {

	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Hello");
		int number = 0;
		while(number != 99)
		{
			System.out.println("Enter a number: ");
			try 
			{
				number = kb.nextInt();
				System.out.println("You entered: " + number);
				System.out.println();
			} 
			catch (InputMismatchException e) 
			{
				e.printStackTrace();
				kb.nextLine();
			}
			
		}
	}

}
