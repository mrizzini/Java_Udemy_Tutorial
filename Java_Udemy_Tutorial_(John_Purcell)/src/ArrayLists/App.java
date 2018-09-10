package ArrayLists;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		// Adding
		numbers.add(10);
		numbers.add(100);
		numbers.add(40);
		
		
		// Retrieving
		System.out.println(numbers.get(0));
		
		// Looping
		
		System.out.println("Interation #1");
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		
		System.out.println("Itertion #2");
		for (Integer value: numbers) {
			System.out.println(value);
		}
		
		numbers.remove(numbers.size() - 1);
		
		System.out.println("Itertion #3");
		for (Integer value: numbers) {
			System.out.println(value);
		}
		
	}

}
