import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter your first number!");
		int number1 = kb.nextInt();
		System.out.println("Enter your second number!");
		int number2 = kb.nextInt();
		
		System.out.println("Sum of " + number1 + " + " + number2 + " = " + (number1 + number2) + "!");
		System.out.println("Difference of " + number1 + " - " + number2 + " = " + (number1 - number2) + "!");
		System.out.println("Product of " + number1 + " * " + number2 + " = " + (number1 * number2) + "!");
		System.out.println("Quotient of " + number1 + " / " + number2 + " = " + ((double)number1 / (double)number2) + "!");
		
		System.out.println("");
		System.out.println("That's all... for now.");
	}

}
