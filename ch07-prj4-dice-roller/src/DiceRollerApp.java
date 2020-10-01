import java.util.Scanner;

public class DiceRollerApp 
{

	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		Dice d = new Dice();
		boolean rolling = false;
		
		System.out.println("Welcome to the Dice Roller\n");
		System.out.print("Roll the Dice? (y/n): ");
		if (kb.nextLine().equalsIgnoreCase("y"))
			rolling = true;
		
		while(rolling)
		{
			System.out.println();
			d.roll();
			System.out.println("Die 1: " + d.d1.getValue());
			System.out.println("Die 2: " + d.d2.getValue());
			d.printRoll();
			
			if(d.getSum() == 7)
				System.out.println("Craps!");
			else if(d.getSum() == 2)
				System.out.println("Snake eyes!");
			else if(d.getSum() == 12)
				System.out.println("Boxcars!");
			
			System.out.println();
			
			if(!rollAgain(kb))
				rolling = false;
		}
		
		System.out.println();
		System.out.println("Bye.");
		kb.close();
	}
	
	private static boolean rollAgain(Scanner kb)
	{
		boolean roll = false;
		
		System.out.print("Roll again? (y/n): ");
		if(kb.next().equalsIgnoreCase("y"))
			roll = true;
		
		return roll;
	}

}
