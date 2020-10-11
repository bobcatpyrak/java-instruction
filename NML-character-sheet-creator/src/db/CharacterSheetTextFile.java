package db;

import java.io.*;
import java.nio.file.*;
import java.util.*;

import business.CharacterSheet;

public class CharacterSheetTextFile implements DAO<CharacterSheet> 
{
	private List<CharacterSheet> sheets = null;
	private Path sheetsPath = null;
	private File sheetsFile = null;
	private final String FIELD_SEP = "\t";
	
	public CharacterSheetTextFile()
	{
		String dirString = "c:/Users/Max-Student/Documents/NMLCharacterSheets";

		
		sheetsPath = Paths.get("c:/Users/Max-Student/Documents/NMLCharacterSheets/NMLCharacterSheets.txt");
		sheetsFile = sheetsPath.toFile();
		sheets = getAll();
	}
	@Override
	public CharacterSheet get(int id) 
	{
		return sheets.get(id);
	}

	@Override
	public List<CharacterSheet> getAll() 
	{	
		if(sheets != null)
			return sheets;
		
		sheets = new ArrayList<>();
		if(Files.exists(sheetsPath))
		{
			try (BufferedReader in = new BufferedReader(new FileReader(sheetsFile)))
			{
				String line = in.readLine();
				while (line != null)
				{
					String[] fields = line.split(FIELD_SEP);
					CharacterSheet cs = new CharacterSheet(Integer.parseInt(fields[0]));
					cs.setName(fields[1]);
					cs.setAllStats(fields[2]);
					sheets.add(cs);
					line = in.readLine();
				}
				return sheets;
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
	public boolean add(CharacterSheet t) 
	{
		sheets.add(t);
		return saveAll();
	}

	@Override
	public boolean update(CharacterSheet t) 
	{
		int index = t.getId();
		sheets.remove(index);
		sheets.add(index, t);
		return saveAll();
	}

	@Override
	public boolean delete(CharacterSheet t) 
	{
		sheets.remove(t);
		return saveAll();
	}

	private boolean saveAll()
	{
		try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(sheetsFile))))
		{
			for (CharacterSheet cs : sheets)
			{
				out.println(cs.getId() + FIELD_SEP + cs.getName() + FIELD_SEP + cs.getAllStats());
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
