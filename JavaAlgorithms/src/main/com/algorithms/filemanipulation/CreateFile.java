package main.com.algorithms.filemanipulation;

import java.io.IOException;
import java.io.File;

/**
 *  Demonstrates how to create a File in java
 * 
 * @author Matthew Schofield
 * @version 3.1.18
 */
public class CreateFile {

	/**
	 * Creates a File with the given name
	 * 
	 * @param fileName, name of the File to be created
	 * @return if successfully created true is returned otherwise false
	 */
	public static boolean createFile(String fileName)
	{
		// Creates the necessary File object 
		File file = new File(fileName);
		
		try {
			// Creates the File in the system
			file.createNewFile();
			
			// Prints out a message indicating success
			System.out.println("File: " + fileName + " created");
			
			// True is returned as the File was successfully created
			return true;
		} catch (IOException e) {
			//Indicates an IOException occurred
			System.out.println("IOException occurred");
			
			// False is returned as the File was not created
			return false;
		}
	}
	
	
}
