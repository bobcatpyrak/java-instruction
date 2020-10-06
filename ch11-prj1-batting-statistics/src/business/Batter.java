package business;
import java.text.NumberFormat;

public class Batter 
{
	String name;
	int[] atBats;
	
	public Batter()
	{
		
	}
	
	public Batter (String name, int[] atBats)
	{
		this.name = name;
		this.atBats = atBats;
	}
	
	public String getBattingAverage()
	{
		NumberFormat format = NumberFormat.getNumberInstance();
		format.setMinimumFractionDigits(3);
		double total = 0;
		
		for(int i : atBats)
		{
			if(i > 0)
				total++;
		}
		
		double avg = total/atBats.length;
		return "Batting average: " + format.format(avg);
	}
	
	public String getSluggingPercent()
	{
		NumberFormat format = NumberFormat.getNumberInstance();
		format.setMinimumFractionDigits(3);
		double total = 0;
		
		for(int i : atBats)
		{
			if(i > 0)
				total += i;
		}
		
		double avg = total/atBats.length;
		return "Batting average: " + format.format(avg);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getAtBats() {
		return atBats;
	}

	public void setAtBats(int[] atBats) {
		this.atBats = atBats;
	}
	
	
}
