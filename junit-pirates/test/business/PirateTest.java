package business;

import static org.junit.Assert.*;

import org.junit.Test;

import ui.PirateFightApp;

public class PirateTest {

	@Test
	public void testPirateCreate() 
	{
		String name = PirateFightApp.namePirate();
		Pirate p1 = new Pirate(name);
		assertEquals(name, p1.getName());
		assertEquals(4, p1.getLimbsRemaining());
		assertFalse(p1.isDead());
		assertEquals(2, Pirate.getNumPirates());
		assertEquals(0, Pirate.getTotalLimbsLost());
	}

	@Test
	public void testOctoPirateCreate()
	{
		Pirate p1 = new Pirate("Octodad", 8);
		assertEquals(8, p1.getLimbsRemaining());
	}
	
	@Test(timeout=1000)
	public void testInfiniteLoop()
	{
		int i = 0;
		System.out.println("the beat goes on");
		while(true)
		{
			System.out.println(i+ " and on");
			i++;
		}
	}
}
