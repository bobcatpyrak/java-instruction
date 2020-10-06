package business;

public class CheckingAccount extends Account 
{
	double monthlyFee;
	public CheckingAccount() 
	{
		super();
	}
	
	public CheckingAccount(double balance, double monthlyFee)
	{
		super(balance);
		this.monthlyFee = monthlyFee;
	}
	
	public String chargeMonthlyFee()
	{
		balance -= monthlyFee;
		return currency.format(monthlyFee);
	}

	public double getMonthlyFee() {
		return monthlyFee;
	}
	public void setMonthlyFee(double monthlyFee) {
		this.monthlyFee = monthlyFee;
	}
	
	

}
