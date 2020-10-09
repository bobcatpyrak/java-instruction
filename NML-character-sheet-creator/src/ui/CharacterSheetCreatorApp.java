package ui;


import java.io.*;
import java.nio.file.*;
import java.util.*;

import business.*;
import db.*;
import ui.console.Console;

public class CharacterSheetCreatorApp 
{

	private static DAO<CharacterSheet> sheetDAO = new CharacterSheetTextFile();

	public static void main(String[] args)
	{
		createDir();
		
		System.out.println("DCRPG Character Stats Builder");

		// START LOOP HERE
		boolean loop = true;
		while(loop)
		{
			List<CharacterSheet> sheets = sheetDAO.getAll();
			int nextId = sheets.size();
			
			System.out.println("\nMENU\n"
					+ "1. View all characters"
					+ "2. View a single character's stats"
					+ "3. Add a character"
					+ "4. Edit a character"
					+ "5. Remove a character"
					+ "6. Give up. Quit.");
			
			int choice = Console.getInt("\n> ", 1, 6);
			
			switch(choice)
			{
			case 1:
				System.out.println();
				int column = 0;
				for(CharacterSheet sheet : sheets)
				{
					System.out.print(sheet.getId() + StringUtil.pad(".", 5) + StringUtil.pad(sheet.getName(), 20));
					column++;
					if(column % 5 == 0)
						System.out.println();
				}
				break;
			case 2:
				displayStats(sheets.get(Console.getInt("\n> Display stats of which character? ", 0, sheets.size())));
				break;
			case 3:
				if(sheetDAO.add(addCharacter(nextId)))
					System.out.println(sheetDAO.get(nextId).getName() + " has been successfully added.");
				else
					System.out.println("Error.");
				break;
			case 4:
				int editId = Console.getInt("\n> Edit which character? ", 0, sheets.size());
				
				if(sheetDAO.delete(sheetDAO.get(editId)))
				{
					if(sheetDAO.add(addCharacter(editId)))
						System.out.println(sheetDAO.get(editId).getName() + " has been successfully edited.");
					else
						System.out.println("Error.");
				}
				else
					System.out.println("Error.");
				break;
			case 5:
				if(sheetDAO.delete(sheetDAO.get(Console.getInt("\n> Delete which character? ", 0, sheets.size()))))
					System.out.println("Success.");
				else
					System.out.println("Error.");
				break;
			case 6:
				System.out.println("Program OVER.");
				loop = false;
				break;
			}
		}
		
		System.out.println("bye");
	}
	
	private static CharacterSheet addCharacter(int nextId)
	{
		CharacterSheet c = new CharacterSheet(nextId);
		c.setName(Console.getRequiredString("Name?: "));
		c.setReflexes(Console.getInt("Reflexes: ", 0, 10));
			c.setAcrobatics(Console.getInt("Acrobatics: ", 0, 10));
		/*	c.setDodge(Console.getInt("Dodge: ", 0, 10));
			c.setHandToHand(Console.getInt("Hand-to-Hand: ", 0, 10));
			c.setMeleeWeapons(Console.getInt("Melee Weapons: ", 0, 10));
			c.setStealth(Console.getInt("Stealth: ", 0, 10));
		c.setCoordination(Console.getInt("Coordination: ", 0, 10));
			c.setCatching(Console.getInt("Catch: ", 0, 10));
			c.setClimb(Console.getInt("Climb: ", 0, 10));
			c.setDrive(Console.getInt("Drive: ", 0, 10));
			c.setMarksmanship(Console.getInt("Marksmanship: ", 0, 10));
			c.setThievery(Console.getInt("Thievery: ", 0, 10));
			c.setThrownWeapons(Console.getInt("Thrown Weapons: ", 0, 10));
		c.setPhysique(Console.getInt("Physique: ", 0, 10));
			c.setAthletics(Console.getInt("Athletics: ", 0, 10));
			c.setLeap(Console.getInt("Leap: ", 0, 10));
			c.setLifting(Console.getInt("Lifting: ", 0, 10));
			c.setResistance(Console.getInt("Resistance: ", 0, 10));
			c.setRunning(Console.getInt("Running: ", 0, 10));
			c.setSwimming(Console.getInt("Swimming: ", 0, 10));
		c.setKnowledge(Console.getInt("Knowledge: ", 0, 10));
			c.setArcaneLore(Console.getInt("Arcane Lore: ", 0, 10));
			c.setDemolitions(Console.getInt("Demolitions: ", 0, 10));
			c.setLanguages(Console.getInt("Languages: ", 0, 10));
			c.setMedicine(Console.getInt("Medicine: ", 0, 10));
			c.setScholar(Console.getInt("Scholar: ", 0, 10));
			c.setScience(Console.getInt("Science: ", 0, 10));
			c.setSecurity(Console.getInt("Security: ", 0, 10));
		c.setPerception(Console.getInt("Perception: ", 0, 10));
			c.setArtist(Console.getInt("Artist: ", 0, 10));
			c.setEngineering(Console.getInt("Engineering: ", 0, 10));
			c.setSearch(Console.getInt("Search: ", 0, 10));
			c.setStreetwise(Console.getInt("Streetwise: ", 0, 10));
			c.setSurveillance(Console.getInt("Surveillance: ", 0, 10));
			c.setSurvival(Console.getInt("Survival: ", 0, 10));
		c.setPresence(Console.getInt("Presence: ", 0, 10));
			c.setBluff(Console.getInt("Bluff: ", 0, 10));
			c.setCharm(Console.getInt("Charm: ", 0, 10));
			c.setIntimidation(Console.getInt("Intimidation: ", 0, 10));
			c.setPersuasion(Console.getInt("Persuasion: ", 0, 10));
			c.setWillpower(Console.getInt("Willpower: ", 0, 10));*/
			
		return c;
	}
	
