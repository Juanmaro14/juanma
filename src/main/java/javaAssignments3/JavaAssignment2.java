package javaAssignments3;

public class JavaAssignment2 {

	public static void main(String[] args) {
		// Write a program to check if a given string is a palindrome or not.
		String string = "trurt";
		boolean flag = true;
		string = string.toLowerCase();

		for (int i = 0; i < string.length() / 2; i++) {
			if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
				flag = false;
				break;
			}
		}
		if (flag)
			System.out.println("Given string is palindrome");
		else
			System.out.println("Given string is not a palindrome");
	}

}
