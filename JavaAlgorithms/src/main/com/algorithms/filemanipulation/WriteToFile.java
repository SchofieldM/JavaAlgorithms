package main.com.algorithms.filemanipulation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	public static void writeToFile(String fileName, String informationToWrite)
	{
		try {
		    String str = informationToWrite;
		    BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
		    writer.write(str);
		     
		    writer.close();
		} catch(IOException e) {
			
		}
	}
	
	public static void main(String[] args)
	{
		writeToFile("Test.txt", "testing out \n the functionality \n\t of this");
	}
	
}
