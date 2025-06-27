package array;

public class OneDimensionArray {
    public static void main(String[] args) {
        // One-dimensional array in Java
        // An array is a collection of elements of the same type
        // It is a data structure that can store a fixed-size sequential collection of elements of the same type.
        // Arrays in Java are objects, and they can hold primitive data types or objects.   
        // Syntax to declare an array:
        // dataType[] arrayName = new dataType[size];
		
		//int array[];	Array of ints (C-style)
		//int[] array;	Array of ints (Java-style) both syntax can be used in java
		
		int arr[] = new int[4];
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		
		System.out.println("Element at index 0: "+ arr[0]);
		System.out.println("Element at index 1: "+ arr[1]);
		System.out.println("Element at index 2: "+ arr[2]);
		System.out.println(arr[3]);
	}
}
