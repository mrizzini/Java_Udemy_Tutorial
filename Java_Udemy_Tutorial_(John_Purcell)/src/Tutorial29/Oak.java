package Tutorial29;

public class Oak extends Plant {

	public Oak() {
		
		// wont work - if type is private
		// type = "tree";
		
		// protected - so we can access it from parent class Plants
		this.size = "large";
		
		// No access specifier. Oak and Plant in same package
		this.height = 10;
		
	}
	
}
