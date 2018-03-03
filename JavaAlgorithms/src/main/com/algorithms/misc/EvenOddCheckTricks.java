package main.com.algorithms.misc;

/**
 * Tricks to show whether an int is even or odd
 * 
 * @author Matthew Schofield
 * @version 3.2.18
 */
public class EvenOddCheckTricks {

	/**
	 * Demonstration
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		System.out.println(String.format("Test of 6: %s", and1Trick(6)));
		System.out.println(String.format("Test of 56723: %s", and1Trick(56723)));
		System.out.println(String.format("Test of 367754: %s", and1Trick(367754)));		
	}
	
	/**
	 * Uses a binary trick employing & 1
	 *
	 * 
	 * @param var, an int
	 * @return if the int is even return "Even" else return "Odd"
	 */
	public static String and1Trick(int var)
	{
		return (var & 1) == 0  ? "Even" : "Odd";
	}
	
}
