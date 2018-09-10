package HashMaps;

import java.util.HashMap;
import java.util.Map;

public class App {

	public static void main(String[] args) {

		// HASH MAPS DO NOT RETAIN ORDER
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(5, "Five");
		map.put(8, "Eight");
		map.put(3, "Three");
		map.put(18, "Eighteen");
//		map.put(5, "Hey");
		
		String text = map.get(5);
		
		System.out.println(text);
		
		for(Map.Entry<Integer, String> entry: map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + ": " + value);
		}
		
		
	}

}
