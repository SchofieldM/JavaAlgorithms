package main.com.algorithms.encryption;

/**
 * Methods to employ offset/caesar encryptions
 * Historically a laughably weak encryption
 * 
 * @author Matthew Schofield
 * @version 2.23.18
 */
public class OffsetEncryption {

	public static String offsetEncrypt(String toEncrypt, int offSet)
	{
		String encryptedString = "";
		for(char c : toEncrypt.toCharArray()) {
			encryptedString += (char) (c + offSet);
		}		
		return encryptedString;
	}
	
	public static String offsetDecrypt(String toDecrypt, int offSet)
	{
		String encryptedString = "";
		for(char c : toDecrypt.toCharArray()) {
			encryptedString += (char) (c - offSet);
		}		
		return encryptedString;
	}
	
	public static String progressiveOffsetEncrypt(String toEncrypt, int offSet)
	{
		String encryptedString = "";
		char[] charArrayToEncrypt = toEncrypt.toCharArray();
		for(int i = 0; i < charArrayToEncrypt.length; i++) {
			encryptedString += (char) (charArrayToEncrypt[i] + i + offSet);
		}
		return encryptedString;
	}
	
	public static String progressiveOffsetDecrypt(String toDecrypt, int offSet)
	{
		String encryptedString = "";
		char[] charArrayToEncrypt = toDecrypt.toCharArray();
		for(int i = 0; i < charArrayToEncrypt.length; i++) {
			encryptedString += (char) (charArrayToEncrypt[i] - i - offSet);
		}
		return encryptedString;
	}
	
	public static void main(String[] args)
	{
		System.out.println(progressiveOffsetDecrypt(progressiveOffsetEncrypt("aaa", 1), 1));
		System.out.println(progressiveOffsetEncrypt("hiya", 0));
	}
	
}
