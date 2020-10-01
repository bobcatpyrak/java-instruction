import java.lang.Math;

public class Die 
{
	private int sides;
	private int value;

	public Die()
	{
		value = 0;
		sides = 6;
	}
	
	public void roll()
	{
		value = ((int)(Math.random()*sides)+1);
	}
	
	public void setSides(int sides)
	{
		this.sides = sides;
	}
	
	public int getSides()
	{
		return sides;
	}
	
	public void setValue(int value)
	{
		this.value = value;
	}
	
	public int getValue()
	{
		return value;
	}
}


