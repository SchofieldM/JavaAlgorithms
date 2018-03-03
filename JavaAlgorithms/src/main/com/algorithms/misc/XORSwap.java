package main.com.algorithms.misc;


/**
 * Demonstrates how one would use XOR to swap variable values
 * instead of the popular temp variable method
 * 
 * @author Matthew Schofield
 * @version 3.2.18
 */
public class XORSwap {

	/**
	 * Demonstration of XOR swap
	 * 
	 * @param args, unused
	 */
	public static void main(String[] args)
	{
		// Print to the user where we are, and that we are swapping int's
		System.out.println("Swapping int values with XOR: ");
		
		// Assigns variables to hold arbitrary values
		int var1 = 508340;
		int var2 = 1674;
		
		// Prints the current value of each variable
		System.out.println("Initial Values: var1 = " + var1 + " var2 = " + var2);
		
		/*
		 * The XOR swap algorithm/method
		 * 
		 *  x = x XOR y
		 *  y = y XOR x
		 *  x = x XOR y
		 */
		var1 = var1 ^ var2;
		var2 = var2 ^ var1;
		var1 = var1 ^ var2;
		
		// Shows that the variables were swapped
		System.out.println("Swapped Values: var1 = " + var1 + " var2 = " + var2);
		
		// Blank line for display purposed
		System.out.println();
		
		// Show the User where we are in the program and that we are swapping char's
		System.out.println("Swapping char values with XOR: ");
		
		// Initialize chars
		char var3 = 'a';
	    char var4 = 'd';
	    
	    // Prints initial values
		System.out.println("Initial Values: var3 = " + var3 + " var4 = " + var4);
		
		// The algorithm/method as shown above
			var3 = (char) (var3 ^ var4);
			var4 =  (char) (var4 ^ var3);
			var3 =  (char) (var3 ^ var4);
			
		// Print to indicate the values were swapped
		System.out.println("Swapped Values: var3 = " + var3 + " var4 = " + var4);
		
	}
	
}
