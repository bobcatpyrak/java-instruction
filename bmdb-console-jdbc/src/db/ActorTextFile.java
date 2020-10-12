package db;

import java.io.*;
import java.nio.file.*;
import java.time.LocalDate;
import java.util.*;

import business.Actor;


public class ActorTextFile implements DAO<Actor> 
{
	private List<Actor> actors = null;
	private Path sheetsPath = null;
	private File sheetsFile = null;
	private final String FIELD_SEP = "\t";
	
	public ActorTextFile()
	{
		
		sheetsPath = Paths.get("c:/repos/java-instruction/BMDB-ch04/.dat/actors-list.txt");
		sheetsFile = sheetsPath.toFile();
		actors = getAll();
	}
	@Override
	public Actor get(int id) 
	{
		return actors.get(id);
	}

	@Override
	public List<Actor> getAll() 
	{	
		if(actors != null)
			return actors;
		
		actors = new ArrayList<>();
		if(Files.exists(sheetsPath))
		{
			try (BufferedReader in = new BufferedReader(new FileReader(sheetsFile)))
			{
				String line = in.readLine();
				while (line != null)
				{
					String[] fields = line.split(FIELD_SEP);
					Actor cs = new Actor();
					cs.setId(Integer.parseInt(fields[0]));
					cs.setFirstName(fields[1]);
					cs.setLastName(fields[2]);
					cs.setGender(fields[3]);
					cs.setBirthdate(LocalDate.parse(fields[4]));
					actors.add(cs);
					line = in.readLine();
				}
				return actors;
			}
			catch(IOException ioe)
			{
				System.out.println(ioe);
				return null;
			}
		}	
		else
		{
			System.out.println(sheetsPath + " is empty.");
			return null;
		}
	}

	@Override
	public boolean add(Actor t) 
	{
		actors.add(t);
		return saveAll();
	}

	@Override
	public boolean update(Actor t) 
	{
		int index = t.getId();
		actors.remove(index);
		actors.add(index, t);
		return saveAll();
	}

	@Override
	public boolean delete(Actor t) 
	{
		actors.remove(t);
		return saveAll();
	}

	private boolean saveAll()
	{
		try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(sheetsFile))))
		{
			for (Actor cs : actors)
			{
				out.println(cs.getId() + FIELD_SEP + cs.getFirstName() + FIELD_SEP + cs.getLastName() + FIELD_SEP + cs.getGender() + FIELD_SEP + cs.getBirthdate());
			}
			return true;
		}
		catch(IOException ioe)
		{
			System.out.println(ioe);
			System.out.println("Failed to save.");
			return false;
		}
	}
}
