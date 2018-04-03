package main.com.algorithms.strings;

public class BinaryToString {

	public static String binaryToString8Bit(String binary)
	{
		String charPrep = "";
		String output = "";
		for(int i = 0; i <= binary.length(); i++) {
        	if(charPrep.length() % 8 == 0 && i != 0) {
        		output += (char) Integer.parseInt(charPrep, 2);
        		charPrep = "";
        	}
        	if(i == binary.length()){
        		break;
        	}
        	charPrep += binary.charAt(i);
        }	
		return output;
	}
	
}
