package main.com.algorithms.encryption;

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
	
	public static String progressiveOffsetEncryption(String toEncrypt, int offSet)
	{
		String encryptedString = "";
		char[] charArrayToEncrypt = toEncrypt.toCharArray();
		for(int i = 0; i < charArrayToEncrypt.length; i++) {
			encryptedString += (char) (charArrayToEncrypt[i] + i + offSet);
		}
		return encryptedString;
	}
	
	public static void main(String[] args)
	{
		System.out.println(progressiveOffsetEncryption("aaa", 1));
		System.out.println(progressiveOffsetEncryption("hiya", 0));
	}
	
}
