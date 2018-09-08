package Tutorial28;

public class Person implements Info {
//	CAN IMPLEMENT AS MANY INTERFACES AS YOU WANT. BUT ONLY ONE PARENT CLASS

	public Person(String name) {
		this.name = name;
	}

	private String name;
	
	public void greet() {
		System.out.println("Hello there");
	}

	@Override
	public void showInfo() {

		System.out.println("Person name is: " + name);
		
	}
	
}
