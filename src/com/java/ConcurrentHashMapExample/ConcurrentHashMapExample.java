package com.java.ConcurrentHashMapExample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
	
	public static void main(String[] args) {
		ConcurrentHashMap<Integer, Integer> map  = new ConcurrentHashMap<>();
		map.put(1, 1);
		map.put(2, 2);
		map.put(3, 3);
		
		Iterator<Integer> it = map.keySet().iterator();
		while (it.hasNext()) {
			Integer key = it.next();
			System.out.println("Map Value:" +map.get(key));
			if (key.equals(2)) {
				map.put(4, 4);
				
			}
			
		}
		
	}
}
	
	
