package Tutorial28;

public class Machine implements Info {

	private int id;
	
	public void start() {
		System.out.println("Machine started");
	}

	@Override
	public void showInfo() {

		System.out.println("Machine ID is: " + id);
		
	}
	
}
