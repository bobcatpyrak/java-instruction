import java.util.Scanner;

public class RegistrationApp 
{

	public static void main(String[] args) 
	{
		System.out.println("Student Registration Form");

		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter first name: ");
		String first = kb.next();
		System.out.print("Enter last name: ");
		String last = kb.next();
		System.out.print("Enter year of birth: ");
		String year = kb.next();
		String password = (first+"*"+year);
		
		System.out.println("Welcome " + first + " " + last + "!");
		System.out.println("Your registration is complete.");
		System.out.println("Your temporary password is: " + password);
	}

}
