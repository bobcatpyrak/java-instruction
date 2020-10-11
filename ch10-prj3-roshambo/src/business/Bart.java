package business;

public class Bart extends Player 
{

	public Bart()
	{
		super();
		this.setName("Bart");
		this.setRos(Roshambo.ROCK);
;	}
	
	@Override
	public Roshambo generateRoshambo() 
	{
		return Roshambo.ROCK;
	}

}
