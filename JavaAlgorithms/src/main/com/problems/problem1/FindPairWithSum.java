package main.com.problems.problem1;

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
	public static int[] bruteForce(int[] unsortedIntArray, int sum)
	{
		// Initializes array to hold the determined indices
		int[] indices = new int[2];
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
		indices[0] = -1;
		indices[1] = -1;
		return indices;
	}
	
}
