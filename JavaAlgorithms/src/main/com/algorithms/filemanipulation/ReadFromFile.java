package main.com.algorithms.filemanipulation;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {

	public static String readFile(String fileName)
	{
    	String fileText = "";
		try {
			FileReader fr = new FileReader(fileName);
	    	int i;
	    	while ((i=fr.read()) != -1)
	    		fileText += (char) i;
		} catch(FileNotFoundException e) {
			System.out.println("File " + fileName +" not found");
		} catch(IOException e) {
			System.out.println("There was an IOException with the file " + fileName);
		}
		return fileText;
	}	

	public static void main(String[] args)
	{
		System.out.println(readFile("Test.txt"));
	}
	
}
