package com.codedecode.springrestapidemo.utils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class CollectionFrameworkDemo {
	
	public static void main(String[] args) {
		
		int length;
		
		int [] intArr = new int[10];
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		Integer[] integerArr = new Integer[10];
		
		length = intArr.length;
		length = arrayList.size();
		
		intArr[0] = 1;
		arrayList.add(1);
		
		Vector<Integer> vector = new Vector<>();
		
		LinkedList<Integer> linkedList = new LinkedList<>();
	}

}
