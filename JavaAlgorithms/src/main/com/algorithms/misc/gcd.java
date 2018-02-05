package main.com.algorithms.misc;

/**
 * Uses variants of famous algorithms to calculate gcd
 * 
 * @author Matthew Schofield
 * @version 2.5.18
 * @see https://en.wikipedia.org/wiki/Greatest_common_divisor
 */
public class gcd {

	/**
	 * Uses the Euclidean Algorithm recursively to find gcd of two given ints
	 * 
	 * @param a, To be compared with b to find this and b's gcd
	 * @param b, To be compared with a to find this and a's gcd
	 * @return the gcd of a and b
	 */
	public static int euclideangcdRecur(int a, int b)
	{
		// calculates if b is a divisor of a
		int r = a%b;
		
		// if b was a divisor of a
		if(r == 0) {
			// return b if b was a divisor of a
			return b;
		// if b was not a divisor of a	
		}else {
			// apply this function again, with b and r as parameters
			// ie find the divisor of b and the remainder of a divided by b
			return euclideangcdRecur(b, r);
		}
	}
	
	/**
	 * Uses the Euclidean Algorithm with a while loop to find gcd of two given ints
	 * 
	 * @param a, To be compared with b to find this and b's gcd
	 * @param b, To be compared with a to find this and a's gcd
	 * @return the gcd of a and b
	 */
	public static int euclideangcdLoop(int a, int b)
	{
		// Finds the remainder of a divided by b
		int r = a%b;
		
		// while the remainder of a divided by b is not 0, 
		while(r != 0) {
			// shift a to be b
			a = b;
			// shift b to be the previous remainder
			b = r;
			// recalculate the remainder with these new values
			r = a%b;
		}
		// return b which is the gcd upon r == 0;
		return b;
	}
	
	/**
	 * Demonstration
	 * 
	 * @param args, unused
	 */
	public static void main(String[] args)
	{
		System.out.println(euclideangcdLoop(90,81));
		System.out.println(euclideangcdRecur(90, 81));
		System.out.println(euclideangcdLoop(90,9));
		System.out.println(euclideangcdRecur(90, 9));
	}
	
	
}
