package Tutorial21;

class Frog {
	
	private int id;
	private String name;
	
	public Frog(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		// less efficient
		//	return id + ": " + name;
		
		// more efficient
		StringBuilder sb = new StringBuilder();
		sb.append(id).append(": ").append(name);
		
		return sb.toString();
	}
	
}

public class Application {

	public static void main(String[] args) {

		Object obj = new Object();
		
		Frog frog1 = new Frog(7, "Freddy");
		Frog frog2 = new Frog(5, "Roger");
		System.out.println(frog1);
		System.out.println(frog2);
		
		boolean eq = "hey".equals("hey");
		System.out.println(eq);
		
	}

}
