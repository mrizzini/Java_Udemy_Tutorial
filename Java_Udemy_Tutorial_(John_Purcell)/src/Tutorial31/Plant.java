package Tutorial31;

public class Plant {

	private String name;
	
	public String getData() {
		String data = "some stuff" + calculateGrowthForecast();
	
		return data;
	}
	
	private int calculateGrowthForecast() {
		return 9;
	}
	
	// Getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
