package com.java.collections.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapUserDefinedExample {
	public static void main(String[] args) {
		
		// create hashmap
		
		Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
		
		studentMap.put(1, new Student("Ramesh", "Fadtare"));
		studentMap.put(2, new Student("Tony", "Tark"));
		studentMap.put(3, new Student("Umesh", "Fadtare"));
		
		System.out.println(studentMap.values());
	}

}
