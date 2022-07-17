package javaAssignments4;

import java.util.ArrayList;
import java.util.HashMap;

public class JavaAssignment4 {

	public static void main(String[] args) {
		// Convert keys of a map to a list.
		HashMap<Integer, String> myMap = new HashMap<>();
		myMap.put(1, "Java");
		myMap.put(2, "Training");
		myMap.put(3, "SDET");
		myMap.put(4, "Course");

		ArrayList<Integer> keyList = new ArrayList<Integer>(myMap.keySet());
		ArrayList<String> valueList = new ArrayList<String>(myMap.values());

		System.out.println("contents of the list holding keys the map ::" + keyList);
		System.out.println("contents of the list holding values of the map ::" + valueList);

	}

}
