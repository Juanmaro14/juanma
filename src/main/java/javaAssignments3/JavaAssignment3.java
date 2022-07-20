package javaAssignments3;

public class JavaAssignment3 {

	public static void main(String[] args) {
		// Write a program to check “brown” is present in the string:
		// A brown fox ran away fast

		String textInput = "A brown fox ran away fast";
		String wordToFind = "brown";

		if (textInput.contains(wordToFind)) {
			System.out.println("Word " + wordToFind + " found in input: " + textInput);
		} else {
			System.out.println("Word not found in input: " + textInput);
		}

	}

}
