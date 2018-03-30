package main.com.dataStructures.graph;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class Graph<E> implements  Set<E>{

	private HashMap<E, HashMap<E, Integer>> nodes; 
	
	public Graph()
	{
		nodes = new HashMap<E, HashMap<E, Integer>>();
	}

	public void addDirectedPath(E nodeFrom, E nodeTo, Integer distance)
	{
		nodes.get(nodeFrom).put(nodeTo, distance);
	}
	
	public void addPath(E node1, E node2, Integer distance)
	{
		nodes.get(node1).put(node2, distance);
		nodes.get(node2).put(node1, distance);
	}
	
	public void removePath(E nodeFrom, E nodeTo)
	{
		nodes.get(nodeFrom).remove(nodeTo);
	}
	
	public void removeDirectedPath(E node1, E node2)
	{
		nodes.get(node1).remove(node2);
		nodes.get(node2).remove(node1);
	}
	
	@Override
	public String toString()
	{
		String output = "";
		for(E node : nodes.keySet()) 
		{
			output += node + " | ";
			for(E nodeTo : nodes.get(node).keySet())
			{
				output += nodeTo + " : " + nodes.get(node).get(nodeTo) + " ";
			}
			output += '\n';
		}
		return output;
	}
	
	@Override
	public int size() {
		return nodes.size();
	}

	@Override
	public boolean isEmpty() {
		return nodes.isEmpty();
	}

	@Override
	public boolean contains(Object o) {
		return nodes.containsKey(o);
	}

	@Override
	public Iterator<E> iterator() {
		return nodes.keySet().iterator();
	}

	@Override
	public Object[] toArray() {
		System.out.println("toArray()");
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(E e) {
		nodes.put(e, new HashMap<E, Integer>());
		return true;
	}

	@Override
	public boolean remove(Object nodeToRemove) {
		nodes.remove(nodeToRemove);
		for(E node : nodes.keySet())
		{
			for(E connectedNode : nodes.get(node).keySet())
			{
				if(connectedNode == nodeToRemove)
				{
					nodes.get(node).remove(connectedNode);
				}
			}
		}
		return true;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		for(E obj : c) {
			add(obj);
		}
		return true;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		for(Object obj : c) {
			remove(obj);
		}
		return true;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return true;
	}

	@Override
	public void clear() {
		nodes.clear();
	}
}


