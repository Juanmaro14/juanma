package javaAssignments3;

import java.util.HashMap;
import java.util.Map;

public class JavaAssignment1 {

	public static void main(String[] args) {
		// Write a program to print the occurrence of each character in the String
		String input = "DevLabs Alliance Training";
		Map<Character, Integer> hash = new HashMap<Character, Integer>();

		for (int i = 0; i < input.length(); i++) {
			if (hash.containsKey(input.charAt(i)))
				hash.put(input.charAt(i), hash.get(input.charAt(i)) + 1);

			else
				hash.put(input.charAt(i), 1);
		}
		for (var entry : hash.entrySet()) {
			System.out.println("The Character '" + entry.getKey() + "' appears " + entry.getValue() + " times.");
		}
	}

}
