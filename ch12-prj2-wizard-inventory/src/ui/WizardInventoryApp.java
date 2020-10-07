package ui;

import java.util.ArrayList;

import ui.console.Console;

public class WizardInventoryApp {

	public static void main(String[] args) 
	{
		System.out.println("Welcome to the Wizard Inventory Game\n");
		
		System.out.println("COMMAND MENU\r\n" + 
				"show - Show all items\r\n" + 
				"grab - Grab an item\r\n" + 
				"edit - Edit an item\r\n" + 
				"drop - Drop an item\r\n" + 
				"exit - Exit program");
		
		ArrayList<String> inventory = new ArrayList<>(4);
		inventory.add("Wand");
		inventory.add("Purse");
		inventory.add("Guitar");
		
		boolean loop = true;
		while(loop)
		{
			String command = Console.getChoiceString("\nCommand: ", new String[] {"show", "grab", "edit", "drop", "exit"});
			int index = 1;
			switch(command)
			{
			case "show":
				index = 1;
				for (String s : inventory)
				{
					System.out.println(index + ". " + s);
					index++;
				}
				break;
			case "grab":
				if(inventory.size() < 4)
				{
					String add = Console.getRequiredString("Name: ");
					inventory.add(add);
					System.out.println(add + " was added");
				}
				else
					System.out.println("You can't carry any more items. Drop something first.");
				break;
			case "edit":
				index = Console.getInt("Number: ");
				String edit = Console.getRequiredString("Updated name: ");
				System.out.println("Item number " + index + " was updated to be " + edit);
				index--;
				inventory.set(index, edit);
				break;
			case "drop":
				index = Console.getInt("Number: ") - 1;
				System.out.println(inventory.get(index) + " was dropped");
				inventory.remove(index);
				break;
			case "exit":
				loop = false;
				break;
			}
		}
		
		System.out.println("Bye");
	}

}
