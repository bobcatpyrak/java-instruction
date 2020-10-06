package business;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SavingsAccount extends Account 
{
	double monthlyInterestRate;
	double monthlyInterestPayment;
	
	public SavingsAccount() 
	{
		super();
	}
	public SavingsAccount(double balance, double monthlyInterestRate)
	{
		super(balance);
		this.monthlyInterestRate = monthlyInterestRate;
	}
	
	public String addMonthlyInterestPayment()
	{
		BigDecimal interest = new BigDecimal(balance);
		BigDecimal rate = new BigDecimal(monthlyInterestRate);
		interest = interest.multiply(rate);
		interest.setScale(2, RoundingMode.HALF_UP);
		
		monthlyInterestPayment = interest.doubleValue();
		balance += monthlyInterestPayment;
		
		return currency.format(monthlyInterestPayment);
	}
	
	public double getMonthlyInterestRate() {
		return monthlyInterestRate;
	}
	public void setMonthlyInterestRate(double monthlyInterestRate) {
		this.monthlyInterestRate = monthlyInterestRate;
	}
	public double getMonthlyInterestPayment() {
		return monthlyInterestPayment;
	}
	public void setMonthlyInterestPayment(double monthlyInterestPayment) {
		this.monthlyInterestPayment = monthlyInterestPayment;
	}
	
	
}
