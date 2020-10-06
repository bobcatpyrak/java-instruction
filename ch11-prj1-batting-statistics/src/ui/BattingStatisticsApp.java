package ui;

import java.text.NumberFormat;

import business.Batter;
import ui.console.Console;

public class BattingStatisticsApp 
{

	public static void main(String[] args) 
	{
		System.out.println("Welcome to the Batting Average Calculator");
		
		Batter[] batters = new Batter[10];
		boolean loop = true;
		
		while (loop)
		{
			int choice = Console.getInt("\nMenu:\n"
								+ "1. Add batter\n"
								+ "2. Edit batter\n"
								+ "3. List batters\n"
								+ "4. Show individual batter stats\n"
								+ "5. Show total results\n"
								+ "6. Exit\n\n"
								+ "Enter choice: "
								, 1, 6);
			System.out.println();
			
			switch(choice)
			{
			case 1:
				batters = addBatter(batters, 0);
				break;
			case 2:
				editBatter(batters);
				break;
			case 3:
				listBatters(batters);
				break;
			case 4:
				showBatterStats(batters);
				break;
			case 5:
				showStatsOfAllBatters(batters);
				break;
			case 6:
				loop = false;
				break;
			default:
				break;
			}	
		}
		
		System.out.println("\nGood bye");
	}
	
	private static Batter[] addBatter(Batter[] batters, int slot)
	{
		if(batters[slot] == null)
		{
			String name = Console.getRequiredString("What is the name of the batter?: ");
			int i = Console.getInt("Enter number of times at bat: ", 1, 30);
			int[] atBats = new int[i];
			System.out.println("\n0 = out, 1 = single, 2 = double, 3 = triple, 4 = home run");
			
			for(int j = 0; j < atBats.length; j++)
			{
				atBats[j] = Console.getInt("Result for at-bat " + (j+1) + ": ", 0, 4);
			}
			batters[slot] = new Batter(name, atBats);
			
			System.out.println(batters[slot].getBattingAverage());
			System.out.println(batters[slot].getSluggingPercent());
			return batters;
		}
		else if (slot < 9)
		{
			slot++;
			return addBatter(batters, slot);
			
		}
		else
		{
			System.out.println("ERROR. No open slots.");
			return batters;
		}
	}
	
	private static Batter[] editBatter(Batter[] batters)
	{
		listBatters(batters);
		
		int choice = Console.getInt("\nWhich batter would you like to edit?: ", 1, batters.length) - 1;
		
		String name = Console.getRequiredString("What is the name of the batter?: ");
		int i = Console.getInt("Enter number of times at bat: ", 1, 30);
		int[] atBats = new int[i];
		System.out.println("\n0 = out, 1 = single, 2 = double, 3 = triple, 4 = home run");
		
		for(int j = 0; j < atBats.length; j++)
		{
			atBats[j] = Console.getInt("Result for at-bat " + (j+1) + ": ", 0, 4);
		}
		batters[choice].setName(name);
		batters[choice].setAtBats(atBats);
		
		System.out.println(batters[choice].getBattingAverage());
		System.out.println(batters[choice].getSluggingPercent());
		return batters;
		

	}
	
	private static void listBatters(Batter[] batters)
	{
		if (batters[0] == null)
			System.out.println("There are no batters entered.");
		else
		{				
			int count = 0;
			for (Batter b : batters)
			{
				if(b != null)
				{
					count++;
					System.out.println("Batter "+ count + ": " + b.getName());
				}
			}
		}
	}

	private static void showBatterStats(Batter[] batters)
	{
		listBatters(batters);
		
		int choice = Console.getInt("\nWhich batter would you like to see stats of?: ", 1, batters.length) - 1;
		
		System.out.println(batters[choice].getName() + ":");
		System.out.println(batters[choice].getBattingAverage());
		System.out.println(batters[choice].getSluggingPercent());
	}
	
	private static void showStatsOfAllBatters(Batter[] batters)
	{
		double totalAtBats = 0;
		double totalHits = 0;
		double totalBases = 0;
		
		for(Batter b : batters)
		{
			if(b != null)
			{
				int[] atBats = b.getAtBats();
				totalAtBats += atBats.length;
					for(int i : atBats)
					{
						if (i > 0)
							totalHits++;
						totalBases += i;
					}
			}
		}
		
		NumberFormat format = NumberFormat.getNumberInstance();
		format.setMinimumFractionDigits(3);
		
		double avg = totalHits/totalAtBats;
		double perc = totalBases/totalAtBats;
		
		System.out.println("Total At-Bats: " + totalAtBats);
		System.out.println("Total Hits: " + totalHits);
		System.out.println("Total Bases earned: " + totalBases);
		System.out.println("Combined batting average: " + format.format(avg));
		System.out.println("Combined slugging percent: " + format.format(perc));
	}
}
