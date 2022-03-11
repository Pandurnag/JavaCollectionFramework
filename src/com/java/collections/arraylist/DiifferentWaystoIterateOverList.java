package com.java.collections.arraylist;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DiifferentWaystoIterateOverList {

	public static void main(String[] args) {
		
		List<String> course = Arrays.asList("C", "C++", "Java", "Spring", "Hibernate");
		
		// basic for loop
		for(int i=0; i < course.size(); i++) {
			System.out.println(course.get(i));
		}
		
		// Enhanced for each loop
		
		for(String course1: course) {
			System.out.println(course1);
			
			
		}
		
		// basic loop with iterator
		for (Iterator iterator = course.iterator(); iterator.hasNext();) {
			String course1  = (String) iterator.next();
			System.out.println(course1);
			
		}
		
		// iterator with while loop
		Iterator<String> iterator = course.iterator();
		while (iterator.hasNext()) {
			String course1 = (String) iterator.next();
			System.out.println(course1);
			
		}
		
		// java 8 stream + lambda example
		
		
		
	}

}
