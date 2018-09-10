package Tutorial41;

public class App {

	public static void main(String[] args) {

		// ABSTRACT CLASSES
		// They will not be used
		// Camera IS a machine
		// Car IS a machine
		// Stronger statement than implementing an interface
		// Classes can only have one parent class, but can have as many interfaces as you'd like
		// Abstract classes are a statement about the identity
		// It is saying what the child classes are. Interfaces define what they can do
		
		
		Camera cam1 = new Camera();
		cam1.setId(5);
		
		Car car1 = new Car();
		car1.setId(4);
		
		car1.run();
		
	}

}
