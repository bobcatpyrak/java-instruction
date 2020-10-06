package ui;

import java.util.Arrays;

import business.Product;
import ui.console.Console;

public class ArrayDemoApp 
{
	static Product[] products;

	public static void main(String[] args) 
	{
		System.out.println("hello");

		// array of 5 ints
		int[] numbers = new int[5];
		numbers[0] = 5;
		numbers[1] = 15;
		numbers[2] = 25;
		numbers[3] = 45;
		numbers[4] = 65;
		
		for(int i=0; i < numbers.length; i++)
		{
			System.out.println(numbers[i]);
		}
		
		int[] randNums = new int[100];
		for (int i=0; i < randNums.length; i++)
		{
			int r = (int)(Math.random()*100)+1;
			randNums[i] = r;
		}
		
		for(int i = 0; i < randNums.length; i++)
		{
			if (i%10 == 0)
				System.out.println(randNums[i]);
			else
				System.out.print(randNums[i] + " ");
		}
		
		String[] names = {"Sean", "Jack", "Jonathan", "Ommaimah", "Marc", "Kali", "Tanya", "Hung"};
		
		for (int i = 0; i < names.length; i++)
		{
			System.out.println(i+names[i]);
		}

		Arrays.sort(names);
		
		for (String name: names)
		{
			System.out.println(name);
		}
		
		System.out.println(names[0]);

		Product p = new Product("java", "Murach's Java book", 54.57);
		Product p2 = new Product("mysql", "MySQL book", 53.68);
		Product p3 = new Product("hp01", "Harry Potter and the Sorceror's Stone", 12.99);
		
		products = new Product[3];
		products[0] = p2;
		products[1] = p;
		products[2] = p3;
		
		for (Product prod : products)
			System.out.println(prod);
		
		System.out.println("Sorting...");
		Arrays.sort(products);
		for (Product prod : products)
			System.out.println(prod);
		
		String code = "";
		while (!code.equalsIgnoreCase("x"))
		{
			System.out.println("Search for a product!");
			code = Console.getString("Enter code: ");
			System.out.println(getProduct(code));
		}
		
		System.out.println("bye");
	}
	
	private static Product getProduct(String code)
	{
		Product p = null;
		
		for(Product prod : products)
		{
			if(code.equals(prod.getCode()))
				p = prod;
		}
		
		return p;
	}
}
