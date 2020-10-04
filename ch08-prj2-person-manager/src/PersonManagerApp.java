
public class PersonManagerApp {

	public static void main(String[] args) 
	{
		System.out.println("Welcome to the Person Manager");
		
		while(true)
		{
			String choice = "";
//			System.out.println("Create customer or employee? (c/e): ");
			choice = Console.getChoiceString("\nCreate customer or employee? (c/e): ", "c", "e");
			System.out.println();
			Person p = new Person();
			
			switch(choice)
			{
			case "c":
			case "C":
				Customer c = new Customer();
				p = c;
				p = addName(p);			
				// c = (Customer)p;
				c = addCustomer(c);
				// p = c;
				System.out.println("\nYou entered a new Customer:");
				break;
			case "e":
			case "E":
				Employee e = new Employee();
				p = e;
				p = addName(p);
				//e = (Employee)p;
				e = addEmployee(e);
				//p = e;
				System.out.println("\nYou entered a new Employee:");
				break;
			}
			System.out.println(p.toString() + "\n");
			
			if(!Console.getChoiceString("Continue? (y/n): ", "y", "n").equalsIgnoreCase("Y"))
				break;
		}
		
		System.out.println("Bye");
	}

	public static Person addName(Person p)
	{
		p.setFirstName(Console.getRequiredString("First name: "));
		p.setLastName(Console.getRequiredString("Last name: "));
		
		return p;
	}
	
	public static Customer addCustomer(Customer c)
	{
		c.setNumber(Console.getRequiredString("Customer Number: "));
		
		return c;
	}
	
	public static Employee addEmployee(Employee e)
	{
		e.setSsn(Console.getRequiredString("SSN: "));
		
		return e;
	}
}
