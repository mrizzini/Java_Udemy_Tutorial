package Tutorial37;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		
		String fileName = "example.txt";
		
		File textFile = new File(fileName);
		
		Scanner in;
		try {
			in = new Scanner(textFile);
			while (in.hasNextLine()) {
				String line = in.nextLine();
				
				System.out.println(line);
			}
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		

		
	}

}
