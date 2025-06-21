public class MultiDimensionalArray {

	public static void main(String[] args) {
        // This is a simple Java program that demonstrates the use of multi-dimensional arrays.
        // A multi-dimensional array is an array of arrays. In Java, you can create arrays with more than two dimensions.
		
		// x-axis 0,1 then y-axis 0,1 then elements in it are z-axis 3, 3 each -> {x0,y0,z0}, {x1,y1,z1}
		int arr[][][] = {{{1,2,10} , {3,4,11} } , {{5,6,12} , {7,8,12}}};
		
		System.out.println(arr[0][1][2]);

		System.out.println(arr[1][0][0]);

		System.out.println(arr[0][1][1]);

		System.out.println(arr[1][1][0]);
	}
}