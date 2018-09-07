package Tutorial17;

class Frog {
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
}


public class Application {

	public static void main(String[] args) {

		Frog frog1 = new Frog();
		frog1.setName("Bertie");
		frog1.setAge(1);
		System.out.println(frog1.getAge());
		System.out.println(frog1.getName());
		
	}

}
