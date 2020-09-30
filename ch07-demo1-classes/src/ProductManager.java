
public class ProductManager 
{

	public static void main(String[] args) 
	{
		Product p1 = new Product();
		printProductData(p1);
		p1.setCode("Java");
		p1.setDescription("Murach's Java Programming");
		p1.setPrice(59.5);
		printProductData(p1);
		
		Product p2 = new Product("mysql", "Murach's MySQL", 54.50);
		printProductData(p2);
		
		System.out.println(p1);
		System.out.println(p2);
		
		System.out.println("Bye");
	}
	
	private static void printProductData(Product p)
	{
		System.out.println("Product data: ");
		System.out.println(p.getCode());
		System.out.println(p.getDescription());
		System.out.println(p.getPriceFormatted());
	}




	

}
