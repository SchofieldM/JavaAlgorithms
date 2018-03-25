package main.com.algorithms.search;

import java.util.Arrays;

public class BinarySearch {

	public static int integerSearch(int[] array, int searchInt)
	{
		if(array.length == 1) {
			return -1;
		}
		int midPoint = array.length/2;
		if(array[midPoint] == searchInt) {
			return midPoint;
		}else if(array[midPoint] > searchInt){
			int[] halfArray = Arrays.copyOfRange(array,0, midPoint);
			return integerSearch(halfArray, searchInt);
		}else {
			int[] halfArray = Arrays.copyOfRange(array, midPoint, array.length);
			return integerSearch(halfArray, searchInt);
		}
	}
	
	public static void main(String[] args)
	{
		int[] test1 = new int[] {1,2,3,4,5,6,7,8,9,10};
		int search1 = 2;
		System.out.println(integerSearch(test1, search1));
		
		int[] test2 = new int[] {1,2,3,4,5,6,7,8,9,10};
		int search2 = 11;
		System.out.println(integerSearch(test2, search2));
	}
	
}
