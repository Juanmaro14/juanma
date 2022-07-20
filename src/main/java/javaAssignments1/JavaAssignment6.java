package javaAssignments1;

import java.util.Scanner;

public class JavaAssignment6 {
	public static void main(String[] args) {
		// Write a program to calculate the area of a triangle.
		// Users will enter the values for base and height of the triangle.
		Scanner sc = new Scanner(System.in);
		float area;

		System.out.println("Enter Base of Triangle: ");
		float b = sc.nextInt();
		System.out.println("Enter Height of Triangle: ");
		float h = sc.nextInt();

		area = (b * h) / 2;
		System.out.println("Area of Triangle is: " + area);
	}
}