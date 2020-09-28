
public class MathClassApp 
{

	public static void main(String[] args) 
	{
		long result1 = Math.round(1.667);
		System.out.println(result1); // displays 2
		
		int result2 = Math.round(1.59F); // implicit cast?
		System.out.println(result2);
		
		int result3 = (int)Math.round(1.667);
		System.out.println(result3); //explicit cast
		
		// rounding to a 100th decimal value
		double x = 10.315; 
		System.out.println(x);
		x = (double)Math.round(x*100) / 100;
		System.out.println(x);
		
		System.out.println("Random numbers.");
		double r = Math.random();
		System.out.println(r);
		r = Math.random() * 10;
		System.out.println(r);
		//die roll between 1 and 6
		int die = (int)(Math.random()*6) + 1;
		System.out.println(die);
	}

}
