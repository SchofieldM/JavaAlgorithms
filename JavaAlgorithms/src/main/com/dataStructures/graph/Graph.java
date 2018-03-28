package main.com.dataStructures.graph;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Graph<E> implements Collection <E>{

	private HashSet<Node<E>> nodes; 
	
	public Graph()
	{
		nodes = new HashSet<Node<E>>();
	}
	
	public boolean addPathToNode(Node<E> nodeToAddTo, Node<E> pathTo, int pathLength)
	{
		nodeToAddTo.addPath(pathTo, pathLength);
		return true;
	}
	
	@Override
	public String toString()
	{
		String stringRepresentation = "";
		for(Node node : nodes) {
			stringRepresentation += node + "\n";
		}
		return stringRepresentation;
	}
	
	@Override
	public int size() {
		return nodes.size();
	}

	@Override
	public boolean isEmpty() {
		return nodes.size() == 0;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(E e) {
		nodes.add(new Node<E>(e));
		return true;
	}

	public boolean add(Node<E> e)
	{
		nodes.add(e);
		return true;
	}
	
	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
}


