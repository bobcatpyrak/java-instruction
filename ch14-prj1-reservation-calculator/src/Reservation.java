
import java.text.NumberFormat;
import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;


public class Reservation 
{
	private LocalDate arrivalDate;
	private LocalDate departureDate;
	private final double NIGHTLY_RATE = 145.00;
	
	public Reservation()
	{
		
	}
	
	public Reservation(LocalDate arrivalDate, LocalDate departureDate)
	{
		this.arrivalDate = arrivalDate;
		this.departureDate = departureDate;
	}

	public LocalDate getArrivalDate() {
		return arrivalDate;
	}
	
	public String getArrivalDateFormatted()
	{
		DateTimeFormatter form = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		return form.format(arrivalDate);
	}

	public void setArrivalDate(LocalDate arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public LocalDate getDepartureDate() {
		return departureDate;
	}

	public String getDepartureDateFormatted()
	{
		DateTimeFormatter form = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		return form.format(departureDate);
	}
	public void setDepartureDate(LocalDate departureDate) {
		this.departureDate = departureDate;
	}
	
	public int getNumberOfNights()
	{
		return (int) arrivalDate.until(departureDate, ChronoUnit.DAYS);
	}
	
	public String getPricePerNightFormatted()
	{
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(NIGHTLY_RATE);
	}
	
	public double getTotalPrice()
	{
		return getNumberOfNights() * NIGHTLY_RATE;
	}
	
	public String getTotalPriceFormatted()
	{	
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(getNumberOfNights() * NIGHTLY_RATE);
	}
}
