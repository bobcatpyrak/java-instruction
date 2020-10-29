package business;

public class BasicCalculations 
{

	public static int square(int i)
	{
		return i*i;
	}
	
	public static int countA(String s)
	{
		int count = 0;
		char[] letters = s.toCharArray();
		
		for(int i = 0; i < letters.length; i++)
		{
			if(letters[i] == 'a' || letters[i] == 'A')
				count++;
		}
		return count;
	}
}
