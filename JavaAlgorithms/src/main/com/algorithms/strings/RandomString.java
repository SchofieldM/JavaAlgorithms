package main.com.algorithms.strings;

import java.util.Random;

public class RandomString {

	public static String randomString(int length)
	{
		String randomString = "";
		Random rand = new Random();
		for(int i = 0; i < length; i++) {
			randomString += (char) (rand.nextInt(25) + 97);
		}
		return randomString;
	}
	
	public static void main(String[] args)
	{
		System.out.println(randomString(10));
	}
	
}
