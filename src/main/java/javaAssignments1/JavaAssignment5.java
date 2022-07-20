package javaAssignments1;

public class JavaAssignment5 {
	public static void main(String[] args) {
		// Write a program to print the first 10 prime numbers.
		int ct = 0, n = 0, i = 1, j = 1;
		while (n < 10) {
			j = 1;
			ct = 0;
			while (j <= i) {
				if (i % j == 0)
					ct++;
				j++;
			}
			if (ct == 2) {
				System.out.printf("%d ", i);
				n++;
			}
			i++;
		}
	}
}