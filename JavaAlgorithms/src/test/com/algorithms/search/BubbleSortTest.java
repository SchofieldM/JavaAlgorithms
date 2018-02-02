package test.com.algorithms.search;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.com.algorithms.search.BubbleSort;

class BubbleSortTest {

	@Test
	void sortArrOfLen10AllPos() {
		int[] given = new int[] {2,3,6,1,5,7,4,9,8,10};
		int[] achievedAnswer = BubbleSort.bubbleSortIntArr(given);
		int[] expectedAnswer = new int[] {1,2,3,4,5,6,7,8,9,10};
		assertArrayEquals(achievedAnswer, expectedAnswer);
	}

}
