package ui;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import business.*;
import db.*;
import ui.console.Console;

public class ProductManagerApp 
{
	
	
	private static DAO<Product> productDAO = new ProductTextFile();

	public static void main(String[] args) throws IOException 
	{
		initiate();
		
		System.out.println("Welcome to the Product Manager");
		int command = 0;
		while(command != 9)
		{
			System.out.println("\nMENU");
			System.out.println("1 - list products");
			System.out.println("2 - add product");
			System.out.println("9 - exit");
			command = Console.getInt("\nCommand?: ", 1, 9);
			
			switch(command){
			case 1:
				// list all products
				List<Product> products = productDAO.getAll();
				for (Product p : products)
					System.out.println(p);
				System.out.println();
				break;
			case 2:
				// add a product
				System.out.println("Adding a product...");
				String code = Console.getRequiredString("Enter code: ");
				String description = Console.getRequiredString("Enter description: ");
				double price = Console.getDouble("Enter price: ");
				Product p = new Product(code, description, price);
				if(productDAO.add(p))
					System.out.println("Product added successfully.");
				else
					System.out.println("oops");
				System.out.println();
			default:
				continue;
			}
		}
	}

	private static void initiate() throws IOException
	{
		// Create a directory 'temp' if it does not exist
		String dirString = "c:/repos/java-instruction/product-manager";
		Path dirPath = Paths.get(dirString);
		if (Files.notExists(dirPath))
		{
			Files.createDirectories(dirPath);
			System.out.println("Directory created at " + dirPath.toString());
		}
		
		// Create a file
		String fileString = "products.txt";
		Path filePath = Paths.get(dirString, fileString);
		if (Files.notExists(filePath))
			Files.createFile(filePath);
	}
}
