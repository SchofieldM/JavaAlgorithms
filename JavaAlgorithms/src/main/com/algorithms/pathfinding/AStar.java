package main.com.algorithms.pathfinding;

import java.util.ArrayList;

import javax.management.RuntimeErrorException;

import main.com.dataStructures.graph.Graph;

public class AStar {

	public static ArrayList<Object> AStar(Graph graph, Object node1, Object node2)
	{
		if(!(graph.contains(node1) & graph.contains(node2)))
		{
			throw new RuntimeException(node1 + " or " + node2 + " is not in the graph");
		}
		ArrayList<Object> result = new ArrayList<Object>();
		
		return result;
	}
	
	public static void main(String[] args)
	{
		Graph<String> cities = new Graph<>();
		cities.add("Toronto");
		cities.add("New York");
		AStar(cities, "Toronto", "New York");
	}
	
}
