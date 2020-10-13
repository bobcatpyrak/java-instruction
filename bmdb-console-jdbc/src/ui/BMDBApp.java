package ui;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.*;

import business.Actor;
import business.Movie;
import db.*;
import ui.console.Console;

public class BMDBApp 
{

	private static DAO<Actor> actorDAO = new ActorDB();
	private static DAO<Movie> movieDAO = new MovieDB();

	public static void main(String[] args) 
	{
		// createDir();
		
		Scanner kb = new Scanner(System.in);
		String choice = "";
		
		// Welcome message
		System.out.println("Welcome to the Bootcamp Movie DB!");

		while (true)
		{
			List<Actor> actors = actorDAO.getAll();
			List<Movie> movies = movieDAO.getAll();
			
			System.out.println("\nMenu");
			System.out.println("1 - Add Actor");
			System.out.println("2 - List Actors");
			System.out.println("3 - Find Actor");
			System.out.println("3L - Find Actor by last name");
			System.out.println("4 - Edit Actor");	
			System.out.println("5 - Remove Actor");
			System.out.println("6 - Add Movie");
			System.out.println("7 - List Movies");
			System.out.println("8 - Find Movie");
			System.out.println("9 - Edit Movie");
			System.out.println("10 - Remove Movie");
			System.out.println("11 - Exit");
			System.out.println();
			
			choice = Console.getString("Command:\t");
			System.out.println();
			
			if(choice.equals("11"))
				break;
			
			switch (choice)
			{
				case "1":
					System.out.println("Add an Actor:");
					Actor a = new Actor();
					a = setActor(a);
					actorDAO.add(a);
					System.out.println();
					System.out.println("Actor Summary");
					System.out.println(a.displaySummary());
					System.out.println();
					break;
				case "2":
					if(actors.size() == 0)
						System.out.println("There have been no actors added yet.");
					for (Actor act : actors)
					{
						System.out.println(act.displaySummary());
					}
					break;
				case "3":
					if (actors.size() > 0)
					{
						int findId = Console.getInt("Enter ID of actor: ");
						if (actorDAO.get(findId) != null)
							System.out.println(actorDAO.get(findId).displaySummary());
						else
							System.out.println("Actor not found.");
					}
					else
						System.out.println("There have been no actors added yet.");
					break;
				case "3L":
					if (actors.size() > 0)
					{
						String lastName = Console.getRequiredString("Enter last name of actor: ");
						List<Actor> actorsByLast = ((ActorDB) actorDAO).getByLastName(lastName);
						
						for (Actor j : actorsByLast)
						{
							System.out.println(j.displaySummary());
						}
					}
					else
						System.out.println("There have been no actors added yet.");
					break;
				case "4":
					if (actors.size() > 0)
					{
						int editId = Console.getInt("Enter ID of actor: ");
						
						if (actorDAO.get(editId) != null)
						{
							Actor editActor = actorDAO.get(editId);
							System.out.println(editActor.displaySummary());
							int editChoice = Console.getInt("\nWhich element would you like to change?\n"
									+ "1. First Name\n"
									+ "2. Last Name\n"
									+ "3. Gender\n"
									+ "4. BirthDate\n> ", 1, 4);
							switch(editChoice)
							{
							case 1:
								editActor.setFirstName(Console.getRequiredString("What is the new First Name?: "));
								break;
							case 2:
								editActor.setLastName(Console.getRequiredString("What is the new Last Name?: "));
								break;
							case 3:
								editActor.setGender(Console.getRequiredString("What is the new Gender?: "));
								break;
							case 4:
								editActor.setBirthdate(LocalDate.parse(Console.getRequiredString("What is the new Birth Date?: ")));
								break;
							}
							actorDAO.update(editActor);
							System.out.println(editActor.displaySummary());

						}
						else
							System.out.println("Actor not found");
					}
					else
						System.out.println("There have been no actors added yet.");
					
					break;
				case "5":
					if (actors.size() > 0)
					{
						int deleteId = Console.getInt("Enter ID of actor: ");
						Actor deleted = actorDAO.get(deleteId);
						if (deleted != null)
						{
							actorDAO.delete(deleted);
							System.out.println(deleted.displaySummary() + "\nHas been deleted. :(");
						}
						else
							System.out.println("Actor not found.");
					}
					else
						System.out.println("There have been no actors added yet.");
					break;				
				case "6":
					System.out.println("Add a Movie:");
					Movie m = new Movie();
					m = setMovie(m);
					movieDAO.add(m);
					System.out.println();
					System.out.println("Movie Summary");
					System.out.println(m.displaySummary());
					System.out.println();
					break;
				case "7":
					if(movies.size() == 0)
						System.out.println("There have been no movies added yet.");
					for (Movie mov : movies)
					{
						System.out.println(mov.displaySummary());
					}
					break;	
				case "8":
					if (movies.size() > 0)
					{
						int findId = Console.getInt("Enter ID of movie: ");
						if (movieDAO.get(findId) != null)
							System.out.println(movieDAO.get(findId).displaySummary());
						else
							System.out.println("Movie not found.");
					}
					else
						System.out.println("There have been no movies added yet.");
					break;
				case "9":
					if (movies.size() > 0)
					{
						int editId = Console.getInt("Enter ID of movie: ");
						
						if (movieDAO.get(editId) != null)
						{
							Movie editMovie = movieDAO.get(editId);
							System.out.println(editMovie.displaySummary());
							int editChoice = Console.getInt("\nWhich element would you like to change?\n"
									+ "1. Title\n"
									+ "2. Year\n"
									+ "3. Rating\n"
									+ "4. Director\n> ", 1, 4);
							switch(editChoice)
							{
							case 1:
								editMovie.setTitle(Console.getRequiredString("What is the new Title?: "));
								break;
							case 2:
								editMovie.setYear(Console.getRequiredString("What is the new Year?: "));
								break;
							case 3:
								editMovie.setRating(Console.getRequiredString("What is the new Rating?: "));
								break;
							case 4:
								editMovie.setDirector(Console.getRequiredString("What is the new Director?: "));
								break;
							}
							movieDAO.update(editMovie);
							System.out.println(editMovie.displaySummary());

						}
						else
							System.out.println("Movie not found");
					}
					else
						System.out.println("There have been no movies added yet.");
					
					break;					
				case "10":
					if (movies.size() > 0)
					{
						int deleteId = Console.getInt("Enter ID of movie: ");
						Movie deleted = movieDAO.get(deleteId);
						if (deleted != null)
						{
							movieDAO.delete(deleted);
							System.out.println(deleted.displaySummary() + "\nHas been deleted. :(");
						}
						else
							System.out.println("Movie not found.");
					}
					else
						System.out.println("There have been no movies added yet.");
					break;		
				default:
					System.out.println("That is not a valid menu action.");
					break;
			}
		}
		
		System.out.println("Auf Wiedersehn");
		kb.close();
	}
	
	private static Actor setActor(Actor a)
	{
		a.setFirstName(Console.getString("First Name?\t"));
		a.setLastName(Console.getString("Last Name?\t"));
		a.setGender(Console.getString("Gender?\t"));
		a.setBirthdate(LocalDate.parse(Console.getString("Birthdate? (YYYY-MM-DD)\t")));
		
		return a;
	}
	
	private static Movie setMovie(Movie m) 
	{
		m.setTitle(Console.getString("Title?\t"));
		m.setYear(Console.getString("Year?\t"));
		m.setRating(Console.getString("Rating?\t"));
		m.setDirector(Console.getString("Director?\t"));
		
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
