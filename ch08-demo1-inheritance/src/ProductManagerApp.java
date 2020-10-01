
public class ProductManagerApp {

	public static void main(String[] args) 
	{
		System.out.println("Hello");
		
		// p. 263 - demonstrate toString() method
		Product p1 = new Product("java", "Murach's Java Programming", 57.50);
		
		System.out.println(p1.toString());
		System.out.println();
		Book b1 = new Book("mysql", "Murach's MySQL", 45.50, "Joel Murach");
		System.out.println(b1.toString());
		System.out.println();
		Software s1 = new Software("eclipse", "STS Eclipse", 0.00, "4.6.1.RELEASE");
		System.out.println(s1.toString());
		System.out.println("Bye");
	}

}
