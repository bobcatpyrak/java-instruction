import java.util.Scanner; 

public class StringsApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String name = "Bob";
		GetName(name, kb);
/*		boolean repeat = true;
		while (repeat)
		{
			System.out.println("Hi. My name is " + name + "! Do you like my name? (y/n)");
			
			String response = kb.nextLine();
			if (response.equals("y"))
			{
				System.out.println("Thanks!");
				repeat = false;
			}
			else if (response.equals("n"))
			{
				System.out.println("Oh. What should my name be, then?");
				name = kb.nextLine();
			}
			else
				System.out.println("I asked for y or n. Jeez. Can't you follow instructions?");
		}
*/
	}
	
	public static void GetName(String name, Scanner kb)
	{
		System.out.println("Hi. My name is " + name + "! Do you like my name? (y/n)");
		
		String response = kb.nextLine();
		if (response.equals("y"))
		{
			System.out.println("Thanks!");
			//repeat = false;
		}
		else if (response.equals("n"))
		{
			System.out.println("Oh. What should my name be, then?");
			name = kb.nextLine();
			GetName(name, kb);
		}
		else
		{
			System.out.println("I asked for y or n. Jeez. Can't you follow instructions?");
			GetName(name, kb);
		}
	}

}
