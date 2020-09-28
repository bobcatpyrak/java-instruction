import java.util.Scanner;

public class IfStatementApp 
{

	public static void main(String[] args) 
	{
		// p. 124
		String color = "red";
//		if (color == "red"); Don't do this
		
		if (color.equalsIgnoreCase("red"))
		{
			System.out.println("Color is red");
			System.out.println("Hey there"); // part of if statement
		}
		
		if (color.equalsIgnoreCase("red"))
			System.out.println("Color is " + color);
		System.out.println("Hello"); // not part of if statement
		
		int total = 100;
		
		if (total == 50)
			System.out.println("Total is 50");
		else if (total > 50)
			System.out.println("Total is greater than 50");
		else if (total < 50)
			System.out.println("Total is less than 50");
		else
			System.out.println("Total is null, I guess");
		
		if (total >= 75)
			System.out.println("Total is greater than or equal to 75");
		else if (total <= 75)
			System.out.println("Total is less than or equal to 75");
		
		if (total != 0)
			System.out.println("total isn't 0");
		
		int distanceFromLight = 30; // yards from stoplight
		if (color.equalsIgnoreCase("red"))
			System.out.println("Light is red... STOP");
		else if (color.equalsIgnoreCase("green"))
			System.out.println("Light is green... GO");
		/*else if (color.equalsIgnoreCase("yellow") && distanceFromLight > 30)
			System.out.println("Light is yellow and far... slow down");
		else if (color.equalsIgnoreCase("yellow") && distanceFromLight <= 30)
			System.out.println("Light is yellow and close... floor it");*/
		else if (color.equalsIgnoreCase("yellow"))
		{
			if (distanceFromLight > 30)
				System.out.println("Light is yellow and far... slow down");
			else
				System.out.println("Light is yellow and close... floor it");
		}
		else
			System.out.println("Error: invalid light color");
		
		
		// || condition
		int faveNum = 10;
		if (faveNum == 10 || faveNum == 11)
			System.out.println("Favorite Number is either 10 or 11");
		else
			System.out.println("Favorite number is not 10 nor 11");
		
		// pg. 124 block scope
		// we want to add 2 numbers if faveNum is 10
		int n1 = 0;
		int n2 = 0;
		if (faveNum == 10)
		{
			Scanner kb = new Scanner(System.in);
			System.out.println("Enter 2 numbers on one line:");
			n1 = kb.nextInt();
			n2 = kb.nextInt();
	
			kb.close();
		}
		int sum = n1+n2;
		System.out.println("sum = " + sum);
	
		
		
		
		
	}

}
