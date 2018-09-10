package Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {

		// Sets store only unique elements
		// Does NOT retain order
		Set<String> set1 = new HashSet<String>();
		
		if (set1.isEmpty())
			System.out.println("Set is empty");
	
		set1.add("dog");
		set1.add("cat");
		set1.add("mouse");
		set1.add("snake");
		set1.add("bear");
		
		// Adding duplicate items does nothing
		set1.add("mouse");
		
		System.out.println(set1);
		
		// Linked Hash Set remembers the order you added the items in
		// Doubly linked list running through the items
		Set<String> set2 = new LinkedHashSet<String>();
		
		set2.add("dog");
		set2.add("cat");
		set2.add("mouse");
		set2.add("snake");
		set2.add("bear");
		
		System.out.println(set2);
		
		// Tree set sorts in natural order
		Set<String> set3 = new TreeSet<String>();
		
		set3.add("dog");
		set3.add("cat");
		set3.add("mouse");
		set3.add("snake");
		set3.add("bear");
		
		System.out.println(set3);
		
		
		// Iteration
		for (String animal: set1) {
			System.out.println(animal);
		}
		
		// Does set contain a given item?
		if (set1.contains("aardvark"))
			System.out.println("Contains aardvark");
		
		if (set1.contains("cat"))
			System.out.println("Contains cat");
		
		if (set1.isEmpty())
			System.out.println("Set is empty");
		
		// Intersection
		Set<String> set4 = new TreeSet<String>();
		
		set4.add("dog");
		set4.add("cat");
		set4.add("giraffe");
		set4.add("monkey");
		set4.add("ant");
		
		Set<String> intersection = new HashSet<String>(set1);
		
		// find elements in both sets
		intersection.retainAll(set4);
		System.out.println("both sets have " + intersection);
		
		// Difference of two sets
		Set<String> difference = new HashSet<String>(set1);
		difference.removeAll(set4);
		System.out.println(difference);
		
	}

}
