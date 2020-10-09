package ui;

import java.io.*;
import java.nio.file.*;

public class FileProcessingApp 
{

	public static void main(String[] args) throws IOException 
	{
		System.out.println("hi");
		
		// Create a directory 'temp' if it does not exist
		String dirString = "c:/temp";
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
		
		// Display file info
		System.out.println("File name: " + filePath.getFileName());
		System.out.println("Absolute path: " + filePath.toAbsolutePath());
		System.out.println("Real path: " + filePath.toRealPath());
		System.out.println("Is writable?: " + Files.isWritable(filePath));
	
		if(Files.exists(dirPath) && Files.isDirectory(dirPath))
			{
				System.out.println("Directory: " + dirPath.toAbsolutePath());
				System.out.println("Files: " );
				DirectoryStream<Path> dirStream = Files.newDirectoryStream(dirPath);
				for (Path p : dirStream)
				{
					if (Files.isRegularFile(p))
						System.out.println("\t" + p.getFileName());
				}
			}
		
		System.out.println("bye");

		// pg. 467
		// write data to a file - will create a file inside our projects folder
		Path productsPath = Paths.get("products.txt");
		File productsFile = productsPath.toFile();
			
		PrintWriter out = new PrintWriter(
						  new BufferedWriter(
						  new FileWriter(productsFile)));
		// write data to the stream
		out.println("java\tMurach's Java Programming\t57.50");
		out.close();
		
		// open an input stream
		BufferedReader in = new BufferedReader(new FileReader(productsFile));
		
		String line = in.readLine();
		System.out.println(line);
		in.close();
			
	}
	

}
