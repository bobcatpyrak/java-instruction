package business;

public enum Roshambo 
{
	ROCK,
	PAPER,
	SCISSORS;
	
	@Override
	public String toString()
	{
		String s = "";
		if (this.ordinal() == 0)
			s = "ROCK";
		else if (this.ordinal() == 1)
			s = "PAPER";
		else if (this.ordinal() == 2)
			s = "SCISSORS";
		return s;
	}
}
