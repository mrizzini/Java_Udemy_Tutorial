package LinkedLists;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class App {

	public static void main(String[] args) {

		// if you only want to add or remove items at the end of the list use array
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		// if you want to add or remove items anywhere use linked
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		
		doTimings("ArrayList", arrayList);
		doTimings("LinkedList", linkedList);
	}
	
	private static void doTimings(String type, List<Integer> list) {

		for (int i = 0; i < 10000; i++) {
			list.add(i);
		}
		
		long start = System.currentTimeMillis();
		
		// Add items at end of list
//		for (int i = 0; i < 1000000; i++) {
//			list.add(i);
//		}
		
		// Add items else where
		
		for (int i = 0; i < 10000; i++) {
			list.add(0, i);
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("Time taken: " + (end - start) + " ms for " + type);
	}

}
