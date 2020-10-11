package ui;

import ui.console.Console;
import business.*;

public class RoshamboApp {

	public static void main(String[] args) 
	{
		System.out.println("Welcome to the Roshambo App");
		System.out.println();
		
		Player p1 = new Player1();
		Player p2;
		p1.setName(Console.getRequiredString("Enter your name: "));
		
		System.out.println();
		
		String opponent = Console.getChoiceString("Would you like to play Bart or Lisa? (B/L): ", "B", "L");
		
		if (opponent.equalsIgnoreCase("b"))
			p2 = new Bart();
		else 
			p2 = new Lisa();
		
		boolean loop = true;
		while(loop)
		{
			System.out.println();
			String choice = Console.getChoiceString("Rock, paper, or scissors? (r/p/s): ", new String[] {"r", "p", "s"});
			
			Roshambo p1ros;
			if(choice.equalsIgnoreCase("R"))
				p1ros = Roshambo.ROCK;
			else if(choice.equalsIgnoreCase("P"))
				p1ros = Roshambo.PAPER;
			else
				p1ros = Roshambo.SCISSORS;
			
			p1.setRos(p1ros);
			
			p2.setRos(p2.generateRoshambo());
			String result = "";
			
			if(p1.getRos().toString().equals("ROCK"))
			{
				if(p2.getRos().toString().equals("ROCK"))
					result = "Draw!";
				else if(p2.getRos().toString().equals("PAPER"))
					result = p2.getName() + " wins!";
				else if(p2.getRos().toString().equals("SCISSORS"))
					result = p1.getName() + " wins!";
			}
			else if(p1.getRos().toString().equals("PAPER"))
			{
				if(p2.getRos().toString().equals("ROCK"))
					result = p1.getName() + " wins!";
				else if(p2.getRos().toString().equals("PAPER"))
					result = "Draw!";
				else if(p2.getRos().toString().equals("SCISSORS"))
					result = p2.getName() + " wins!";
			}
			else if(p1.getRos().toString().equals("SCISSORS"))
			{
				if(p2.getRos().toString().equals("PAPER"))
					result = p1.getName() + " wins!";
				else if(p2.getRos().toString().equals("SCISSORS"))
					result = "Draw!";
				else if(p2.getRos().toString().equals("ROCK"))
					result = p2.getName() + " wins!";
			}		
			
			System.out.println(p1.getName() + ": " + p1.getRos());
			System.out.println(p2.getName() + ": " + p2.getRos());
			System.out.println(result);

			System.out.println();
			loop = Console.getYesOrNo("Continue? (y/n): ");
		}
		System.out.println("\nGame over.");
	}

}
