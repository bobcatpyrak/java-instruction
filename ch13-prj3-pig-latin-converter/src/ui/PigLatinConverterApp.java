package ui;

import java.util.ArrayList;

import ui.console.Console;

public class PigLatinConverterApp 
{

	public static void main(String[] args) 
	{
		System.out.println("Pig Latin Translator");
		
		StringBuilder line = new StringBuilder(Console.getRequiredString("Enter a line: "));
		convert(line);
	}

	public static void convert(StringBuilder line)
	{
		String[] words = parse(line);
		
		for (int i = 0; i < words.length; i++)
		{
			words[i] = translate(words[i]);
		}
		
		for (String word: words)
			System.out.print(word + " ");
	}
	
	public static String[] parse(StringBuilder line)
	{
		return line.toString().split(" ");
	}
	
	public static String translate(String word)
	{
		String[] vowels = new String[] {"a", "e", "i", "o", "u", "y"};
		
		word = removeEndPunctuation(word);
		if (specialCharsPresent(word))
			return word;
		word = word.toLowerCase();

		for (String vowel : vowels)
		{
			if (word.startsWith(vowel) && !vowel.equals("y"))
			{
				word += "way";
				return word;
			}
		}
		
		int i = 0;
		for (boolean check = true; check; i++)
		{			
			for (String vowel : vowels)
			{
				if (vowel.equals(Character.toString(word.charAt(i))) && !(i == 0 && vowel.equals("y")))
					check = !check;
			}
		}
		word = word.substring(i-1) + word.substring(0, i-1) + "ay";
		
		
		return word;
	}
	
	private static String removeEndPunctuation(String word)
	{
		boolean punctuationPresent = true;
		
		if(Character.isAlphabetic((word.charAt(word.length()-1))))
				return word;
		
		if (punctuationPresent)
		{
			word = word.substring(0, word.length()-1);
			word = removeEndPunctuation(word);
		}
		
		return word;
	}
	
	private static boolean specialCharsPresent(String word)
	{
		boolean special = false;
		

		word = word.substring(0,  word.length()-1);
		char[] letters = word.toCharArray();
		for(char letter : letters)
		{
			if (!(Character.isAlphabetic(letter) || letter == '\''))
				special = true;
					
		}
		return special;
	}
}
