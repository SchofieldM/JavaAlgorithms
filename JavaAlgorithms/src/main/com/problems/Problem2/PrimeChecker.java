package main.com.problems.Problem2;

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
	
	public static boolean isPrimeBasedOnLastDigit(long toTest)
	{
		if(toTest == 2) {
			return true;
		}
		if(toTest == 5) {
			return true;
		}
		
		String toTestString = Long.toString(toTest);
		String lastChar = toTestString.substring(toTestString.length()-1);
		if(lastChar.equals("1") | lastChar.equals("3") | lastChar.equals("7") |  lastChar.equals("9")) {
			return isPrimeBruteForce(toTest);
		}
		
		return false;
			
	}
	
	
}
