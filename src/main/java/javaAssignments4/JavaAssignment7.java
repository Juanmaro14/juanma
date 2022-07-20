package javaAssignments4;

import java.util.ArrayList;
import java.util.Collections;

public class JavaAssignment7 {

	public static void main(String[] args) {
		// Sort ArrayList of Strings alphabetically.
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("Java");
		myList.add("SDET");
		myList.add("Training");
		myList.add("Course");

		System.out.println("Before Sorting:");
		for (String counter : myList) {
			System.out.println(counter);
		}

		Collections.sort(myList);

		System.out.println("After Sorting:");
		for (String counter : myList) {
			System.out.println(counter);
		}
	}

}
