
public class Dice 
{
	Die d1;
	Die d2;
	
	public Dice ()
	{
		d1 = new Die();
		d2 = new Die();
	}
	
	public int getDie1Value()
	{
		return d1.getValue();
	}
	
	public int getDie2Value()
	{
		return d2.getValue();
	}
	
	public int getSum()
	{
		return d1.getValue() + d2.getValue();
	}
	
	public void roll()
	{
		d1.roll();
		d2.roll();
	}
	
	public void printRoll()
	{
		System.out.println("Total: " + getSum());
	}
}
