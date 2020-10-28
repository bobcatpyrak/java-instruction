package ui;

import java.util.ArrayList;
import java.util.List;

import business.Pirate;

public class PirateFightApp 
{
	private static List<Pirate> pirates = new ArrayList<>();
	
	public static void main(String[] args) 
	{
		System.out.println("Welcome to the Pirate Fight App");
		
		pirates.add(new Pirate(namePirate()));
		pirates.add(new Pirate(namePirate()));
		pirates.add(new Pirate(namePirate()));
		pirates.add(new Pirate(namePirate()));
		pirates.add(new Pirate(namePirate()));
		
		printPirateStats();
		
		// simulate a fight by picking a random index
		// to pick a pirate, then they lose a limb
		// total of 10 times
		for (int i = 0; i < 12; i++)
		{
			int pirateIndex = genRandomIndex();
			Pirate p = pirates.get(pirateIndex);
			p.loseALimb();
			if (p.isDead())
				pirates.remove(p);
		}
		
		printPirateStats();
		
		System.out.println("Bye, Matey!");
	}
	
	public static String namePirate()
	{
		String name = "Captain ";
		char[] consonants = new char[] {'b', 'b', 'c', 'c', 'd', 'd', 'f', 'f', 'g', 'g', 'h', 'j', 'k', 'k', 'l', 'l', 'm', 'm', 'n', 'n', 'p', 'p', 'q', 'r', 'r', 's', 's', 't', 't', 'v', 'v', 'w', 'x', 'y', 'z'};
		char[] vowels = new char[] {'a', 'a', 'e', 'e', 'i', 'i', 'o', 'o', 'u', 'u', 'y'};
		name += Character.toUpperCase(consonants[(int)(Math.random()*consonants.length)]);
		name += vowels[(int)(Math.random()*vowels.length)];
		name += consonants[(int)(Math.random()*consonants.length)];
		name += consonants[(int)(Math.random()*consonants.length)];
		name += vowels[(int)(Math.random()*vowels.length)];
		name += consonants[(int)(Math.random()*consonants.length)];
		
		System.out.println("New Pirate: " + name);
		
		return name;
	}
	
	private static int genRandomIndex()
	{
		int r = (int)(Math.random()*pirates.size());
		return r;
	}
	
	private static void printPirateStats()
	{
		System.out.println("**** Pirate Stats ****");
		System.out.println("Total Pirates:\t  " + Pirate.numPirates);
		System.out.println("Total Limbs Lost: " + Pirate.totalLimbsLost);
		for (Pirate p : pirates)
			System.out.println(p);
		System.out.println("**********************");
	}

}
