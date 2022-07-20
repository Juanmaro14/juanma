package javaAssignments3;

public class JavaAssignment4 {

	public static void main(String[] args) {
		// Write a program to convert String to a character array and character array to
		// String.
		String str = "Hello World";
		char[] ch = toChar(str);

		for (char c : ch) {
			System.out.println(c);
		}
		System.out.println(toString(ch));

	}

	public static String toString(char[] a) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < a.length; i++) {
			sb.append(a[i]);
		}

		return sb.toString();
	}

	public static char[] toChar(String str) {
		char[] ch = new char[str.length()];

		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
		}

		return ch;
	}
}
