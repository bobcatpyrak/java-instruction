import java.util.Scanner;

public class GradeConverterApp 
{

	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Welcome to the Letter Grade Converter");
		
		int grade = 0;
		String loop = "y";
		while (loop.equalsIgnoreCase("y"))
		{
			System.out.print("Enter numerical grade: ");
			grade = kb.nextInt();
			
			if(grade >= 88)
				System.out.println("Letter grade: A");
			else if(grade >= 80)
				System.out.println("Letter grade: B");
			else if(grade >= 67)
				System.out.println("Letter grade: C");
			else if(grade >= 60)
				System.out.println("Letter grade: D");
			else
				System.out.println("Letter grade: F");
			
			System.out.print("Continue? (y/n): ");
			loop = kb.next();
		}
		
		System.out.println("Good bye.");
		kb.close();
	}

}
