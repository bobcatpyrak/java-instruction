import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;


import ui.console.Console;

public class BMDBApp 
{

	private static DAO<Actor> actorDAO = new ActorTextFile();

	public static void main(String[] args) 
	{
		createDir();
		
		int actorId = actorDAO.getAll().size() + 1;
		int movieId = 1;
		Scanner kb = new Scanner(System.in);
		String choice = "";
		ArrayList<Movie> movies = new ArrayList<>();
		
		// Welcome message
		System.out.println("Welcome to the Bootcamp Movie DB!");

		while (true)
		{
			List<Actor> actors = actorDAO.getAll();

			System.out.println("\nMenu");
			System.out.println("1 - Add Actor");
			System.out.println("2 - Add Movie");
			System.out.println("3 - List Actors");
			System.out.println("4 - Find Actor");
			System.out.println("5 - List Movies");
			System.out.println("6 - Find Movie");
			System.out.println("7 - Exit");
			System.out.println();
			
			choice = Console.getString("Command:\t");
			System.out.println();
			
			if(choice.equals("7"))
				break;
			
			switch (choice)
			{
				case "1":
					
					System.out.println("Add an Actor:");
					Actor a = new Actor();
					a = setActor(a);
					a.setId(actorId);
					actorId++;
					actorDAO.add(a);
					System.out.println();
					System.out.println("Actor Summary");
					System.out.println(a.displaySummary());
					System.out.println();
					break;
				case "2":
					System.out.println("Add a Movie:");
					Movie m = new Movie();
					m = setMovie(m);
					m.setId(movieId);
					movieId++;
					movies.add(m);
					System.out.println();
					System.out.println("Movie Summary");
					System.out.println(m.displaySummary());
					System.out.println();
					break;
				case "3":
					if(actors.size() == 0)
						System.out.println("There have been no actors added yet.");
					for (Actor act : actors)
					{
						System.out.println(act.displaySummary());
					}
					break;
				case "4":
					if (actors.size() > 0)
						System.out.println(actors.get((Console.getInt("Enter ID of actor: ", 1, actors.size()) - 1)).displaySummary());
					else
						System.out.println("There have been no actors added yet.");
					break;
				case "5":
					if(movies.size() == 0)
						System.out.println("There have been no movies added yet.");
					for (Movie mov : movies)
					{
						System.out.println(mov.displaySummary());
					}
					break;	
				case "6":
					if (movies.size() > 0)
						System.out.println(movies.get((Console.getInt("Enter ID of movie: ", 1, movies.size()) - 1)).displaySummary());
					else
						System.out.println("There have been no movies added yet.");
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

	private static void createDir()
	{
		// Creates a folder for sheets if doesn't exist
		String dirString = "c:/repos/java-instruction/BMDB-ch04/.dat";
		Path dirPath = Paths.get(dirString);
		if (Files.notExists(dirPath))
			try 
			{
				Files.createDirectories(dirPath);
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		
		// Creates a save file if doesn't exist
		String fileString = "actors-list.txt";
		Path filePath = Paths.get(dirString, fileString);
		if (Files.notExists(filePath))
			try {
				Files.createFile(filePath);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
	}
}
