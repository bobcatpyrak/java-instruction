import java.math.*;

public class BigDecimalApp 
{

	public static void main(String[] args) 
	{
		// p. 111
		double pct = .0356789;
		System.out.println(pct);
		
		// create a BigDecimal with scale of 4 and half up rounding
		BigDecimal bigPct = new BigDecimal(pct);
		System.out.println(bigPct);
		bigPct = bigPct.setScale(4, RoundingMode.HALF_UP);
		System.out.println(bigPct);

		System.out.println("");
		BigDecimal bd1 = new BigDecimal(50);
		BigDecimal bd2 = new BigDecimal(25.5);
		BigDecimal bd3 = new BigDecimal("10.75");
		System.out.println(bd1);
		System.out.println(bd2);
		System.out.println("");
		BigDecimal sum = bd1.add(bd2);
		System.out.println(sum);
		BigDecimal diff = bd2.subtract(bd3);
		System.out.println(diff);
		BigDecimal prod = bd2.multiply(bd3);
		System.out.println(prod);
		BigDecimal quotient = bd1.divide(bd3,7,RoundingMode.HALF_UP);
		System.out.println(quotient);
		
	}

}
