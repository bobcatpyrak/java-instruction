import java.util.Scanner;

public class DiceRollerApp 
{

	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		// welcome message
		System.out.println("Dice Roller");

		askToRoll(kb);
		
		kb.close();
	}
	
	public static void askToRoll (Scanner kb)
	{
		System.out.println();
		System.out.println("Roll ze dice? (y/n)");
		if (kb.nextLine().equalsIgnoreCase("y"))
		{
			rollDice();
			askToRoll(kb);
		}
	}
	
	public static void rollDice ()
	{
		int one = (int)(Math.random() * 6) + 1;
		int two = (int)(Math.random() * 6) + 1;
		int total = one + two;
		
		System.out.println("Die 1: " + one);
		System.out.println("Die 2: " + two);
		System.out.println("Total: " + total);
		if(total == 2)
			System.out.println("Snake eyes!");
		else if(total == 12)
			System.out.println("Boxcars!");
	}

}
