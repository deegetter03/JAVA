package basicJava;

public class nonPrimitiveDT {
    public static void main(String[] args) {
        // Non-Primitive Data Types in Java
        // String, Array, Class, Interface, etc.
        // String is a sequence of characters enclosed in double quotes
        // String is immutable, meaning once created, it cannot be changed
        // String is a class in Java, and it is used to create string objects
        // String can be created using two methods:
        // 1. Using string literal
        // 2. Using the new keyword
        // The new keyword is used to create a new string object in memory

        // method 1 to create string
        String str = "test";
        System.out.println("String is: " + str);

        // method 2 to create string
        String str1 = new String("test");
        System.out.println("Another string: " + str1);

        // array is a collection of homogeneous dataType
        int arr[];
        arr = new int[2]; // size
        arr[0] = 0;
        arr[1] = 1;
        // arr[2] = 2;

        System.out.println(arr); // prints memory location of array
        System.out.println(arr[0]);
        // System.out.println(arr[2]); //out of bound
    }
}