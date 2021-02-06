package hashMap;

import java.util.HashMap;

public class Hashmap {
	public static void main(String[] args) {
		
		HashMap<String, Integer> numbers = new HashMap<String, Integer>();
		
		// Add Keys and values (Country, City)
		numbers.put("One", 1);
		numbers.put("Two", 2);
		numbers.put("Three", 3);
		numbers.put("four", 4);
		System.out.println(numbers);
	}

}
