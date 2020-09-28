import java.util.Scanner;

public class ScanMeApp {

	public static void main(String[] args) 
	{
		System.out.println("Enter 3 ints separated by a space. Jerk.");
		Scanner kb = new Scanner(System.in);
		int n1 = kb.nextInt();
		int n2 = kb.nextInt();
		int n3 = kb.nextInt();
		
		System.out.println("Sum of all #'s: " + (n1+n2+n3));
	}

}
