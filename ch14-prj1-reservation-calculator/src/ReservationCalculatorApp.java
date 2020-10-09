import ui.console.Console;
import java.time.*;


public class ReservationCalculatorApp 
{

	public static void main(String[] args) 
	{
		System.out.println("Reservation Calculator\n");
		boolean loop = true;
		
		while(loop)
		{
			int month = Console.getInt("Enter the arrival month (1-12) ", 1, 12);
			int day = Console.getInt("Enter the arrival day (1-31) ", 1, 31);
			int year = Console.getInt("Enter the arrival year");
	
			int month2 = Console.getInt("Enter the departure month (1-12) ", 1, 12);
			int day2 = Console.getInt("Enter the departure day (1-31) ", 1, 31);
			int year2 = Console.getInt("Enter the departure year");
			
			Reservation r = new Reservation(LocalDate.of(year, month, day), LocalDate.of(year2, month2, day2));
			
			System.out.println("\nArrival date: " + r.getArrivalDateFormatted());
			System.out.println("Departure date: " + r.getDepartureDateFormatted());
			System.out.println("Price: " + r.getPricePerNightFormatted() + " per night");
			System.out.println("Total price: " + r.getTotalPriceFormatted() + " for " + r.getNumberOfNights() + " nights");
			
			loop = Console.getYesOrNo("\nContinue? (y/n): ");
		}
		System.out.println("Good bye");
	}

}
