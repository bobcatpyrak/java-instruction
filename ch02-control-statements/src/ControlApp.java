import java.util.Scanner;

public class ControlApp {

	public static void main(String[] args) 
	{
		// ch2 pages 65-69
		
		// if statement
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter traffic light color: ");
		String color = kb.nextLine();
		if (color.equalsIgnoreCase("red"))
		{
			System.out.println("Red Light - stop!");
		}
		else if (color.equalsIgnoreCase("yellow"))
		{
			System.out.println("Yellow light - slow down!");
		}
		else if (color.equalsIgnoreCase("green"))
		{
			System.out.println("Green light - go!");
		}
		else
			System.out.println("That's not a typical traffic light color, nerd.");
	}

}
