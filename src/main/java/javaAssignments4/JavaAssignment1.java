package javaAssignments4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class JavaAssignment1 {

	public static void main(String[] args) {
		// Find duplicate characters with their occurrences count using HashMap
		String str = "Learning Java";
		Map<Character, Integer> baseMap = new HashMap<Character, Integer>();
		char[] charArray = str.toCharArray();

		for (Character ch : charArray) {
			if (baseMap.containsKey(ch)) {
				baseMap.put(ch, baseMap.get(ch) + 1);
			} else {
				baseMap.put(ch, 1);
			}
		}
		Set<Character> keys = baseMap.keySet();
		for (Character ch : keys) {
			if (baseMap.get(ch) > 1) {
				System.out.println(ch + "  is " + baseMap.get(ch) + " times");
			}
		}
	}

}
