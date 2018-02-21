package main.com.algorithms.arrays;

public class FindGreatest {

	public static int findGreatest(int[] array)
	{
		int highest = Integer.MIN_VALUE;
		for(int i : array)
		{
			if(i > highest) {
				highest = i;
			}
		}
		return highest;
	}
	
	public static void main(String[] args)
	{
		System.out.println(findGreatest(new int[] {1,2,3,1,4,9,14,2,4,5}));
	}
	
}
