package Arrays;

public class Application {

	public static void main(String[] args) {

		int[] values;
		values = new int[3];
		
//		System.out.println(values[0]);
		
		values[0] = 10;
		values[1] = 20;
		values[2] = 30;
		
//		System.out.println(values[2]);
		
		for (int i = 0; i < values.length; i++) {
			System.out.println("The " + i + " value is " + values[i]);
		}
		
		int[] numbers = {5, 26, 17};
		
		String[] words = new String[3];
		words[0] = "Hello";
		words[1] = "to";
		words[2] = "you";
		
		String[] fruits = { "apple", "banana", "pear", "kiwi" };
		
		for (String fruit: fruits) {
			System.out.println(fruit);
		}
		
		int value = 123;
		
		// String class
		// REFERENCE/ADDRESS TO THE STRING
		// DEFAULT VALUE IS NULL
		String text;
		
		String[] texts = new String[2];
		
		// Multi-dimensional array
		
		int[][] grid = {
				{3, 5, 2343},
				{2, 4, 1},
				{1, 2, 3, 4}
		};
		
		System.out.println(grid[1][1]);
		
		
		for (int row = 0; row < grid.length; row++) {
			for (int column = 0; column < grid[row].length; column++) {
				System.out.print(grid[row][column] + "\t");
			}
			System.out.println();
		}
		
		
		String[][] multi = new String[2][3];
		
		multi[0][1] = "Hello there";
		

	}

}
