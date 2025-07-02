package map;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        // TreeMap is a collection that implements the Map interface.
        // It is part of the Java Collections Framework and is used to store key-value pairs.
        // It maintains the natural ordering of its keys or can be sorted using a custom comparator.
        // TreeMap is not synchronized and is not thread-safe.
        // It is implemented using a Red-Black tree, which is a self-balancing binary search tree.
        // The keys in a TreeMap must implement the Comparable interface or a Comparator must be provided at the time of creation.
        
		TreeMap<Integer, String> treemap = new TreeMap<>();
	
		treemap.put(3, "A");
		treemap.put(1, "B");
		treemap.put(2, "C");
		//sorted in natural order
		System.out.println(treemap);
	}
}