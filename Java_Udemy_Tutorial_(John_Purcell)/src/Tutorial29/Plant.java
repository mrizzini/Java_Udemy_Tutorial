package Tutorial29;

public class Plant {

	public String name;
	
	// Acceptable to have a public final fields
	public final static int ID = 8;
	
	private String type;
	
	protected String size;
	
	// No modifier. 
	int height;
	
	public Plant() {
		this.name = "Freddy";
		this.type = "plant";
		this.size = "medium";
		this.height = 8;
	}
	
}
