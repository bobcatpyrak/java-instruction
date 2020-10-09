import java.time.*;

public class DateTimeApp 
{

	public static void main(String[] args) 
	{
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate); // YYYY-MM-DD
		LocalTime currentTime = LocalTime.now();
		System.out.println(currentTime); // HH:MM:SS:....
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println(currentDateTime);
		
		LocalDate halloween2020 = LocalDate.of(2020, 10, 31);
		LocalDate newYears2020 = LocalDate.of(2020, 1, 1);
		System.out.println(halloween2020);
		System.out.println(newYears2020);
		
		LocalDate thanksgiving2020 = LocalDate.parse("2020-11-26");
		System.out.println(thanksgiving2020);
		System.out.println(halloween2020.getMonth() + "" + halloween2020.getDayOfWeek());
		
		LocalDate ly = LocalDate.of(2020, 2, 29);
		System.out.println(ly);
	}

}
