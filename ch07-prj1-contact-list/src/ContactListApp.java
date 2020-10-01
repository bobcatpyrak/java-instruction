
public class ContactListApp 
{

	public static void main(String[] args) 
	{		
		System.out.println("Welcome to the Contact List Application");
		System.out.println();
		
		newContact();
		
		System.out.println("Bye");
	}
	
	private static void newContact()
	{
		Contact c = new Contact();
		
		c.newContact();
		System.out.println(c.displayContact());
		System.out.println();
		if(Console.getString("Continue? (y/n): ").equalsIgnoreCase("y"))
		{
			System.out.println();
			newContact();
		}
		else
			System.out.println();		
	}

}
