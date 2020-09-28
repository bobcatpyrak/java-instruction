import java.text.NumberFormat;

public class NumberFormatApp 
{

	public static void main(String[] args) 
	{
		double astonMartinPrice = 234543.53;
		double interestPct = .025557;
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		NumberFormat pct = NumberFormat.getPercentInstance();
		pct.setMaximumFractionDigits(3);
		
		System.out.println("Car finance info:");
		System.out.println("Price:\t\t" + currency.format(astonMartinPrice));
		System.out.println("Interest:\t" + pct.format(interestPct));
		


	}

}
