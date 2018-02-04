package main.com.problems.Problem2;

import main.com.algorithms.primenumbers.PrimeGenerator;

public class PrimeChecker {

	public static boolean isPrimeBruteForce(long toTest)
	{
		if(toTest <= 1) {
			return false;
		}
		for(long i = 2; i*i <= toTest; i++)
		{
			if(toTest%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isPrimeBruteForceFiltered(long toTest)
	{
		if(toTest <= 1) {
			return false;
		}
		if(toTest == 2 | toTest == 5){
			return true;
		}
		if(toTest%2 == 0) {
			return false;
		}
		for(long i = 3; i*i <= toTest; i+=2)
		{
			if(toTest%i == 0) {
				return false;
			}
		}
		return true;
			
	}
	
	public static void main(String[] args)
	{
		long start = System.currentTimeMillis();
		for(long i = 0; i< 10000000 ; i++) {
			isPrimeBruteForceFiltered(i);
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		
	}
	
	
}
