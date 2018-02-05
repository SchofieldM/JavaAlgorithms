package main.com.algorithms.sort;

/**
 * Compares each adjacent element and switches them if they are
 * in the wrong order 
 * 
 * @see https://en.wikipedia.org/wiki/Bubble_sort
 * @author Matthew Schofield
 * @version 2.4.18
 */
public class BubbleSort {

	public static int[] bubbleSortIntArr(int[] toSort)
	{
		for(int i = 0; i < toSort.length - 1; i++) {
			for(int j = 0; j < toSort.length - i - 1; j++) {
				if(toSort[j] > toSort[j+1]) {
					int holder = toSort[j+1];
					toSort[j+1] = toSort[j];
					toSort[j] = holder;
				}
			}
		}
		return toSort;
	}
	
}
