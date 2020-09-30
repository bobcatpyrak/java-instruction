import java.util.Scanner;

public class GuessingGameApp 
{

	public static void main(String[] args) 
	{
		Scanner kb = new Scanner (System.in);
		
		// Welcome message
		System.out.println("Welcome to the Guess the Number Game");
		System.out.println("++++++++++++++++++++++++++++++++++++");
		System.out.println();

		// Run the game indefinitely 
		guessGame(kb);
		
		// Farewell message
		System.out.println();
		System.out.println("Bye! Come back soon.");
		kb.close();
	}
	
	public static void guessGame(Scanner kb)
	{
		int rando = (int)(Math.random()*100) + 1;
		int guess = 0;
		int tries = 0;
		
		System.out.println("I'm thinking of a number from 1 to 100.");
		System.out.println("Try to guess it.");
		
		boolean correct = false;
		while (!correct)
		{
			guess = getGuess(kb);
			tries++;
			correct = check(guess, rando);
		}
		
		System.out.println("You got it in " + tries + " tries.");
		if (tries <= 3)
			System.out.println("Great work! You are a mathematical wizard.");
		else if (tries >3 && tries <= 7)
			System.out.println("Not too bad! You've got some potential.");
		else if (tries > 7)
			System.out.println("What took you so long? Maybe you should take some lessons.");
		
		if (tryAgain(kb))
			guessGame(kb);
	}
	
	public static int getGuess(Scanner kb)
	{
		System.out.println();
		System.out.print("Enter Number: ");
		int guess = 0;
		if(kb.hasNextInt())
		{
			guess = kb.nextInt();
			kb.nextLine();
				
			if (guess != 999 && (guess > 100 || guess < 1))
			{
				System.out.println("Error! Guess must be from 1 to 100");
				guess = getGuess(kb);
			}
		}
		else
		{
			kb.nextLine();
			System.out.println("Error! Enter a whole number!");
			guess = getGuess(kb);
		}
		return guess;
	}
	
	public static boolean check(int guess, int rando)
	{
		boolean result = false;
		if (guess == 999)
			result = true;
		else if (guess < (rando - 10))
			System.out.println("Way too low! Guess again.");
		else if (guess > (rando + 10))
			System.out.println("Way too high! Guess again.");
		else if (guess < rando)
			System.out.println("Too low! Guess again.");
		else if (guess > rando)
			System.out.println("Too high! Guess again.");
		else if (guess == rando)
			result = true;
		
		return result;
	}
	
	public static boolean tryAgain(Scanner kb)
	{
		boolean result = false;
		System.out.println();
		System.out.print("Try again? (y/n): ");
		String response = kb.nextLine();
		if(response.equalsIgnoreCase("y"))
			result = true;
		else if(response.equalsIgnoreCase("n"))
			result = false;
		else
		{
			System.out.println("Error! This entry is required. Try again.");
			result = tryAgain(kb);
		}
		return result;
	}
}