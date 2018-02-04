package main.com.problems.problem1;

import main.com.algorithms.sort.BubbleSort;

/**
 * Finds a pair or pairs within an unsorted integer array that add up
 * to a given sum
 * 
 * @see http://www.techiedelight.com/find-pair-with-given-sum-array/
 * @author Matthew Schofield
 * @version 2.1.18
 *
 */

public class FindPairWithSum {

	/**
	 * Finds the first pair of two integers in an unsorted integer
	 * array, first meaning the first index is as low as possible 
	 * then the second index is as low is possible relative to the 
	 * first index.
	 * 
	 * Method:
	 * Brute force
	 * 
	 * @param sum to find
	 * @param unsortedIntArray, the unsorted int array to operate on
	 * @return an int[] of the indices of the 'first' pair that sums
	 * 		to the given sum.
	 */
	public static int[] bruteForceFindPair(int[] unsortedIntArray, int sum)
	{
		// Initializes array to hold the determined indices, but assumes unfound to begin
		int[] indices = new int[] {-1,-1};
		// iterates through each elements
		for(int i = 0; i < unsortedIntArray.length; i++) {
			// Tests the current iteration against every other element in the array
			for(int j = 0; j < unsortedIntArray.length; j++) {
				// Assures an index is not tested against itself
				if(i != j) {
					// Tests if the current elements add to the sum, if so return the indices in an int[]
					if(unsortedIntArray[i] + unsortedIntArray[j] == sum){{
							indices[0] = i;
							indices[1] = j;
							return indices;
						}
					}
				}	
			}
		}
		// If no two elements were found to sum to the wanted sum return [-1,-1]
		return indices;
	}
	
	/**
	 * Finds the first pair of two integers in an unsorted integer
	 * array
	 * 
	 * Method:
	 * Quick Sort, then iterates
	 * 
	 * @param sum, sum to find
	 * @param unsortedIntArray, the unsorted int array to operate on
	 * @return an int[] of the indices of the first pair that sums to
	 * 		the given sum, OR returns [-1,-1] if not found
	 */
	public static int[] quickSortFindPair(int[] unsortedIntArray, int sum)
	{
		// Initializes array to hold the end result indices, assumes unfound to begin
		int[] indices = new int[] {-1,-1};
		// Uses quick sort algorithm to sort the array
		int[] sortedArray = BubbleSort.bubbleSortIntArr(unsortedIntArray);
		// Two indices to hold the place
		int lower = 0;
		int upper = sortedArray.length;
		// Keep looking until lower is greater than upper, at such point there is no pair
		while(lower < upper)
		{
			int res = sortedArray[lower] + sortedArray[upper];
			if(res == sum) {
				return new int[] {lower, upper};
			}else if(res < sum) {
				lower++;
			}else if(res > sum) {
				upper--;
			}
		}
		return new int[] {-1,-1};
		
	}
}
