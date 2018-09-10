package Tests;

public class Car {
	
	private String name;
	
	public Car(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void start() {
		System.out.println("Car started!");
	}
	
}


//Modify the above Car class so that it has an instance variable called name 
//of type String. 
//Add a constructor that accepts a string parameter and sets the car's name using 
//this parameter. Add a getName() method that returns the car's name. 
//Finally, modify the main application so that it sets the car's name via the 
//constructor, then prints the cars name (retrieving it using getName()).