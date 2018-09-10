package SortingLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

	public static void main(String[] args) {

		List<String> animals = new ArrayList<String>();
	
		animals.add("elephant");
		animals.add("tiger");
		animals.add("lion");
		animals.add("cat");
		animals.add("snake");
		animals.add("mongoose");

		Collections.sort(animals);
		
		for (String animal: animals)
			System.out.println(animal);
		
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(300);
		numbers.add(73);
		numbers.add(36);
		numbers.add(723);
		numbers.add(40);
		
		for (int i = 0; i < numbers.size(); i++)
			System.out.println(numbers.get(i));
		
		Collections.sort(numbers);
		System.out.println("After sort");
		
		for (Integer number: numbers)
			System.out.println(number);
		
		
	}

}
