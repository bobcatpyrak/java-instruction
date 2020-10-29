package ui;

import business.BasicCalculations;
import ui.console.Console;

public class CalculationsApp 
{
	public static void main(String[] args)
	{
		int num = Console.getInt("Give number: ");
		System.out.println("Number squared is " + BasicCalculations.square(num));
		String s = Console.getRequiredString("Give sentence: ");
		System.out.println("Amount of 'a' in sentence: " + BasicCalculations.countA(s));
	}
}
