package ui;

import ui.console.Console;

public class ConsoleLibraryDemoApp {

	public static void main(String[] args) {
		System.out.println("Hello.");
		int a = Console.getInt("First number.");
		int b = Console.getInt("Second number.");
		System.out.println(a+b);
		System.out.println("Bye.");
	}

}
