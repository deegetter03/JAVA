package set;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        // HashSet is a collection that does not allow duplicate elements
        // It is part of the Java Collections Framework and implements the Set interface.
        // It is used to store unique elements and provides constant time performance for basic operations like add, remove, and contains.
        // HashSet does not maintain the order of elements.
        // It is not synchronized and is not thread-safe.

		HashSet<String> hashset = new HashSet<>();
		
		hashset.add("A");
		hashset.add("B");
		hashset.add("A"); //Duplicate not added
		System.out.println(hashset);
		
		boolean check1 = hashset.add("C");
		System.out.println(check1);
		boolean check2 = hashset.add("C");
		System.out.println(check2);
		
		System.out.println(hashset);
		
		System.out.println("List contains C or not? " + hashset.contains("C"));
		
		hashset.remove("A");
		System.out.println("HashSet after removing A: " + hashset);
		
		for(String item : hashset) {
			System.out.println(item);
		}
	}
}