package set;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        // TreeSet is a collection that does not allow duplicate elements
        // It is part of the Java Collections Framework and implements the Set interface.
        // It is used to store unique elements in a sorted order.
        // TreeSet maintains the natural ordering of its elements or can be sorted using a custom comparator.
        // It is not synchronized and is not thread-safe.
        // TreeSet is implemented using a Red-Black tree, which is a self-balancing binary search tree.
        // The elements in a TreeSet must implement the Comparable interface or a Comparator must be provided at the time of creation.
		
		TreeSet<String> treeset = new TreeSet<>();
		
		treeset.add("C");
		treeset.add("B");
		treeset.add("A");
		treeset.add("A"); //Duplicate not added
		treeset.add("D");
		System.out.println(treeset); //maintain natural order
	}
}