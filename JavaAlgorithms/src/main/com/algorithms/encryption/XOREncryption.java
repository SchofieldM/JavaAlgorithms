package main.com.algorithms.encryption;

import java.util.ArrayList;

public class XOREncryption {

	/**
	 * Employs XOR encryption given a text string and a key
	 * 
	 * @param text, plain text
	 * @param key, key to xor against the text
	 * @return the cipher text
	 */
	public static String xorWithStringKey(String text, String key)
	{
		char[] textChars = text.toCharArray();
		char[] keyChars = key.toCharArray();
		String textBinary = "";
		String keyBinary = "";
		String output = "";
		for(char c : textChars) {
			String textBin = Integer.toBinaryString(c); 
			while(textBin.length() < 8) {
				textBin = "0" + textBin;
			}
			textBinary += textBin;
		}
		for(char c : keyChars) {
			String keyBin = Integer.toBinaryString(c);
			while(keyBin.length() < 8)
				keyBin = "0" + keyBin;
			keyBinary += keyBin;
		}
		String charPrep = "";
        for(int i = 0; i <= textBinary.length(); i++) {
        	if(charPrep.length() % 8 == 0 && i != 0) {
        		output += (char) Integer.parseInt(charPrep, 2);
        		charPrep = "";
        	}
        	if(i == textBinary.length()){
        		break;
        	}
        	charPrep += textBinary.charAt(i) ^ keyBinary.charAt(i%keyBinary.length());
        }
        return output; 
	}
	
	/**
	 * Employs XOR encryption given a text string and a binary key
	 * 
	 * @param text, plain text
	 * @param key, key to xor against the text
	 * @return the cipher text
	 */
	public static String xorWithBinaryKey(String text, String keyBinary)
	{
		char[] textChars = text.toCharArray();
		String textBinary = "";
		String output = "";
		for(char c : textChars) {
			String textBin = Integer.toBinaryString(c); 
			while(textBin.length() < 8) {
				textBin = "0" + textBin;
			}
			textBinary += textBin;
		}
		String charPrep = "";
        for(int i = 0; i <= textBinary.length(); i++) {
        	if(charPrep.length() % 8 == 0 && i != 0) {
        		output += (char) Integer.parseInt(charPrep, 2);
        		charPrep = "";
        	}
        	if(i == textBinary.length()){
        		break;
        	}
        	charPrep += textBinary.charAt(i) ^ keyBinary.charAt(i%keyBinary.length());
        }
        return output; 
	}
	
	/**
	 * Demonstration of xor encryption and decryption as an xor decryption is merely
	 * applying another encryption with the same key
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		System.out.println(xorWithStringKey("SuperSecretText", "secretpassword"));
		System.out.println(xorWithStringKey(xorWithStringKey("SuperSecretText", "secretpassword"), "secretpassword"));
		
		System.out.println(xorWithBinaryKey("Password", "01010111"));
		System.out.println(xorWithBinaryKey(xorWithBinaryKey("Password", "01010111"), "01010111"));
	}
	
}
