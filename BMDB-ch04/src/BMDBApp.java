import java.util.Scanner;

public class BMDBApp 
{

	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		String choice = "";
		
		// Welcome message
		System.out.println("Welcome to the Bootcamp Movie DB!");

		while (true)
		{
			System.out.println("Menu");
			System.out.println("1 - Add Actor");
			System.out.println("2 - Add Movie");
			System.out.println("3 - Exit");
			System.out.println();
			
			choice = Console.getString("Command:\t");
			System.out.println();
			
			if(choice.equals("3"))
				break;
			
			switch (choice)
			{
				case "1":
					
					System.out.println("Add an Actor:");
					Actor a = new Actor();
					a = setActor(a);
					System.out.println();
					System.out.println("Actor Summary");
					System.out.println(a.displaySummary());
					System.out.println();
					break;
				case "2":
					System.out.println("Add a Movie:");
					Movie m = new Movie();
					m = setMovie(m);
					System.out.println();
					System.out.println("Movie Summary");
					System.out.println(m.displaySummary());
					System.out.println();
					break;
				default:
					System.out.println("That is not a valid menu action.");
					break;
			}
		}
		
		System.out.println("Good bye");
		kb.close();
	}
	
	private static Actor setActor(Actor a)
	{
		a.setFirstName(Console.getString("First Name?\t"));
		a.setLastName(Console.getString("Last Name?\t"));
		a.setGender(Console.getString("Gender?\t"));
		a.setBirthdate(Console.getString("Birthdate? (YYYY-MM-DD)\t"));
		
		return a;
	}
	
	private static Movie setMovie(Movie m) 
	{
		m.setTitle(Console.getString("Title?\t"));
		m.setYear(Console.getString("Year?\t"));
		m.setRating(Console.getString("Rating?\t"));
		m.setGenre(Console.getString("Genre?\t"));
		
		return m;
	}

}
