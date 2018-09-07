package Methods;

class Person {

	String name;
	int age;

	void speak() {
		System.out.println("My name is: " + name + " and I am " + age + " years old");
	}
	
	void sayHello() {
		System.out.println("Hello there");
	}
	
	int calculateYearsToRetirement() {
		int yearsLeft = 65 - age;
		
		System.out.println(yearsLeft);
		
		return yearsLeft;
	}
	
	int getAge() {
		return age;
	}

}

class Robot {
	public void speak(String text) {
		System.out.println(text);
	}
	
	public void jump(int height) {
		System.out.println("Jumping: " + height);
	}
	
	public void move(String direction, double distance) {
		System.out.println("Moving " + distance + " feet in direction " + direction);
	}
}

public class Application {

	public static void main(String[] args) {

		Person person1 = new Person();
		person1.name = "Joe Bloggs";
		person1.age = 37;
		person1.speak();
		person1.calculateYearsToRetirement();
		
		Person person2 = new Person();
		person2.name = "Sarah Smith";
		person2.age = 30;
		person2.speak();
		
		int years = person1.calculateYearsToRetirement();
		System.out.println("Years until retirement for " + person1.name + " : " + years);
		
		int age = person1.age;
	
		
		Robot robotSam = new Robot();
		robotSam.speak("Hi I am Sam");
		robotSam.jump(7);
		robotSam.move("Northwest", 2.5);
		
	}

}
