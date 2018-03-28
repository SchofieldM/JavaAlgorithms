package main.com.dataStructures.graph;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Node<E>{

	private E mainObject;
	private HashMap<Node<E>, Integer> paths; 
	
	public Node(E mainObject)
	{ 
		this.mainObject = mainObject;
		this.paths = new HashMap<>();
	}
	
	@Override
	public String toString()
	{
		String pathsString = "";
		for(Node<E> node : paths.keySet())
		{
			pathsString += ", " + node.getMainObject() + " : " + paths.get(node);
		}
		pathsString = "{" + pathsString.substring(2, pathsString.length());
		pathsString += "}";
		return "<" + mainObject + " | " + pathsString + '>';
	}
	
	public E getMainObject()
	{
		return mainObject; 
	}
	
	public void addPath(Node<E> nodeTo, int pathLength)
	{
		paths.put(nodeTo, pathLength);
	}
	
}
