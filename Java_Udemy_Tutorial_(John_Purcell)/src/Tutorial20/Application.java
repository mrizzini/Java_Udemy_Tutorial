package Tutorial20;

public class Application {

	public static void main(String[] args) {

		String info = "";
		info += "My name is Bob.";
		info += " ";
		info += "I am a builder";
		// efficient way of doing this.
		// string builder class is better
		
		System.out.println(info);
		
		// more efficient
		StringBuilder sb = new StringBuilder("");
		
		sb.append("My name is Sue.");
		sb.append(" ");
		sb.append("I am a lion tamer");
		
		System.out.println(sb.toString());
		
		StringBuilder s = new StringBuilder()
		.append("My name is Roger.")
		.append(" ")
		.append("I am a skydiver");
		
		System.out.println(s.toString());
		
		/// FORMATTING
		
		System.out.println("Here is some text. \tThat was a tab\nThat was a new line");
		
		// prints integers %d
		System.out.printf("Total cost %d", 5);
		System.out.println(" More text");
		System.out.printf("Total cost %10d", 5);
		
		// prints nicely aligned
		for (int i = 0; i < 20; i++) {
			System.out.printf("%2d: some text here\n", i);
		}
		
		// format strings %s
		
		// formats floats %f
		System.out.printf("Total value: %.2f\n", 5.6392);
		
	}

}
