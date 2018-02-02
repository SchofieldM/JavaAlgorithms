package test.com.problems.problem1;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import main.com.problems.problem1.FindPairWithSum;

class FindPairWithSumTest {

	@Test
	void bruteForceArrayLen2Expected0_1() {
		int[] givenArray = new int[] {1,2};
		int goalSum = 3;
		
		int[] achievedAnswer = FindPairWithSum.bruteForceFindPair(givenArray, goalSum);
		int[] expectedAnswer = new int[] {0,1};
		
		assertArrayEquals(achievedAnswer, expectedAnswer);
	}
	
	@Test
	void bruteForceArrayLen2ExpectedNotFound() {
		int[] givenArray = new int[] {2,2};
		int goalSum = 3;
		
		int[] achievedAnswer = FindPairWithSum.bruteForceFindPair(givenArray, goalSum);
		int[] expectedAnswer = new int[] {-1,-1};
		
		assertArrayEquals(achievedAnswer, expectedAnswer);
	}
	
	@Test
	void bruteForceArrayLenMoreThan2Expected3_4() {
		int[] givenArray = new int[] {1,2,3,4,5};
		int goalSum = 9;
		
		int[] achievedAnswer = FindPairWithSum.bruteForceFindPair(givenArray, goalSum);
		int[] expectedAnswer = new int[] {3,4};
		
		assertArrayEquals(achievedAnswer, expectedAnswer);
	}
	
	@Test
	void bruteForceArrayLenMoreThan2ExpectedNotFound() {
		int[] givenArray = new int[] {1,2,3,4,5};
		int goalSum = 10;
		
		int[] achievedAnswer = FindPairWithSum.bruteForceFindPair(givenArray, goalSum);
		int[] expectedAnswer = new int[] {-1,-1};
		
		assertArrayEquals(achievedAnswer, expectedAnswer);
	}
	
	@Test
	void bruteForceArrayLen1ExpectedNotFound()
	{
		int[] givenArray = new int[] {1};
		int goalSum = 10;
		
		int[] achievedAnswer = FindPairWithSum.bruteForceFindPair(givenArray, goalSum);
		int[] expectedAnswer = new int[] {-1,-1};
		
		assertArrayEquals(achievedAnswer, expectedAnswer);
	}
	
	@Test
	void a()
	{
		int[] givenArray = new int[] {5,64,6,32,6,2};
		int goalSum = 8;
		
		int[] achievedAnswer = FindPairWithSum.bruteForceFindPair(givenArray, goalSum);
		int[] expectedAnswer = new int[] {2,5};
		
		assertArrayEquals(achievedAnswer, expectedAnswer);
	}

}
