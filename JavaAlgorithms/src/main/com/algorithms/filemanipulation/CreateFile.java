package main.com.algorithms.filemanipulation;

import java.io.IOException;
import java.io.File;

public class CreateFile {

	public static boolean createFile(String fileName)
	{
		File file = new File(fileName);
		try {
			file.createNewFile();
			System.out.println("File: " + fileName + " created");
			return true;
		} catch (IOException e) {
			System.out.println("IOException occurred: ");
			e.printStackTrace();
			return false;
		}
	}
	
	public static void main(String[] args)
	{
		createFile("Test.txt");
	}
	
}
