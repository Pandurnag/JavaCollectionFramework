package com.java.collections.linkedlist;

import java.util.LinkedList;

//How to remove the first element in the LinkedList.
//How to remove the last element in the LinkedList.
//How to remove the first occurrence of a given element in the LinkedList.
//How to clear the LinkedList completely.

public class RemoveElementsFromLinkedListExample {

	public static void main(String[] args) {
		
		LinkedList<String> fruitlList = new LinkedList<>();
		fruitlList.add("Apple");
		fruitlList.add("banana");
		fruitlList.add("mango");
		fruitlList.add("Pinaple");
		
		System.out.println("Initial LinkedList = " +fruitlList);
		
	  // remove the first element in the LinkedList.
		String element = fruitlList.removeFirst();
		System.out.println(" after removing first element => " + fruitlList);
		
	 //	remove the last element in the LinkedList.
		fruitlList.removeLast();
		System.out.println(" after removing last element =>" + fruitlList);
		
		fruitlList.remove("banana");
		System.out.println(fruitlList);
		
		fruitlList.clear();
		
		System.out.println(fruitlList);
	}

}
