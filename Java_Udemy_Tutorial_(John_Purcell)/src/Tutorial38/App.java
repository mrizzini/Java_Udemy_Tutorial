package Tutorial38;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {

//	public static void main(String[] args) throws FileNotFoundException {

	public static void main(String[] args) {
	
		File file = new File("text.txt");
		
		try {
			FileReader fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found: " + file);
			e.printStackTrace();
		}
		
		System.out.println("Hey");
		
	}

}
