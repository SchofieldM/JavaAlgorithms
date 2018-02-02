package main.com.problems.Problem2;

import main.com.algorithms.primenumbers.PrimeGenerator;

public class PrimeChecker {

	public static boolean isPrimeBruteForce(long toTest)
	{
		for(long i = 2; i*i <= toTest; i++)
		{
			if(toTest%i == 0) {
				return false;
			}
		}
		return true;
	}
	
}
