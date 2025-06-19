public class NonPrimitveDataTypes {

	public static void main(String[] args) {
    // Non-primitive data types in Java
    
		// method 1 to create string
		String str = "test";
		System.out.println("String is: "+ str);
		
		// method 2 to create string
		String str1 = new String("test");
		System.out.println("Another string: "+str1);
		
		// array is a collection of homogeneous dataType
		int arr[];
		arr = new int[2]; //size
		arr[0] = 0;
		arr[1] = 1;
//		arr[2] = 2;
		
		System.out.println(arr); // prints memory location of array
		System.out.println(arr[0]);
//		System.out.println(arr[2]); //out of bound
	}

}