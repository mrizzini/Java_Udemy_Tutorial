package Tests;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

//		Create a basic Java programme that simply outputs the text "Hello World".
		
		System.out.println("Hello World");
		
//		--------------------------------------------------------------------------
		
//		Create a program that asks the user to enter an integer. If the integer is less 
//		than 10, print the message "This number is too small". If the integer is greater 
//		than or equal to 10, print "This number is big enough". 
		
		System.out.println("Enter an integer: ");
		
		Scanner input = new Scanner(System.in);
		
		int userInput = input.nextInt();
		
		if (userInput < 10)
			System.out.println("This number is too small");
		else if (userInput >= 10)
			System.out.println("This number is big enough");
		
//		--------------------------------------------------------------------------
	
	
//		Create a program that creates an array of five hard-coded floating-point values, 
//		then prints out just the second value. 
		
		double arr[] =  {3.2, 10.233, 5.21, 15.226, 40.27};
		
		System.out.println("The second value of arr is " + arr[1]);
		
		
//		--------------------------------------------------------------------------
		
//		Modify the above program so that it uses a for loop to display all the values 
//		in the array, all on the same line, each value formatted to two decimal places 
//		and followed by a space. 

		
//		--------------------------------------------------------------------------
		
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%.2f ", arr[i]);
		}
		
		System.out.println(" ");
		
//		--------------------------------------------------------------------------
		
//		A bit trickier, this one. Write an application that creates a two-dimensional
//		array of Strings, with two rows and three columns. Print the value in the 
//		second row and third column. 
		
//		String[][] twoDimension = new String[2][3];
//		twoDimension[0][0] = "One";
//		twoDimension[0][1] = "Two";
//		twoDimension[0][2] = "Three";
//		twoDimension[1][0] = "Four";
//		twoDimension[1][1] = "Five";
//		twoDimension[1][2] = "Six";
		
		String[][] twoDimension = {
			{"One", "Two", "Three"},
			{"Four", "Five", "Six"}
		};
		
		System.out.println("The second row, third column value is: " + twoDimension[1][2]);
		
		
//		--------------------------------------------------------------------------
	
//		Create an application that uses two nested for loops to loop through the 2D 
//		array defined above and print the values. 
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(twoDimension[i][j]);
				System.out.println(" ");
			}
		}

		
//		--------------------------------------------------------------------------
		
//		First, create a main program as in the first exercise. 
//		Next, define a new class in its own file. Call the class Car. Give it a 
//		single method called "start". Make the method simply print "Car started!". 
//		In your main program, create a new Car object and call its start() method. 
//		Your final program should simply therefore display the text "Car started!". 
		
//		--------------------------------------------------------------------------
		
		Car car1 = new Car("Honda");
		car1.start();
		System.out.println(car1.getName());
		
		
//		--------------------------------------------------------------------------
		
//		Modify the above Car class so that it has an instance variable called name 
//		of type String. 
//		Add a constructor that accepts a string parameter and sets the car's name using 
//		this parameter. Add a getName() method that returns the car's name. 
//		Finally, modify the main application so that it sets the car's name via the 
//		constructor, then prints the cars name (retrieving it using getName()). 

		// See above
		
//		--------------------------------------------------------------------------
		
//		Write an application that asks the user to enter the number '5' and loops 
//		over and over until '5' is entered. 
//		When 5 is finally entered, print "Got it!". 
		
		int five = 0;
		
		while (five != 5) {
			System.out.println("Enter the number 5: ");
			five = input.nextInt();
		}
		
			System.out.println("Got it!");
			
		

		
//		--------------------------------------------------------------------------
		
//			The above program crashes if a user enters something other than a number.
//			The problem is that we use the nextInt() method of Scanner, assuming blindly 
//			that we will get an integer. 
			
			int five2 = 0;
			
			while (five2 != 5) {
				System.out.println("Enter the number 5: ");
				if (input.hasNextInt()) {
					five2 = input.nextInt();
				}
				else {
					input.nextLine();
				}
			}
			
				System.out.println("Got it again!");
		
		
//		--------------------------------------------------------------------------
	
//		Write a program that asks the user to enter an integer. If the user enters 
//		'1', print "Got 1". If the user enters '66', print "Got 66". If the user 
//		enters something other than these two numbers, print "Got something else". 

		System.out.println("Enter an integer: ");
		int switchStatementInput = input.nextInt();
		
		switch (switchStatementInput) {
		case 1:
			System.out.println("Got 1");
			break;
		case 66:
			System.out.println("Got 66");
			break;
			
		default:
			System.out.println("Got something else");
			break;
		}
				
//		--------------------------------------------------------------------------
		
		
//		Write a program that asks the user to enter an integer, then gets the input 
//		from the user. The program should repeatedly ask the user to enter an integer 
//		until the user enters an integer greater than 10; then it should print 
//		"Integer greater than 10 detected!" and should end. 
		int doWhileInput;
		do {
			System.out.println("Enter an integer: ");
			doWhileInput = input.nextInt();
		}
		while (doWhileInput <= 10);

		System.out.println("Integer greater than 10 deteced!");
	}

}
