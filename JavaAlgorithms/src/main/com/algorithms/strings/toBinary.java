package main.com.algorithms.strings;

/**
 * Allows for Strings to be converted to binary
 * 
 * 
 * @author Matthew Schofield
 * @version 3.3.18
 */
public class toBinary {

	/**
	 * Converts a String to a binary String
	 * 
	 * "a" = "01100001"
	 * 
	 * @param string, String to convert to a binary String
	 * @return a binary String of the given String
	 */
	public static String toBinary(String string)
	{
		String textBinary = "";
		for(char c : string.toCharArray()) {
			String textBin = Integer.toBinaryString(c); 
			while(textBin.length() < 8) {
				textBin = "0" + textBin;
			}
			textBinary += textBin;
		}
		return textBinary;
	}
	
	/**
	 * Demonstration of turning a String into a binary String
	 * 
	 * @param args, unused
	 */
	public static void main(String[] args)
	{
		System.out.println(toBinary("a"));
	}
	
}
