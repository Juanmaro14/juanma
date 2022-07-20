package javaAssignments4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class JavaAssignment3 {

	public static void main(String[] args) {
		// Check if a particular key exists in HashMap
		int keyToBeChecked = 1;
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Java");
		map.put(2, "SDET");
		map.put(3, "Training");

		System.out.println("HashMap: " + map);
		Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
		boolean isKeyPresent = false;
		while (iterator.hasNext()) {
			Map.Entry<Integer, String> entry = iterator.next();
			if (keyToBeChecked == entry.getKey()) {
				isKeyPresent = true;
			}
		}
		System.out.println("Does key " + keyToBeChecked + " exists: " + isKeyPresent);

	}

}
