
public class ProjectManagerApp 
{
	public static void main(String[] args) 
			throws CloneNotSupportedException
	{
		System.out.println("Yo.");
		
		Product p = new Product("java", "Murach's Java", 57.50);
		System.out.println(p);
		p.print();
		Employee e = new Employee("Jonathan", "Pyrak", "484-34-5214", 3);
		printMultiple(p, 5);
		printMultiple(e, 3);
		
		// p. 317 - clone some products - no way to do this now
		Product p1 = new Product("java", "Murach's Java", 57.50);
		
		Product p2 = (Product)p1.clone();
		p1.print();
		p2.print();
		
		System.out.println("Farewell traveler.");
	}
	
	private static void printMultiple(Printable p, int count)
	{
		for (int i = 0; i < count; i++)
		{
			p.print();
		}
	}
}
