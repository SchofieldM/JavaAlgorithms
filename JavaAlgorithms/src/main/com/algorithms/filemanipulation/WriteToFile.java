package main.com.algorithms.filemanipulation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Demonstrates how to write to a File in java
 * 
 * @author Matthew Schofield
 * @version 3.1.18
 */
public class WriteToFile {

	public static void writeToFile(String fileName, String informationToWrite)
	{
		try {
			// A BufferedWriter is created targeting a File by the given fileName
		    BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
		    
		    // Writes the String to the file
		    writer.write(informationToWrite);
		    
		    // closes the writer
		    writer.close();
		} catch(IOException e) {
			// Indicates an IOException occurred
			System.out.println("An IOException occurred");
		}
	}
	
}
