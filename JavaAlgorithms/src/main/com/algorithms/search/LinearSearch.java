package main.com.algorithms.search;

/**
 * Goes through each element until it finds the target
 * 
 * @author Matthew Schofield
 * @version 2.4.18
 */
public class LinearSearch {
	
	public static int linearSeach(Object[] objArray, Object target)
	{
		for(int i = 0; i < objArray.length; i++) {
			if(objArray[i].equals(target)) {
				return i;
			}
		}
		return -1;
	}

}
