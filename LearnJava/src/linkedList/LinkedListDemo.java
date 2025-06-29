package linkedList;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        // This is a LinkedList example
        // It demonstrates how to create a LinkedList, add elements, and perform various operations
        // LinkedList is part of the Java Collections Framework and allows for dynamic data structures
        // It provides methods to add, remove, and access elements in a list-like structure
        
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("A");
		list.add("B");
		System.out.println("1. " + list);
		
		list.addFirst("D");
		list.addLast("C");
		System.out.println("2. " + list);
		
		list.add(2,"E");  //at specific position
		System.out.println("3. " + list);
		
		list.remove("B");
		System.out.println("4. " + list);
		
		list.remove(2);
		System.out.println("5. " + list);
		
		list.removeFirst();
		System.out.println("6. " + list);
		
		list.removeLast();
		System.out.println("7. " + list);
	}
}
