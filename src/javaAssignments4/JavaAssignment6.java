package javaAssignments4;

import java.util.TreeSet;

public class JavaAssignment6 {

	public static void main(String[] args) {
		// Get highest and lowest value stored in TreeSet
		TreeSet treeSet = new TreeSet();
		treeSet.add("element_1");
		treeSet.add("element_3");
		treeSet.add("element_2");
		treeSet.add("element_4");
		treeSet.add("element_5");

		System.out.println("Lowest value in TreeSet is : " + treeSet.first());
		System.out.println("Highest value in TreeSet is : " + treeSet.last());

	}

}
