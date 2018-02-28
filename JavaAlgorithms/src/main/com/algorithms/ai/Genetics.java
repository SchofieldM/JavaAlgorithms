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
			double mutation = -1.0 * range + (range - -1.0 * range) * rand.nextDouble();
			toMutate[i] *= 1 + mutation;
		}
		return toMutate;
	}
	
	public static Double[] swappingInheritance(Double[] parent1, Double[] parent2)
	{
		Double[] child = new Double[parent1.length];
		Random rand = new Random();
		for(int i = 0; i < parent1.length; i++) {
			if(rand.nextBoolean()) {
				child[i] = parent1[i];
			}else {
				child[i] = parent2[i];
			}
		}
		return child;
	}
	
	public static Double[] standardMutation(Double[] parent1, Double[] parent2)
	{
		Double[] child = swappingInheritance(parent1, parent2);
		child = mutateByPercentage(child, 0.1);
		return child;
	}
	
	public static void main(String[] args)
	{
		Double[] parent1 = new Double[] {0.0, 1.0, 2.0, 3.0, 4.0};
		Double[] parent2 = new Double[] {10.0, 9.0, 8.0, 7.0, 6.0};
		Double[] child = standardMutation(parent1, parent2);
		for(Double d : child)
			System.out.println(d);
	}
}
