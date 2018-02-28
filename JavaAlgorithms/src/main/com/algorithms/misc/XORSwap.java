package main.com.algorithms.misc;

import main.com.algorithms.strings.toBinary;

public class XORSwap {

	public static void main(String[] args)
	{
		System.out.println("Swapping int values with XOR: ");
		int var1 = 508340;
		int var2 = 1674;
		System.out.println("Initial Values: var1 = " + var1 + " var2 = " + var2);
		var1 = var1 ^ var2;
		var2 = var2 ^ var1;
		var1 = var1 ^ var2;
		System.out.println("Swapped Values: var1 = " + var1 + " var2 = " + var2);
		System.out.println();
		System.out.println("Swapping char values with XOR: ");
		char var3 = 'a';
	    char var4 = 'd';
		System.out.println("Initial Values: var3 = " + var3 + " var4 = " + var4);
		var3 = (char) (var3 ^ var4);
		var4 =  (char) (var4 ^ var3);
		var3 =  (char) (var3 ^ var4);
		System.out.println("Swapped Values: var3 = " + var3 + " var4 = " + var4);
		
	}
	
}
