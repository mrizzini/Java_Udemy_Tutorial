package Tutorial4;

public class Application {

	public static void main(String[] args) {

		int value = 0;
		boolean loop = value < 5;
		
		System.out.println(loop);

		while (value < 10) {
			System.out.println("Hello " + value);
			value += 1;
		}

		for (int i = 0; i < 5; i++) {
			System.out.println("The value of i is " + i);
		}
		
		int myInt = 15;
		
		if(myInt < 10){
			System.out.println("Yes its true");
		}
		else if (myInt > 20) {
			System.out.println("no its false");
		}
		else {
			System.out.println("None of the above");
		}
		
		int loopCounter = 0;
		
		while (true) {
			System.out.println("looping: " + loopCounter);
			
			if (loopCounter == 5)
				break;
			
			loopCounter++;
			
			System.out.println("running");
			
		}
		
	}

}
