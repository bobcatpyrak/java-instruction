package business;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountATest {

	@Test
	public void test() 
	{
		String sentence = "aAaA aA aAA otaA";
		assertEquals(11, BasicCalculations.countA(sentence));
	}

}