	private static void displayStats(CharacterSheet c)
	{
		System.out.println("---------------------------------------------------\n"
						 + "|Name: " + c.getName() + "\n"
						 + "---------------------------------------------------\n"
						 + "|Reflexes:\t\t" + c.getReflexes() + " | Coordination:\t" + c.getCoordination() + " | Physique:\t\t" + c.getPhysique() + " |\n"
						 + "|Acrobatics: " + c.getAcrobatics() + "\t\t" + (c.getReflexes()+c.getAcrobatics()) + " | Catch: " + c.getCatching() + "\t\t" + (c.getCoordination()+c.getCatching()) + " | Athletics: " + c.getAcrobatics() + "\t" + (c.getPhysique()+c.getAthletics()) + " |\n"
						 + "|Dodge: " + c.getDodge() + "\t\t" + (c.getReflexes()+c.getAcrobatics()) + " | Climb: " + c.getClimb() + "\t\t" + (c.getCoordination()+c.getClimb()) + " | Athletics: " + c.getAcrobatics() + "\t" + (c.getPhysique()+c.getAthletics()) + " |\n"
						 + "|Hand-to-Hand: " + c.getHandToHand() + "\t" + (c.getReflexes()+c.getAcrobatics()) + " | Drive: " + c.getDrive() + "\t\t" + (c.getCoordination()+c.getDrive()) + " | Athletics: " + c.getAcrobatics() + "\t" + (c.getPhysique()+c.getAthletics()) + " |\n"
						 + "|Melee Weapons: " + c.getMeleeWeapons() + "\t" + (c.getReflexes()+c.getAcrobatics()) + " | Marksmanship: " + c.getMarksmanship() + "\t" + (c.getCoordination()+c.getMarksmanship()) + " | Athletics: " + c.getAcrobatics() + "\t" + (c.getPhysique()+c.getAthletics()) + " |\n"
						 + "|Stealth: " + c.getStealth() + "\t\t" + (c.getReflexes()+c.getAcrobatics()) + " | Thievery: " + c.getThievery() + "\t\t" + (c.getCoordination()+c.getThievery()) + " | Athletics: " + c.getAcrobatics() + "\t" + (c.getPhysique()+c.getAthletics()) + " |\n"
						 + "|\t\t\t  | Thrown Weapons: " + c.getThrownWeapons() + "\t" + (c.getCoordination()+c.getThrownWeapons()) + " | Athletics: " + c.getAcrobatics() + "\t" + (c.getPhysique()+c.getAthletics()) + " |\n"

				);

	}
	
	private static void createDir()
	{
		// Creates a folder for sheets if doesn't exist
		String dirString = "c:/Users/Max-Student/Documents/NMLCharacterSheets";
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
		String fileString = "NMLCharacterSheets.txt";
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
