package main.com.algorithms.ai;

import java.util.Random;

public class Genetics {


	public static Double[] averageTwoArrays(Double[] parent1, Double[] parent2)
	{
		int lengthOfParents;
		if(parent1.length == parent2.length) {
			lengthOfParents = parent1.length;
		}else {
			throw new RuntimeException("parent1 and parent2 must be the same length");
		}
		
		Double[] child = new Double[lengthOfParents];
		for(int i = 0; i < lengthOfParents; i++) {
			double avg = (parent1[i] + parent2[i])/2;
			child[i] =  avg;
		}
		return child;
	}
	
	public static Double[] mutateByPercentage(Double[] toMutate, Double range)
	{

		Random rand = new Random();
		for(int i = 0; i < toMutate.length; i++) {
			double mutation = -1 * range + rand.nextDouble() * (range - -1 * range);
			toMutate[i] = toMutate[i] + mutation;
		}
		return toMutate;
	}
	
	public static void main(String[] args)
	{
	}
}
