package main.com.algorithms.encryption;

public class XOREncryption {

	public static String encrypt(String text, String key)
	{
		String output = "";
        for(int i = 0; i < text.length(); i++) {
            int o = (Integer.valueOf(text.charAt(i)) ^ Integer.valueOf(key.charAt(i % (key.length() - 1)))) + '0';
            output += o;
        }
        return output; 
	}
	
	public static void main(String[] args)
	{
		System.out.println(encrypt("Doggie", ""));
		System.out.println(encrypt("Doggie", "aa"));
	}
	
}
