package Tutorial29;

public class Field {

	private Plant plant = new Plant();
	
	public Field() {
		// size is protected
		System.out.println(plant.size);
	}
	
}
