package com.java.collections.linkedlist;

import java.util.LinkedList;

public class LinkedListSearchIteratationExample {
	
	public static void main(String[] args) {
		
		LinkedList<String> progLangs = new LinkedList<>();
		
		progLangs.add("C");
		progLangs.add("C++");
		progLangs.add("Core Java");
		progLangs.add("Java EE");
		progLangs.add("Spring Framework");
		progLangs.add("Spring Framework");
		progLangs.add("Hibernate Framework");
		
		boolean result = progLangs.contains("C");
		System.out.println(" result = " + result);
		
	// Find the index of the first occurrence of an element in the LinkedList
		int index = progLangs.indexOf("Core Java");
		System.out.println("index = " + index);
		
    // Find the index of the first occurrence of an element in the LinkedList	
		int lastIndex = progLangs.lastIndexOf("Spring Framework");
		System.out.println("lastIndex => " + lastIndex); 
		
		//iterator
        //forEach
		//for each advanced loop
		//simple for loop
		
	}

}
