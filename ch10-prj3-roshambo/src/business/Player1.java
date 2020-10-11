package business;

public class Player1 extends Player 
{

	public Player1()
	{
		super();
	
;	}
	
	@Override
	public Roshambo generateRoshambo() 
	{
		int choice = (int)(Math.random()*3) + 1;
		if (choice == 0)
			return Roshambo.ROCK;
		if (choice == 1)
			return Roshambo.PAPER;
		else
			return Roshambo.SCISSORS;
	}

}
