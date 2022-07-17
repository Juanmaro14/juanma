package javaAssignments4;

import java.util.ArrayList;

public class JavaAssignment2 {

	public static void main(String[] args) {
		// Reverse an Arraylist
		ArrayList<Integer> arrayli = new ArrayList<Integer>();
		ArrayList<Integer> RevArrayList = new ArrayList<Integer>();

		arrayli.add(new Integer(1));
		arrayli.add(new Integer(2));
		arrayli.add(new Integer(3));
		arrayli.add(new Integer(4));
		System.out.print("Elements before reversing:");
		for (int i = 0; i < arrayli.size(); i++) {
			System.out.print(arrayli.get(i) + " ");
		}
		arrayli = reverseArrayList(arrayli);
		System.out.print("\nElements after reversing:");
		for (int i = 0; i < arrayli.size(); i++) {
			System.out.print(arrayli.get(i) + " ");
		}
	}

	public static ArrayList<Integer> reverseArrayList(ArrayList<Integer> alist) {

		ArrayList<Integer> revArrayList = new ArrayList<Integer>();
		for (int i = alist.size() - 1; i >= 0; i--) {
			revArrayList.add(alist.get(i));
		}

		return revArrayList;
	}

}
