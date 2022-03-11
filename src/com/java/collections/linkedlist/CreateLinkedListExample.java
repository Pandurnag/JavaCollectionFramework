package com.java.collections.linkedlist;

import java.util.LinkedList;

// add()
// add(2,element)
// addFirst()
// addLast()

public class CreateLinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> fruits = new LinkedList<>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Mango");
		
		System.out.println("initial linkedlist -> "+ fruits);
		
		// Adding an element at the specified position in the LinkedList
		fruits.add(2, "Watermelon");
		System.out.println("after adding Watermelon => " + fruits);
		
		//  Adding an element at the beginning of the LinkedList	
		fruits.addFirst("Strawberry");
		
		System.out.println(" after adding Strawberry => " + fruits);
		
	   //	Adding an element at the end of the LinkedList
		fruits.addLast("Orange");
		
		System.out.println(fruits);

	}

}
