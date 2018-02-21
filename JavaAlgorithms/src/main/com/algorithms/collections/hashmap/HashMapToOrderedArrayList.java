package main.com.algorithms.collections.hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapToOrderedArrayList {

	public ArrayList<Object> toOrderedArrayList(HashMap<Object, Integer> map)
	{
		ArrayList<Object> arrayList = new ArrayList<>();
		for(Object obj : map.keySet()) {
			if(arrayList.size() == 0)
				arrayList.add(obj);
			for(int i = 0; i < map.size(); i++) {
				if(i+1 == arrayList.size()) {
					arrayList.add(obj);
					break;
				}
				if()
			}
		}
		return arrayList;
	}
	
}
