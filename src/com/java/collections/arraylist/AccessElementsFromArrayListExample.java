package com.java.collections.arraylist;

import java.util.ArrayList;
import java.util.List;
//How to check if an ArrayList is empty using the isEmpty() method.
//How to find the size of an ArrayList using the size() method.
//How to access the element at a particular index in an ArrayList using the get() method.
//How to access the element at a particular index in an ArrayList using the set() method.
 
public class AccessElementsFromArrayListExample {

	public static void main(String[] args) {
		List<String> topProgrammingLaguages = new ArrayList<>();
		
		// check if an ArrayList is empty
		System.out.println("Is the topProgrammingLanguages list empty? :"
				+topProgrammingLaguages.isEmpty());
		
		topProgrammingLaguages.add("C");     //0
		topProgrammingLaguages.add("Java");  //1
		topProgrammingLaguages.add("C++");   //2
		topProgrammingLaguages.add("Python");//3
		topProgrammingLaguages.add(".net");  //4
		
		//Find the size of an ArrayList
		 System.out.println("Here are the top" + topProgrammingLaguages.size()
		                    + "Programming Languages in the world");
		 
		 // Retrieve the element at a given index
		    String bestProgrammingLang = topProgrammingLaguages.get(1);
		    System.out.println("bestProgrammingLang => " + bestProgrammingLang);
		    
		    String secondBestProgrammingLang = topProgrammingLaguages.get(3);
		    System.out.println("secondBestProgrammingLang =>" +secondBestProgrammingLang);
		    
		 // Modify the element at a given index
		    topProgrammingLaguages.set(4,"C#");
		    System.out.println(topProgrammingLaguages);
	 

	}

}
