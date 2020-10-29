package business;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquareTest {

	@Test
	public void test() 
	{
		int i = 5;
		assertEquals(25, BasicCalculations.square(i));
	}

}
