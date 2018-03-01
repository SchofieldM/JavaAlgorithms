package main.com.algorithms.filemanipulation;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Demonstrates how to read from a File in java
 * 
 * @author Matthew Schofield
 * @version 3.1.18
 */
public class ReadFromFile {

	/**
	 * Uses a FileReader to read a file
	 * 
	 * @param fileName, name of the File
	 * @return the contents of the File as a String
	 */
	public static String readFileWithFileReader(String fileName)
	{
		// Initialize an empty String to hold the contents of the File
    	String fileText = "";
    	
		try {
			// Initialize a FileReader targeting a File by the given fileName
			FileReader fr = new FileReader(fileName);
			
			/* Employs a for-loop with the FileReader to append the contents
			 of the file to the fileText String
			 
			 May throw an IOException
			 */
	    	for(int i = fr.read(); i != -1; i = fr.read())
	    		fileText += (char) i;
		} catch(FileNotFoundException e) {
			// If the File is not found prints out a message
			System.out.println("File " + fileName +" not found");
		} catch(IOException e) {
			// If an IOException occurs a message is printed
			System.out.println("There was an IOException with the file " + fileName);
		}
		
		// Return a String of the File's contents
		return fileText;
	}	

	public static void main(String[] args)
	{
		System.out.println(readFileWithFileReader("Test.txt"));
	}
}
