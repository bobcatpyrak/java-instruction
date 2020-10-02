
public class AreaCalculatorApp 
{

	public static void main(String[] args) 
	{
		System.out.println("Welcome to the Area Calculator");
		
		boolean loop = true;
		
		while(loop)
		{
			String choice = Console.getChoiceString("\nCalculate area of a circle, square or rectangle? (c/s/r): ", "c", "s", "r");
			Shape s;
			
			switch (choice)
			{
			case "c":
			case "C":
				double radius = Console.getDouble("\nEnter radius: ");
				s = new Circle(radius);
				System.out.println("\nThe area of the Circle you entered is: " + s.getArea());
				break;
			case "s":
			case "S":
				double width = Console.getDouble("\nEnter length of a side: ");
				s = new Square(width);
				System.out.println("\nThe area of the Square you entered is: " + s.getArea());
				break;
			case "r":
			case "R":
				double w = Console.getDouble("\nEnter width: ");
				double h = Console.getDouble("Enter height: ");
				s = new Rectangle(w, h);
				System.out.println("\nThe area of the Rectangle you entered is: " + s.getArea());
				break;
			default:
				break;
			}
			
			if(Console.getChoiceString("\nContinue? (y/n): ", "y", "n").equalsIgnoreCase("n"))
				loop = false;
		}
		
		System.out.println("Bye");
	}

}
