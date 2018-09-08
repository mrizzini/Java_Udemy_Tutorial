package Tutorial19;

class Thing {
	
	public final static int LUCKY_NUMBER = 7;
	
	public String name;
	
	// Static belongs to the class and there is only ONE copy. Class variable
	public static String description;
	
	public static int count = 0;
	
	public int id;
	
	public Thing() {

		id = count;
		
		count ++;
	}
	
	public void showName() {
		System.out.println("Object id: " + id + " " + "name: " + name);
	}
}


public class Application {

	public static void main(String[] args) {

		Thing.description = "I am a thing";
		System.out.println("Before creating objects count is: " + Thing.count);
		
		System.out.println(Thing.description);
		
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		
		thing1.name = "Bob";
		thing2.name = "Sue";
		
		System.out.println(thing1.name);
		System.out.println(thing2.name);
		
		thing1.showName();
		thing2.showName();
		
		// Math is static
		System.out.println(Math.PI);
		System.out.println(Thing.LUCKY_NUMBER);
		System.out.println("After creating objects count is: " + Thing.count);
		
		
	}

}
