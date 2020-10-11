package business;

public class Lisa extends Player 
{

	public Lisa()
	{
		super();
		this.setName("Lisa");
;	}
	
	@Override
	public Roshambo generateRoshambo() 
	{
		Roshambo ros;
		int choice = (int)(Math.random()*3);
		System.out.println(choice);
		if (choice == 0)
			ros = Roshambo.ROCK;
		else if (choice == 1)
			ros = Roshambo.PAPER;
		else
			ros = Roshambo.SCISSORS;
	
		return ros;
	}

}
