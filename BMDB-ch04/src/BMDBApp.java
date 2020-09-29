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
			
			System.out.print("Command:\t");
			choice = kb.next();
			System.out.println();
			
			if(choice.equals("3"))
				break;
			
			switch (choice)
			{
				case "1":
					System.out.println("Add an Actor:");
					System.out.print("First Name?\t");
					String firstName = kb.next();
					System.out.print("Last Name?\t");
					String lastName = kb.next();
					System.out.print("Gender?\t");
					String gender = kb.next();
					System.out.println("TEST");
					System.out.print("Birthdate? (YYYY-MM-DD)\t");
					String birthdate = kb.next();
					System.out.println();
					System.out.println("Actor Summary");
					System.out.println(firstName + " " + lastName + ", " + gender + ", born " + birthdate);
					System.out.println();
					break;
				case "2":
					System.out.println("Add a Movie:");
					System.out.print("Title?\t");
					String title = kb.next();
					System.out.print("Year?\t");
					String year = kb.next();
					System.out.print("Rating?\t");
					String rating = kb.next();
					System.out.print("Genre?\t");
					String genre = kb.next();
					System.out.println();
					System.out.println("Movie Summary");
					System.out.println(title + " (" + rating + ") was released in " + year + ". Genre(s): " + genre);
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

}
