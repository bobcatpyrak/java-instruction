package ui;
import business.StackCalculator;
import ui.console.Console;

public class StackCalculatorApp 
{

	public static void main(String[] args) 
	{
		System.out.println("Welcome to the Stack Calculator");
		
		StackCalculator calc = new StackCalculator();
		System.out.println("\nCommands: push n, add, sub, mult, div, clear, or quit");
		
		String input = Console.getChoiceString("stack> ", new String[] {"add", "sub", "mult", "div", "clear", "quit"});
		
	}

}
