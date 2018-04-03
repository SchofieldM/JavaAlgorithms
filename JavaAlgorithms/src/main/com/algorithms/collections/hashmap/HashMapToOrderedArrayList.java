package main.com.algorithms.collections.hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapToOrderedArrayList {

	public static ArrayList<Object> toOrderedArrayList(HashMap<Object, Double> map)
	{
		ArrayList<Object> arrayList = new ArrayList<>();
		
		for(Object obj : map.keySet()) {
			if(arrayList.size() == 0) {
				arrayList.add(obj);
				System.out.println(arrayList);
			}else {
				for(int i = 0; i < arrayList.size(); i++) {
					System.out.println(arrayList);
					
					if(map.get(obj) < map.get(arrayList.get(i))) {
						arrayList.add(i, obj);
						break;
					}
					
					if(i == arrayList.size()-1) {
						arrayList.add(obj);
						break;
					}
				}
			}
		}
	
		return arrayList;
	}
	
	public static void main(String[] args)
	{
		HashMap<Object, Double> toSort = new HashMap<>();
		toSort.put("D", 1.5);
		toSort.put("E", 4.0);
		toSort.put("A", 0.0);
		toSort.put("B", 1.0);
		toSort.put("C", 2.0);
		System.out.println(toOrderedArrayList(toSort));
	
	}
	
}
