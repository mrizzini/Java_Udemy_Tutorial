package Tutorial29;

public class App {

	public static void main(String[] args) {

		Plant plant = new Plant();
		
		System.out.println(plant.name);
		System.out.println(plant.ID);
	}
}


	// PRIVATE - only within same class
	// PUBLIC - from anywhere
	// PROTECTED - same class, subclass and same package
	// NO MODIFER - same package only