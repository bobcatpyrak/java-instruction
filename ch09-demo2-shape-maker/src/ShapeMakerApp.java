import java.util.Scanner;

import ui.console.Console;

public class ShapeMakerApp 
{

	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Welcome to the Shape Maker!\n\nMake a rectangle\nWidth?: ");
		int width = kb.nextInt();
		System.out.print("Length?: ");
		int length = kb.nextInt();
		
		for(int i = 0; i < length; i++)
		{
			for(int i2 = 0; i2 < width; i2++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
		
		// Octogon
		System.out.println("Make an octogon.");
		length = Console.getInt("Length of a side?");
		
		// Top side
		for(int i = 0; i < length - 1; i++)
		{
			System.out.print(" ");
		}
		for(int top = 0; top < length; top++)
		{
			System.out.print("* ");
		}
		System.out.println("");
		
		// top diags
		for(int count = 0; count < length - 1; count++)
		{
			int corner;
			
			for(corner = length -2 - count; corner%length != 0; corner--)
			{
				System.out.print(" ");
			}
			System.out.print("* ");
			for(corner = length + count; corner > 1; corner--)
			{
				System.out.print("  ");
			}
			System.out.println("*");
		}
		
		// sides
		for(int i = 0; i < length - 1; i++)
		{
			System.out.print("*");
			for(int spaces = 0; spaces < (4 * length) -5; spaces++)
			{
				System.out.print(" ");
			}
			System.out.println("*");
		}
		
		// bottom diags
		for(int count = length - 1; count > 1; count--)
		{
			int corner;
			
			for(corner = count; corner%length != 0; corner++)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			
			// below here doesn't work
			for(corner = (length * 2) + ((count - 2) * 2); corner > 2; corner--)
			{
				System.out.print(" ");
			}
			/*for(int i = count; i > 0; i--)
			{
				System.out.print(" ");
			}*/
			System.out.println(" *");
		}
		
		// Bottom
		for(int i = 0; i < length - 1; i++)
		{
			System.out.print(" ");
		}
		for(int top = 0; top < length; top++)
		{
			System.out.print("* ");
		}
		System.out.println("");
		
		
		System.out.println("Let's try a hexagon.");
		length = Console.getInt("Length of a side?: ");
		
		// Top side
		for(int i = 0; i < length - 1; i++)
		{
			System.out.print(" ");
		}
		for(int top = 0; top < length; top++)
		{
			System.out.print("* ");
		}
		System.out.println("");
		
		// top diags
		for(int count = 0; count < length - 1; count++)
		{
			int corner;
			
			for(corner = length -2 - count; corner%length != 0; corner--)
			{
				System.out.print(" ");
			}
			System.out.print("* ");
			for(corner = length + count; corner > 1; corner--)
			{
				System.out.print("  ");
			}
			System.out.println("*");
		}
		// bottom diags
		for(int count = length - 1; count > 1; count--)
		{
			int corner;
			
			for(corner = count; corner%length != 0; corner++)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			
			// below here doesn't work
			for(corner = (length * 2) + ((count - 2) * 2); corner > 2; corner--)
			{
				System.out.print(" ");
			}
			/*for(int i = count; i > 0; i--)
			{
				System.out.print(" ");
			}*/
			System.out.println(" *");
		}
		
		// Bottom
		for(int i = 0; i < length - 1; i++)
		{
			System.out.print(" ");
		}
		for(int top = 0; top < length; top++)
		{
			System.out.print("* ");
		}
		System.out.println("");
		
		
		// Trapezoid
		System.out.println("Easy. How about a trapezoid?");
		width = Console.getInt("Small side length?: ");
		length = Console.getInt("Large side length?: ", width+1, 500);
		int height = Console.getInt("And how about the height?: ");
		
		// Top side
		for(int i = 0; i < (length - width) / 2; i++)
		{
			System.out.print("  ");
		}
		for(int top = 0; top < width; top++)
		{
			System.out.print("* ");
		}
		System.out.println("");
		
		// top diags
		for(int count = height - 2; count > 0; count--)
		{
			int w = width*2 - 1;
			int l = length*2 - 1;
			double s = (l-w)/2;
			double inc = s/(height);
			int spaces = (int)(count*inc);
			if(inc%1.0 > 0.5)
				spaces++;
			// ok
			for (int i2 = 0; i2 < spaces; i2++)
				{
					System.out.print(" ");
				}
			System.out.print("*");
			
			// good enough		
			for (int count2 = 0; count2 < l - (spaces*2) - 2; count2++)
			{
					System.out.print(" ");
			}
			System.out.println("*");
		}
		
		// Bottom
		for(int top = 0; top < length; top++)
		{
			System.out.print("* ");
		}
		System.out.println("");
	}
}
