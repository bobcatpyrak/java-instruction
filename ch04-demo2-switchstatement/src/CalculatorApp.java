import java.util.Scanner;

public class CalculatorApp 
{

	public static void main(String[] args) 
	{
		System.out.println("Welcome to the Calculator");
		Scanner kb = new Scanner(System.in);
		
		// provide Addition, subtraction functions
		String command = "";
		while (!command.equalsIgnoreCase("x"))
		{
			System.out.println("COMMAND MENU:");
			System.out.println("====~~~~====");
			System.out.println("+ : Addition");
			System.out.println("- : Subtraction");
			System.out.println("x : Exit");
			System.out.println();
			System.out.print("Enter command: ");
			
			command = kb.next();
			int n1 = 0;
			int n2 = 0;
			int result = 0;
			
			switch (command)
			{
				case "+":
					System.out.print("Input first number: ");
					n1 = kb.nextInt();
					System.out.print("Input second number: ");
					n2 = kb.nextInt();
					result = n1 + n2;
					System.out.println(result);
					break;
				case "-":
					System.out.print("Input first number: ");
					n1 = kb.nextInt();
					System.out.print("Input second number: ");
					n2 = kb.nextInt();
					result = n1 - n2;
					System.out.println(result);
					break;
				case "x":
				case "X":
					System.out.println("Exit inputted");
					break;
				default:
					System.out.println("Invalid Entry!");
					break;
			}
			
			
		}
		
		
		
		kb.close();
		System.out.println("Good bye");
	}

}
