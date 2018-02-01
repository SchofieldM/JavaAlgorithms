package main.com.algorithms.primenumbers;

public class PrimeGenerator {

/**
 * Creates an array of longs of ordered primes
 * 
 * numberOfPrimes = 3:
 * 		[2,3,5]
 * numberOfPrimes = 0:
 * 		[]
 * numberOfPrimes = 5:
 * 		[2,3,5,7,11]
 * 
 * @param numberOfPrimes, number of primes to have in the array, the length of the array
 * @return an ordered array of prime numbers of specified length
 */
public static long[] generateLongArray(int numberOfPrimes)
{
	// To handle how many primes we have created and where in the array to put the next one
	int iter = 0;
	
	// Initialize the array
	long[] primes = new long[numberOfPrimes];
	
	// For later use in testing if a long is prime
	boolean isPrime = true;
	
	// If they array is to be longer than 0 the first element will be 2, this saves 
	// use from certain calculations as 2 is the only even prime number
	if(numberOfPrimes >= 1) {
		// Stores 2 at cell 0 then increments iter,
		primes[iter++] = 2;
	}
	
	// this for loop identifies numbers to test
	// starts at 3 as we already added 2 if applicable,
	// Executes while iter is less than the numberOfPrimes as this will fill the array with specified number of primes
	// adds 2 to i as evens cannot be prime, except for 2 which has already been handled
	for(long i = 3; iter < numberOfPrimes; i += 2)
	{
		// this for loop tests the identified number
		// starts by testing if the number is divisible by 3
		// executes while the tester number squared is less than of equal to the testee
		// increments the tester by 2 as we do not need to test evens
		for(long j = 3; j*j <= i; j += 2)
		{
			// if the testee is divisible by the tester, testee is not prime
			if(i % j == 0) {
				// set isPrime to false as the testee is not prime
				isPrime = false;
				// Exit the loop as no more testing is necessary
				break;
			}
			// If the testee passes all tester numbers set isPrime to true
			isPrime = true;
		}
		// if the testee has been identified as prime add it to the array of primes
		if(isPrime) {
			// add the testee to the primes array at appropriate place specified by iter
			primes[iter] = i;
			// increment iter to add next prime at appropriate spot
			iter++;
		}
	}
	// return the long array of ordered primes
	return primes;
}

}
