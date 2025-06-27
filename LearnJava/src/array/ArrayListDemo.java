package array;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        // An ArrayList is a resizable array implementation of the List interface in Java.
        // It allows for dynamic arrays that can grow as needed.
        // Unlike arrays, ArrayLists can change their size dynamically, which means you can add or remove elements without needing to specify the size beforehand.
        // Syntax to declare an ArrayList:
        // ArrayList<Type> arrayListName = new ArrayList<Type>();
        // Example: ArrayList<Integer> arrList = new ArrayList<Integer>();

		List<Integer> arrList = new ArrayList<Integer>(5); // Initial capacity of 5

		for(int i=1; i<=5; i++) {
			arrList.add(i);
			}
		
		//Printing the element
		System.out.println(arrList);
		
		//Remove element at index 3;
		arrList.remove(3);
		
		//Displaying the ArrayList after deletion
		System.out.println(arrList);
		
		//Printing elements one by one
		for(int i=0; i<arrList.size(); i++) {
			System.out.println(arrList.get(i) + " ");
		}
		// Another Way to print
		for(int i : arrList) {
			System.out.print(i + " ");
		}
	}
}
