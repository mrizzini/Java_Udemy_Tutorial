package Tutorial7;

import java.util.Scanner;

public class application {

	public static void main(String[] args) {

		// Create scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt user
//		System.out.println("Enter a line of text: ");
		
		// Wait for user to enter something
//		String line = input.nextLine();
//		int line = input.nextInt();
		
		// Print what they entered
//		System.out.println("You entered: " + line);
		
		
//		System.out.println("Enter a number: ");
//		int value = input.nextInt();
		
//		while (value != 5) {
//			System.out.println("Enter a number: ");
//			value = input.nextInt();
//		}
//		
//		int value;
//		
//		do {
//			System.out.println("Enter a number: ");
//			value = input.nextInt();
//		} while(value != 5);
//		
//		
//		System.out.println("Got 5!");
		
		System.out.println("Please enter a command: ");
		String text = input.nextLine();

		switch (text) {
		case "start":
			System.out.println("Machine started");
			break;
		case "stop":
			System.out.println("Machine stopped");
			break;
		default:
			System.out.println("Command not recognized");
		}

	}

}
