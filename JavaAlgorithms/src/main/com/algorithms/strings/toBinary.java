package main.com.algorithms.strings;

public class toBinary {

	
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
	
	public static void main(String[] args)
	{
		System.out.println(toBinary("aaa"));
	}
	
}
