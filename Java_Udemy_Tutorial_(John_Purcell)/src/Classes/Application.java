package Classes;


class Person {
	// Classes can contain:
	// 1. Data - the state (instance variables
	// 2. Subroutines (methods)
	
	// Instance variables (data or "state")
	String name;
	int age;
	
}

public class Application {

	public static void main(String[] args) {

		Person person1 = new Person();
		person1.name = "Joe Bloggs";
		person1.age = 37;
		
		Person person2 = new Person();
		person2.name = "Sarah Smith";
		person2.age = 30;
		
	}

}
