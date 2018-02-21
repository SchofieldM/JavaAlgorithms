package main.com.algorithms.collections.arrays;

public class Reverse {
	
	public static Object[] reverse(Object[] toReverse)
	{
		Object[] reversed = new Object[toReverse.length];
		int j = 0;
		for(int i = toReverse.length-1; i >= 0; i--)
		{
			reversed[j] = toReverse[i];
			j++;
		}
		return reversed;
	}
	
	public static void main(String[] args)
	{
		Integer[] intArr = new Integer[] {1,2,3,4,5,6,7,8,9};
		for(Object obj : reverse(intArr)) {
			System.out.print(obj + ", ");
		}
	}

}
