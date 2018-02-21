package main.com.algorithms.encryption;

public class OffsetEncryption {

	public static String encrypt(String toEncrypt, int offSet)
	{
		String encryptedString = "";
		for(char c : toEncrypt.toCharArray()) {
			encryptedString += (char) (c + offSet);
		}		
		return encryptedString;
	}
	
	public static String decrypt(String toDecrypt, int offSet)
	{
		String encryptedString = "";
		for(char c : toDecrypt.toCharArray()) {
			encryptedString += (char) (c - offSet);
		}		
		return encryptedString;
	}
	
	public static String progressiveEncryption()
	
	public static void main(String[] args)
	{
		System.out.println(encrypt("Dog", 12));
		System.out.println(decrypt("Eph", 1));
		System.out.println(decrypt(encrypt("SuperSecure",10),10));
	}
	
}
