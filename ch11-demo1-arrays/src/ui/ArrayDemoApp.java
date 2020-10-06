package ui;

import java.util.Arrays;

import business.Product;

public class ArrayDemoApp 
{

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
		
		Product[] products = new Product[2];
		products[0] = p2;
		products[1] = p;
		
		for (Product prod : products)
			System.out.println(prod);
		
		System.out.println("Sorting...");
		Arrays.sort(products);
		for (Product prod : products)
			System.out.println(prod);
		
		System.out.println("bye");
	}

}
