package test.com.algorithms.primenumbers;

import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

import main.com.algorithms.primenumbers.PrimeGenerator;
import main.com.algorithms.primenumbers.PrimeChecker;

class PrimeCheckerTest {

	@Test
	void bruteForceCheckSecondToTenThousandthPrime() {
		long[] primesSecondToThousand = PrimeGenerator.generateLongArray(10000);
		primesSecondToThousand[0] = 3;
		for(long l : primesSecondToThousand) {
			if(!PrimeChecker.isPrimeBruteForce(l)) {
				fail(l +  " was falsely determined to be not prime");
			}
		}
		assertTrue(true);
	}

	@Test
	void bruteForceCheckTwo()
	{
		assertTrue(PrimeChecker.isPrimeBruteForce(2));
	}
	
	@Test
	void bruteForceCheckOne()
	{
		assertFalse(PrimeChecker.isPrimeBruteForce(1));
	}
	
	@Test
	void bruteForceCheckZero()
	{
		assertFalse(PrimeChecker.isPrimeBruteForce(0));
	}
	
	@Test
	void bruteForceCheckNegOne()
	{
		assertFalse(PrimeChecker.isPrimeBruteForce(-1));
	}

	
	@Test
	void lastDigitCheckSecondToTenThousandthPrime() {
		long[] primesSecondToThousand = PrimeGenerator.generateLongArray(10000);
		primesSecondToThousand[0] = 3;
		for(long l : primesSecondToThousand) {
			if(!PrimeChecker.isPrimeBruteForceFiltered(l)) {
				fail(l +  " was falsely determined to be not prime");
			}
		}
		assertTrue(true);
	}

	@Test
	void lastDigitCheckTwo()
	{
		assertTrue(PrimeChecker.isPrimeBruteForceFiltered(2));
	}
	
	@Test
	void lastDigitCheckOne()
	{
		assertFalse(PrimeChecker.isPrimeBruteForceFiltered(1));
	}
	
	@Test
	void lastDigitCheckZero()
	{
		assertFalse(PrimeChecker.isPrimeBruteForceFiltered(0));
	}
	
	@Test
	void lastDigitCheckNegOne()
	{
		assertFalse(PrimeChecker.isPrimeBruteForceFiltered(-1));
	}

}
