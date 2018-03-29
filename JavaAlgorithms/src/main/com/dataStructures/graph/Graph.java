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
	public boolean remove(Object o) {
		nodes.remove(o);
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


