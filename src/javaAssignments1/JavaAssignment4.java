package javaAssignments1;

import java.util.Scanner;

public class JavaAssignment4 {
	public static void main(String[] args) {
		// Write a program to check whether the current year is leap year or not.
		// Users will enter a year value.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year: ");
		int year = sc.nextInt();
		boolean leap = false;
		int len = String.valueOf(year).length();
		while (len != 4) {
			System.out.println("Incorrect Year, please try again: ");
			year = sc.nextInt();
			len = String.valueOf(year).length();
		}

		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0)
					leap = true;
				else {
					leap = false;
				}
			} else {
				leap = true;
			}
		} else {

			leap = false;
		}
		if (leap) {
			System.out.println(year + " is a leap year.");
		} else {
			System.out.println(year + " is not a leap year.");
		}
	}
}